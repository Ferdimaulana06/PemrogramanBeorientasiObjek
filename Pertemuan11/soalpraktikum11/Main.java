/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soalpraktikum11;

/**
 *
 * @author HP
 */
public class Main {
    public static void main(String[] args) {

        //Objek Pengarang
        Pengarang pengarang1 = new Pengarang("Ferdi Maulana");
        Pengarang pengarang2 = new Pengarang("Maulana Ikhsan");
        
        //Objek Buku, agregasi ke pengarang
        Buku buku1 = new Buku("Ipa", pengarang1);
        Buku buku2 = new Buku("Ips", pengarang2);
        Buku buku3 = new Buku("Jawa", pengarang1);
        
        //Objek Perpustakaan
        Perpustakaan perpustakaan = new Perpustakaan();
        
        perpustakaan.tambahBuku(buku1);
        perpustakaan.tambahBuku(buku2);
        perpustakaan.tambahBuku(buku3);
        
        perpustakaan.infoPerpustakaan();
    }
}
