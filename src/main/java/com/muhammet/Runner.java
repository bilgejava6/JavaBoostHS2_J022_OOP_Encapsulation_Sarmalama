package com.muhammet;

import com.muhammet.entity.BaglantiYonetimi;

public class Runner {
    public static void main(String[] args) {
        /**
         * Encapsulation - Sarmalama
         *
         *
         */
        BaglantiYonetimi by = new BaglantiYonetimi();
        String[] adresler = {"Ankara", "İzmir", "İstanbul"};
        String ifade = "";
        by.setConnectionString("İzmir");
        String adres = by.getConnectionString("user");
        System.out.println("gelen adres...: "+ adres);
//        int dongu = 0;
//        do{
//            //by.connectionString = adresler[dongu++];
//            by.setConnectionString(adresler[dongu++]);
//            if(dongu == adresler.length) dongu = 0;
//            System.out.println("bağlantı adresi....: "+by.getConnectionString().toUpperCase());
//        }while (true);
    }
}