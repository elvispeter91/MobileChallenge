package com.currency;

import android.app.Activity;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.Spinner;

import android.widget.Toast;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class MainActivity extends Activity implements Communicator {

    EditText amount;
    Double amtValue;
    GridView gridView;
    GridAdapter gridAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        amount = (EditText) findViewById(R.id.amt);
        final Spinner spinner = (Spinner) findViewById(R.id.spinner);
        gridView = (GridView)findViewById(R.id.RateGrid);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.Country_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, final int position, long id) {

              new GetExchangeRate(MainActivity.this).execute(parent.getItemAtPosition(position).toString());

                if(!TextUtils.isEmpty(amount.getText()) && amount.getText()!=null){
                   amtValue = Double.valueOf(amount.getText().toString());
                    Log.d("entr val",""+amtValue);
                }
                /*ScheduledExecutorService executor =
                        Executors.newSingleThreadScheduledExecutor();

                Runnable periodicTask = new Runnable() {
                    public void run() {
                        // Invoke method(s) to do the work
                        new GetExchangeRate(MainActivity.this).execute(spinnerValue.getList().get(position));
                    }
                };

                executor.scheduleAtFixedRate(periodicTask, 0, 10, TimeUnit.SECONDS);*/
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    @Override
    public void onTaskFinish(ExchangeRate data) {
        Log.d("rate value",data.getRates().toString());
        if(!TextUtils.isEmpty(amount.getText()) && amount.getText()!=null){
        gridAdapter = new GridAdapter(amtValue,data,this);
        gridAdapter.notifyDataSetChanged();
            }
        gridView.setAdapter(gridAdapter);
    }
}

