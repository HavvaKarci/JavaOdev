package OdevJava;

import java.util.ArrayList;
import java.util.Arrays;


public class Kitap {
    String kisilerListesi;

    void KisiOlusturma(){

        Kisiler kisi1 = new Kisiler("Mehmet Can Seyhan" , 28 , "isvec");
        Kisiler kisi2 = new Kisiler("Emre " , 29 , " Turkiye");
        Kisiler kisi3 = new Kisiler("Havva " , 43 ,"Kazakistan" );
        Kisiler kisi4 = new Kisiler("Davud " , 5 ,"Polonya" );
        Kisiler kisi5 = new Kisiler("Aybike " , 21 ,"Amerika" );

        ArrayList<Kisiler> kisilerListesi = new ArrayList<Kisiler>(Arrays.asList(kisi1, kisi2, kisi3, kisi4,kisi5));

        System.out.println(kisilerListesi.toString());

        for (Kisiler kisi:kisilerListesi) {
            System.out.println(kisi.toString());
        }


    }
}
