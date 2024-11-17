package com.muhammet.entity;

import java.util.UUID;

public class Satis {
    /**
     * 8-10 adet özellik
     * getter, setter,
     * default constructor
     * paraetreli constructor
     * toString()
     */
    private UUID id;
    private String musteriAdi;
    private String personelAdi;
    private String urunAdi;
    private Double fiyat;
    private Integer adet;
    private Double toplamFiyat;
    private Long satisTarihi;

    public Satis() {
    }

    public Satis(Integer adet, Double fiyat, String urunAdi, String personelAdi, String musteriAdi) {
        this.id = UUID.randomUUID(); // rast gele id üretiyor.
        this.adet = adet;
        this.fiyat = fiyat;
        this.urunAdi = urunAdi;
        this.personelAdi = personelAdi;
        this.musteriAdi = musteriAdi;
        this.toplamFiyat = fiyat * adet; // biz hesaplıyoruz
        this.satisTarihi = System.currentTimeMillis(); // şuan ki zamanı ms olarak verir.
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Satis{");
        sb.append("id=").append(id);
        sb.append(", musteriAdi='").append(musteriAdi).append('\'');
        sb.append(", personelAdi='").append(personelAdi).append('\'');
        sb.append(", urunAdi='").append(urunAdi).append('\'');
        sb.append(", fiyat=").append(fiyat);
        sb.append(", adet=").append(adet);
        sb.append(", toplamFiyat=").append(toplamFiyat);
        sb.append(", satisTarihi=").append(satisTarihi);
        sb.append('}');
        return sb.toString();
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getMusteriAdi() {
        return musteriAdi;
    }

    public void setMusteriAdi(String musteriAdi) {
        this.musteriAdi = musteriAdi;
    }

    public String getPersonelAdi() {
        return personelAdi;
    }

    public void setPersonelAdi(String personelAdi) {
        this.personelAdi = personelAdi;
    }

    public String getUrunAdi() {
        return urunAdi;
    }

    public void setUrunAdi(String urunAdi) {
        this.urunAdi = urunAdi;
    }

    public Double getFiyat() {
        return fiyat;
    }

    public void setFiyat(Double fiyat) {
        this.fiyat = fiyat;
        toplamFiyat = fiyat * adet;
    }

    public Integer getAdet() {
        return adet;
    }

    public void setAdet(Integer adet) {
        this.adet = adet;
        toplamFiyat = adet * fiyat;
    }

    public Double getToplamFiyat() {
        return toplamFiyat;
    }


    public Long getSatisTarihi() {
        return satisTarihi;
    }

    public void setSatisTarihi(Long satisTarihi) {
        this.satisTarihi = satisTarihi;
    }
}
