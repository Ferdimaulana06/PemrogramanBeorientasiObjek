/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4;

/**
 *
 * @author HP
 */
public class Praktikum_PBO4 {
    
    public static void main(String[] args) {
        Kendaraan mobil = new Kendaraan("Gajah", 100, "Turbo");
        System.out.println("Informasi Kendaraan: ");
        mobil.infoKendaraan();
        
        Mobil sikil4 = new Mobil("Lambo", 30, "Listrik", 10);
        System.out.println("\nInformasi Mobil: ");
        sikil4.infoMobil();
    }
}
