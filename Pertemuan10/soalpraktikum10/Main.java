/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soalpraktikum10;

/**
 *
 * @author HP
 */
public class Main {
    public static void main(String[] args) {
        //Objek Elektronik
        Pembayaran elektronik = new Elektronik();
        double hargaElektronik = 120000;
        System.out.println("Harga elektronik: " + hargaElektronik);
        System.out.println("Pajak elektronik: " + elektronik.hitungPajak(hargaElektronik));
        System.out.println("Harga setelah pajak: " + elektronik.hitungHargaSetelahPajak(hargaElektronik));
        
        //Objek Makanan
        Pembayaran makanan = new Makanan();
        double hargaMakanan = 20000;
        System.out.println("\nHarga makanan: " + hargaMakanan);
        System.out.println("Pajak makanan: " + makanan.hitungPajak(hargaMakanan));
        System.out.println("Harga setelah pajak: " + makanan.hitungHargaSetelahPajak(hargaMakanan));
    }
}
