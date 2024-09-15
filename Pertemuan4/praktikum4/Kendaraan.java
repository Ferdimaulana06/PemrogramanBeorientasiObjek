/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4;

/**
 *
 * @author HP
 */
public class Kendaraan {
    //atribut
    private String nama;
    protected int kecepatanMaks;
    public String jenisMesin;
    
    //construktor
    public Kendaraan(String nama, int kecepatanMaks, String jenisMesin) {
        this.nama = nama;
        this.kecepatanMaks = kecepatanMaks;
        this.jenisMesin = jenisMesin;
    }
    
    public String getNama() {
        return nama;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public void infoKendaraan() {
        System.out.println("Nama mobil     : " + nama);
        System.out.println("Kecepatan maks : " + kecepatanMaks);
        System.out.println("Jenis mobil    : " + jenisMesin);
    }
}
