package com.muhammet;

import com.muhammet.entity.Satis;

public class Runner_Satis {

    public static void main(String[] args) {
        Satis satis =
                new Satis(2,45_000d,"İntel i9 İşlemci",
                        "Canan","Kenan");
        satis.setAdet(4);

        System.out.println(satis);
    }
}
