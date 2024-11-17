package com.muhammet.entity;

public class BaglantiYonetimi {

    /**
     * erişim belirteçleri, access modifier
     * private, sadece sınıf içinden erişilebilir kılar
     */
    private String connectionString;

    public String getConnectionString(String yetkiliTuru){
       if(yetkiliTuru.equalsIgnoreCase("admin"))
            return connectionString;
        System.out.println("Yetkisiz giriş");
        return "";
    }

    public void setConnectionString(String newConnectionString){
        connectionString = newConnectionString;
    }
}
