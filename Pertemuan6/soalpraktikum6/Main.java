/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soalpraktikum6;

/**
 *
 * @author HP
 */
public class Main {
   public static void main(String[] args) {
       
       //Membuat objek untuk Produk
       Buku TereLiye = new Buku("Buku TereLiye", 90000);
       Elektronik Proyektor = new Elektronik("Proyektor", 200000);
       Pakaian Zara = new Pakaian("Zara", 350000);
       
       //Membuat keranjang belanja
       KeranjangBelanja keranjang = new KeranjangBelanja();
       keranjang.tambahProduk(TereLiye);
       keranjang.tambahProduk(Proyektor);
       keranjang.tambahProduk(Zara);
       
       keranjang.tampilkanDetailPembelian();
       
    } 
}
