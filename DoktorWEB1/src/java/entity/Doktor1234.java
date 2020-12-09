/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author lenovo
 */
public class Doktor1234 {
     private int id;
    private String adi;
    private String soyadi;
    private int yasi;

    public Doktor1234() {
    }

    public Doktor1234(int id, String adi, String soyadi, int yasi) {
        this.id = id;
        this.adi = adi;
        this.soyadi = soyadi;
        this.yasi = yasi;
    }

    
    
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getSoyadi() {
        return soyadi;
    }

    public void setSoyadi(String soyadi) {
        this.soyadi = soyadi;
    }

    public int getYasi() {
        return yasi;
    }

    public void setYasi(int yasi) {
        this.yasi = yasi;
    }
    
    
    
     
}
