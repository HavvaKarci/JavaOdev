package OdevJava;

import java.util.ArrayList;
public class Kisiler {
    private String ad;
    private int yas;
    private String ulke;
    public Kisiler(String ad, int yas, String ulke) {
        this.ad = ad;
        this.yas = yas;
        this.ulke = ulke;
    }
    @Override
    public String toString(){
        return " Kisiler {" +
                "ad ='" + ad + '\'' +
                ", yas=" + yas +
                "ulke='" + ulke + '\'' +
                '}' ;
    }
    public String getAd(){
        return ad;
    }
    public void setAd(String ad) {
        this.ad = ad;
    }

    public int getYas()
    {
        return yas;
    }
    public void setYas(int yas)
    {
        this.yas = yas;
    }

    public String getUlke(){
        return ulke;
    }
    public void setUlke(String ulke) {
        this.ulke = ulke;
    }



}
