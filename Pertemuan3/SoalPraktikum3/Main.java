/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SoalPraktikum3;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {
        Mobil Honda = new Mobil("Honda","Suzuki",2000,"Hitam");
        Mobil Tesla = new Mobil("Tesla","Pro",2020,"Putih");
        
        Honda.displayInfo();
        Tesla.displayInfo();
        
        Honda.startEngine();
        Tesla.startEngine();
        
        Honda.setWarna("Hijau");
        Honda.displayInfo();
    } 
}
