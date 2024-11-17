package com.muhammet.entity;

public class Urun {
    private Long id;
    private String ad;
    private String marka;
    private String model;
    private String kategori;
    private Double fiyat;
    private Integer stokAdedi;
    private Integer kdv;

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Urun{");
        sb.append("id=").append(id);
        sb.append(", ad='").append(ad).append('\'');
        sb.append(", marka='").append(marka).append('\'');
        sb.append(", model='").append(model).append('\'');
        sb.append(", kategori='").append(kategori).append('\'');
        sb.append(", fiyat=").append(fiyat);
        sb.append(", stokAdedi=").append(stokAdedi);
        sb.append(", kdv=").append(kdv);
        sb.append('}');
        return sb.toString();
    }

    public Urun() {
    }

    public Urun(Long id, String ad, String marka,
                String model, String kategori,
                Double fiyat, Integer stokAdedi, Integer kdv) {
        this.id = id;
        this.ad = ad;
        this.marka = marka;
        this.model = model;
        this.kategori = kategori;
        this.fiyat = fiyat;
        this.stokAdedi = stokAdedi;
        this.kdv = kdv;
    }

    /**
     * POJO -> Plain Old Java Object
     *
     */



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public Double getFiyat() {
        return fiyat;
    }

    public void setFiyat(Double fiyat) {
        this.fiyat = fiyat;
    }

    public Integer getStokAdedi() {
        return stokAdedi;
    }

    public void setStokAdedi(Integer stokAdedi) {
        this.stokAdedi = stokAdedi;
    }

    public Integer getKdv() {
        return kdv;
    }

    public void setKdv(Integer kdv) {
        this.kdv = kdv;
    }
}
