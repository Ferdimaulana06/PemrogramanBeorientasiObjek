/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soalpraktikum5;

/**
 *
 * @author HP
 */
public class Main {
    public static void main(String[] args) {
        Anjing billy = new Anjing();
        billy.nama = "Billy";
        billy.jenis = "Bulldog";
        billy.jumlahKaki = 4;
        billy.suara = "Woof - Woof";
        System.out.println("Informasi Anjing");
        billy.tampilkanInfo();
        
        Kucing kimo = new Kucing();
        kimo.nama = "Kimo";
        kimo.jenis = "Persia";
        kimo.jumlahKaki = 4;
        kimo.suara = "Meow - Meow";
        System.out.println("\nInformasi Kucing");
        kimo.tampilkanInfo();
    }
}
