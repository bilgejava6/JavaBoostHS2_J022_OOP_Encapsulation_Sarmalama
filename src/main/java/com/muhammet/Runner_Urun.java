package com.muhammet;

import com.muhammet.entity.Urun;

public class Runner_Urun {
    public static void main(String[] args) {
        Urun urun = new Urun();
        Urun urun2 = new Urun(1L,"Asus Anakar","Asus",
                "i9","Bilgisayar",6_999d,5,18);
        System.out.println("ürün......: "+ urun2);
        /**
         * DİKKAT!!!!!
         * bir nesnenin kendisi yazdırılmak istenildiğinde, bu bilgiyi dönen bir method vardır
         * bu methodun adı toString() methodu dur. Eğer mu method tanımlı değil ise
         * ilgili sınıfın adresini döner. Ancak siz bunu kendiniz yazarak sınıf ile ilgili
         * bilgileri dönmesini sağlayabilirsiniz.
         */
    }
}
