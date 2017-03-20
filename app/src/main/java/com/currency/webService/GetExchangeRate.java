package com.currency.webService;

import android.app.Activity;
import android.os.AsyncTask;
import android.util.Log;

import com.currency.appInterface.Communicator;
import com.currency.pojo.ExchangeRate;
import com.google.gson.Gson;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.json.JSONException;
import org.json.JSONObject;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.HashMap;

/**
 * Created by Elvis Peter on 2017-03-16.
 */

public class GetExchangeRate extends AsyncTask<String,ExchangeRate,ExchangeRate> {

    private Communicator communicator;

    public GetExchangeRate(Activity activity){
        communicator = (Communicator) activity;
    }

    @Override
    public ExchangeRate doInBackground(String... params) {

        Log.d("param", params[0].toString());
        String SERVER_URL = "http://api.fixer.io/latest?base="+params[0].toString();
        String result=null;
        JSONObject obj = null;
        HttpClient client = new DefaultHttpClient();
        HttpGet request = new HttpGet(String.format(String.format(SERVER_URL)));
        try {
            HttpResponse getResponse = client.execute(request);
            HttpEntity getResponseEntity = getResponse.getEntity();
            result = EntityUtils.toString(getResponseEntity);
            Log.d("HIT:",result);

        } catch (IOException e) {
            e.printStackTrace();
        }

        try {

            obj = new JSONObject(result);
            Log.d("My App", obj.toString());

        } catch (Throwable t) {
            Log.e("My App", "Could not parse malformed JSON: \"" + result + "\"");
        }
        Gson gson = new Gson();
        ExchangeRate exchangeRate= new ExchangeRate();
        try {
            exchangeRate.setBase(obj.getString("base"));
            exchangeRate.setDate(obj.getString("date"));
            JSONObject rate1 = obj.getJSONObject("rates");
            try {
                HashMap<String,Double> rateValue =  new ObjectMapper().readValue(String.valueOf(rate1), HashMap.class);
                exchangeRate.setRates(rateValue);
                Log.d("rate value1",exchangeRate.getRates().toString());
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return exchangeRate;
    }

    @Override
    protected void onPostExecute(ExchangeRate exchangeRate) {
        super.onPostExecute(exchangeRate);
        if(exchangeRate != null)
        {
//            Log.d("ans",exchangeRate.getBase());
            communicator.onTaskFinish(exchangeRate);
        }

    }


}
