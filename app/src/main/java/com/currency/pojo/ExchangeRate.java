

package com.currency.pojo;
import java.io.Serializable;
import java.util.HashMap;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ExchangeRate implements Serializable, Parcelable
{

    @SerializedName("base")
    @Expose
    private String base;
    @SerializedName("date")
    @Expose
    private String date;




    @SerializedName("rates")

    private  HashMap<String ,Double> rates = new HashMap<String, Double>();

    public final static Parcelable.Creator<ExchangeRate> CREATOR = new Creator<ExchangeRate>() {


        @SuppressWarnings({
                "unchecked"
        })
        public ExchangeRate createFromParcel(Parcel in) {
            ExchangeRate instance = new ExchangeRate();
            instance.base = ((String) in.readValue((String.class.getClassLoader())));
            instance.date = ((String) in.readValue((String.class.getClassLoader())));
            instance.rates = ((HashMap<String, Double>) in.readValue((HashMap.class.getClassLoader())));
            return instance;
        }

        public ExchangeRate[] newArray(int size) {
            return (new ExchangeRate[size]);
        }

    }
            ;
    private final static long serialVersionUID = -7796844954836671148L;

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public HashMap<String, Double> getRates() {
        return rates;
    }

    public void setRates(HashMap<String, Double> rates) {
        this.rates = rates;
    }


    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(base);
        dest.writeValue(date);
        dest.writeValue(rates);
    }

    public int describeContents() {
        return 0;
    }



}