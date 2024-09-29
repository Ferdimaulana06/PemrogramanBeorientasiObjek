/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soalpraktikum6;

/**
 *
 * @author HP
 */
import java.util.ArrayList;
import java.util.List;

class KeranjangBelanja {
   private List<Produk> produkList;

    public KeranjangBelanja() {
        produkList = new ArrayList<>();
    }

    public void tambahProduk(Produk produk) {
        produkList.add(produk);
    }
    
    public void tampilkanDetailPembelian() {
        double totalHargaSebelumDiskon = 0;
        double totalHargaSetelahDiskon = 0;
        System.out.println("Detail Pembelian:");
        System.out.println("----------------------------");
        
        for (Produk produk : produkList) {
            double diskon = produk.hitungDiskon();
            double hargaSetelahDiskon = produk.getHarga() - diskon;
            
            System.out.println("Produk              : " + produk.getNama());
            System.out.println("Harga Awal          : Rp " + produk.getHarga());
            System.out.println("Diskon              : Rp " + diskon);
            System.out.println("Harga Setelah Diskon: Rp " + hargaSetelahDiskon);
            System.out.println("----------------------------");

            totalHargaSebelumDiskon += produk.getHarga();
            totalHargaSetelahDiskon += hargaSetelahDiskon;
        }
        
        System.out.println("Total Harga Sebelum Diskon: Rp " + totalHargaSebelumDiskon);
        System.out.println("Total Harga Setelah Diskon: Rp " + totalHargaSetelahDiskon);
    }
}
