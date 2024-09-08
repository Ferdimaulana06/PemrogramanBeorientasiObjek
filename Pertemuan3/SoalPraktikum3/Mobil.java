/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SoalPraktikum3;

/**
 *
 * @author ASUS
 */
public class Mobil {
    String merk;
    String model;
    int tahun;
    String warna;
    
    Mobil(String merk, String model, int tahun, String warna) {
        this.merk = merk;
        this.model = model;
        this.tahun = tahun;
        this.warna = warna;
    }
    
    String getMerk() {
        return merk;
    }
    
    public void setMerk(String merk) {
        this.merk = merk;
    }
    
    String getModel() {
        return model;
    }
    
    public void setModel(String model) {
        this.model = model;
    }
    
    int getTahun() {
        return tahun;
    }
    
    public void setTahun(int tahun) {
        this.tahun = tahun;
    }
    
    String getWarna() {
        return warna;
    }
    
    public void setWarna(String warna) {
        this.warna = warna;
    }
    
    void displayInfo() {
        System.out.println("Info mobil: " + getMerk() + " " + getModel() + " " + getTahun() + " " + getWarna());
    }
    
    void startEngine() {
        System.out.println("Mesin mobil " + getMerk() + " menyala");
    }
    
}
