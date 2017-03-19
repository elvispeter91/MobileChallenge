package com.currency;

/**
 * Created by Elvis Peter on 2017-03-15.
 */

import java.io.Serializable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Rates implements Serializable, Parcelable
{

    @SerializedName("AUD")
    @Expose
    private Double aUD;
    @SerializedName("BGN")
    @Expose
    private Double bGN;
    @SerializedName("BRL")
    @Expose
    private Double bRL;
    @SerializedName("CAD")
    @Expose
    private Double cAD;
    @SerializedName("CHF")
    @Expose
    private Double cHF;
    @SerializedName("CNY")
    @Expose
    private Double cNY;
    @SerializedName("CZK")
    @Expose
    private Double cZK;
    @SerializedName("DKK")
    @Expose
    private Double dKK;
    @SerializedName("GBP")
    @Expose
    private Double gBP;
    @SerializedName("HKD")
    @Expose
    private Double hKD;
    @SerializedName("HRK")
    @Expose
    private Double hRK;
    @SerializedName("HUF")
    @Expose
    private Double hUF;
    @SerializedName("IDR")
    @Expose
    private Double iDR;
    @SerializedName("ILS")
    @Expose
    private Double iLS;
    @SerializedName("INR")
    @Expose
    private Double iNR;
    @SerializedName("JPY")
    @Expose
    private Double jPY;
    @SerializedName("KRW")
    @Expose
    private Double kRW;
    @SerializedName("MXN")
    @Expose
    private Double mXN;
    @SerializedName("MYR")
    @Expose
    private Double mYR;
    @SerializedName("NOK")
    @Expose
    private Double nOK;
    @SerializedName("NZD")
    @Expose
    private Double nZD;
    @SerializedName("PHP")
    @Expose
    private Double pHP;
    @SerializedName("PLN")
    @Expose
    private Double pLN;
    @SerializedName("RON")
    @Expose
    private Double rON;
    @SerializedName("RUB")
    @Expose
    private Double rUB;
    @SerializedName("SEK")
    @Expose
    private Double sEK;
    @SerializedName("SGD")
    @Expose
    private Double sGD;
    @SerializedName("THB")
    @Expose
    private Double tHB;
    @SerializedName("TRY")
    @Expose
    private Double tRY;
    @SerializedName("ZAR")
    @Expose
    private Double zAR;
    @SerializedName("EUR")
    @Expose
    private Double eUR;
    public final static Parcelable.Creator<Rates> CREATOR = new Creator<Rates>() {


        @SuppressWarnings({
                "unchecked"
        })
        public Rates createFromParcel(Parcel in) {
            Rates instance = new Rates();
            instance.aUD = ((Double) in.readValue((Double.class.getClassLoader())));
            instance.bGN = ((Double) in.readValue((Double.class.getClassLoader())));
            instance.bRL = ((Double) in.readValue((Double.class.getClassLoader())));
            instance.cAD = ((Double) in.readValue((Double.class.getClassLoader())));
            instance.cHF = ((Double) in.readValue((Double.class.getClassLoader())));
            instance.cNY = ((Double) in.readValue((Double.class.getClassLoader())));
            instance.cZK = ((Double) in.readValue((Double.class.getClassLoader())));
            instance.dKK = ((Double) in.readValue((Double.class.getClassLoader())));
            instance.gBP = ((Double) in.readValue((Double.class.getClassLoader())));
            instance.hKD = ((Double) in.readValue((Double.class.getClassLoader())));
            instance.hRK = ((Double) in.readValue((Double.class.getClassLoader())));
            instance.hUF = ((Double) in.readValue((Double.class.getClassLoader())));
            instance.iDR = ((Double) in.readValue((Double.class.getClassLoader())));
            instance.iLS = ((Double) in.readValue((Double.class.getClassLoader())));
            instance.iNR = ((Double) in.readValue((Double.class.getClassLoader())));
            instance.jPY = ((Double) in.readValue((Double.class.getClassLoader())));
            instance.kRW = ((Double) in.readValue((Double.class.getClassLoader())));
            instance.mXN = ((Double) in.readValue((Double.class.getClassLoader())));
            instance.mYR = ((Double) in.readValue((Double.class.getClassLoader())));
            instance.nOK = ((Double) in.readValue((Double.class.getClassLoader())));
            instance.nZD = ((Double) in.readValue((Double.class.getClassLoader())));
            instance.pHP = ((Double) in.readValue((Double.class.getClassLoader())));
            instance.pLN = ((Double) in.readValue((Double.class.getClassLoader())));
            instance.rON = ((Double) in.readValue((Double.class.getClassLoader())));
            instance.rUB = ((Double) in.readValue((Double.class.getClassLoader())));
            instance.sEK = ((Double) in.readValue((Double.class.getClassLoader())));
            instance.sGD = ((Double) in.readValue((Double.class.getClassLoader())));
            instance.tHB = ((Double) in.readValue((Double.class.getClassLoader())));
            instance.tRY = ((Double) in.readValue((Double.class.getClassLoader())));
            instance.zAR = ((Double) in.readValue((Double.class.getClassLoader())));
            instance.eUR = ((Double) in.readValue((Double.class.getClassLoader())));
            return instance;
        }

        public Rates[] newArray(int size) {
            return (new Rates[size]);
        }

    }
            ;
    private final static long serialVersionUID = 1431769744748577797L;

    public Double getAUD() {
        return aUD;
    }

    public void setAUD(Double aUD) {
        this.aUD = aUD;
    }

    public Double getBGN() {
        return bGN;
    }

    public void setBGN(Double bGN) {
        this.bGN = bGN;
    }

    public Double getBRL() {
        return bRL;
    }

    public void setBRL(Double bRL) {
        this.bRL = bRL;
    }

    public Double getCAD() {
        return cAD;
    }

    public void setCAD(Double cAD) {
        this.cAD = cAD;
    }

    public Double getCHF() {
        return cHF;
    }

    public void setCHF(Double cHF) {
        this.cHF = cHF;
    }

    public Double getCNY() {
        return cNY;
    }

    public void setCNY(Double cNY) {
        this.cNY = cNY;
    }

    public Double getCZK() {
        return cZK;
    }

    public void setCZK(Double cZK) {
        this.cZK = cZK;
    }

    public Double getDKK() {
        return dKK;
    }

    public void setDKK(Double dKK) {
        this.dKK = dKK;
    }

    public Double getGBP() {
        return gBP;
    }

    public void setGBP(Double gBP) {
        this.gBP = gBP;
    }

    public Double getHKD() {
        return hKD;
    }

    public void setHKD(Double hKD) {
        this.hKD = hKD;
    }

    public Double getHRK() {
        return hRK;
    }

    public void setHRK(Double hRK) {
        this.hRK = hRK;
    }

    public Double getHUF() {
        return hUF;
    }

    public void setHUF(Double hUF) {
        this.hUF = hUF;
    }

    public Double getIDR() {
        return iDR;
    }

    public void setIDR(Double iDR) {
        this.iDR = iDR;
    }

    public Double getILS() {
        return iLS;
    }

    public void setILS(Double iLS) {
        this.iLS = iLS;
    }

    public Double getINR() {
        return iNR;
    }

    public void setINR(Double iNR) {
        this.iNR = iNR;
    }

    public Double getJPY() {
        return jPY;
    }

    public void setJPY(Double jPY) {
        this.jPY = jPY;
    }

    public Double getKRW() {
        return kRW;
    }

    public void setKRW(Double kRW) {
        this.kRW = kRW;
    }

    public Double getMXN() {
        return mXN;
    }

    public void setMXN(Double mXN) {
        this.mXN = mXN;
    }

    public Double getMYR() {
        return mYR;
    }

    public void setMYR(Double mYR) {
        this.mYR = mYR;
    }

    public Double getNOK() {
        return nOK;
    }

    public void setNOK(Double nOK) {
        this.nOK = nOK;
    }

    public Double getNZD() {
        return nZD;
    }

    public void setNZD(Double nZD) {
        this.nZD = nZD;
    }

    public Double getPHP() {
        return pHP;
    }

    public void setPHP(Double pHP) {
        this.pHP = pHP;
    }

    public Double getPLN() {
        return pLN;
    }

    public void setPLN(Double pLN) {
        this.pLN = pLN;
    }

    public Double getRON() {
        return rON;
    }

    public void setRON(Double rON) {
        this.rON = rON;
    }

    public Double getRUB() {
        return rUB;
    }

    public void setRUB(Double rUB) {
        this.rUB = rUB;
    }

    public Double getSEK() {
        return sEK;
    }

    public void setSEK(Double sEK) {
        this.sEK = sEK;
    }

    public Double getSGD() {
        return sGD;
    }

    public void setSGD(Double sGD) {
        this.sGD = sGD;
    }

    public Double getTHB() {
        return tHB;
    }

    public void setTHB(Double tHB) {
        this.tHB = tHB;
    }

    public Double getTRY() {
        return tRY;
    }

    public void setTRY(Double tRY) {
        this.tRY = tRY;
    }

    public Double getZAR() {
        return zAR;
    }

    public void setZAR(Double zAR) {
        this.zAR = zAR;
    }

    public Double getEUR() {
        return eUR;
    }

    public void setEUR(Double eUR) {
        this.eUR = eUR;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(aUD);
        dest.writeValue(bGN);
        dest.writeValue(bRL);
        dest.writeValue(cAD);
        dest.writeValue(cHF);
        dest.writeValue(cNY);
        dest.writeValue(cZK);
        dest.writeValue(dKK);
        dest.writeValue(gBP);
        dest.writeValue(hKD);
        dest.writeValue(hRK);
        dest.writeValue(hUF);
        dest.writeValue(iDR);
        dest.writeValue(iLS);
        dest.writeValue(iNR);
        dest.writeValue(jPY);
        dest.writeValue(kRW);
        dest.writeValue(mXN);
        dest.writeValue(mYR);
        dest.writeValue(nOK);
        dest.writeValue(nZD);
        dest.writeValue(pHP);
        dest.writeValue(pLN);
        dest.writeValue(rON);
        dest.writeValue(rUB);
        dest.writeValue(sEK);
        dest.writeValue(sGD);
        dest.writeValue(tHB);
        dest.writeValue(tRY);
        dest.writeValue(zAR);
        dest.writeValue(eUR);
    }

    public int describeContents() {
        return 0;
    }

}