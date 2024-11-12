/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum11;

/**
 *
 * @author HP
 */
public class Main {
    public static void main(String[] args) {
        //Komposisi perpustakaan dengan buku
        Perpustakaan perpustakaan = new Perpustakaan();
        
        Buku buku1 = new Buku("Ipa");
        Buku buku2 = new Buku("Ips");
        Buku buku3 = new Buku("Bahasa Jawa");
        
        perpustakaan.tambahBuku(buku1);
        perpustakaan.tambahBuku(buku2);
        perpustakaan.tambahBuku(buku3);
        
        System.out.println("Informasi Perpustakaan:");
        perpustakaan.infoPerpustakaan();
        
        //Agregasi klub dengan anggota
        Klub klubBola = new Klub("Klub Bola");
        
        Anggota anggota1 = new Anggota("Ferdi");
        Anggota anggota2 = new Anggota("Maulana");
        Anggota anggota3 = new Anggota("Ikhsan");
        
        klubBola.tambahAnggota(anggota1);
        klubBola.tambahAnggota(anggota2);
        klubBola.tambahAnggota(anggota3);
        
        System.out.println("\nInformasi Klub Bola:");
        klubBola.infoKlub();
    }
}
