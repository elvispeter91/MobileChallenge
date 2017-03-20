package com.currency.adapters;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.currency.R;
import com.currency.pojo.ExchangeRate;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Elvis Peter on 2017-03-16.
 */

public class GridAdapter extends BaseAdapter {

    Double amt;
    ExchangeRate exchangeRate;
    Context context;
    List<String> key;
    ArrayList<Double>valueArray;
    private static DecimalFormat REAL_FORMATTER = new DecimalFormat("0.###");

    public GridAdapter(Double amt,ExchangeRate exchangeRate,Context context) {
        this.amt = amt;
        this.exchangeRate = exchangeRate;
        key = new ArrayList<String>(exchangeRate.getRates().keySet());
        valueArray = new ArrayList<Double>(exchangeRate.getRates().values());
        Log.d("k", key.toString());
        Log.d("vAL", valueArray.toString());
        this.context = context;
    }

    @Override
    public int getCount() {return key.size();
    }

    @Override
    public Object getItem(int position) {
        return key.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Holder holder;
        Log.d("gv", "in");
        if(convertView == null){
            holder=new Holder();
            convertView = LayoutInflater.from(context).inflate(R.layout.grid_layout, null);
            holder.name=(TextView) convertView.findViewById(R.id.country);
            holder.rate=(TextView) convertView.findViewById(R.id.eValue);
            convertView.setTag(holder);}
        else {
        holder=(Holder) convertView.getTag();
        }
        Log.d("amt", ""+amt);
        holder.name.setText(key.get(position));
        if(valueArray.get(position) instanceof Double) {
            holder.rate.setText(REAL_FORMATTER.format(valueArray.get(position) * amt).toString());
        }else{
            String num = String.valueOf(valueArray.get(position));
            double toto = Double.parseDouble(num) * amt;
            holder.rate.setText(""+toto);
        }
        return convertView;
    }

    public class Holder
    {
        TextView name;
        TextView rate;
    }
}
