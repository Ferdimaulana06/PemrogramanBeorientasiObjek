/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soalpraktikum10;

/**
 *
 * @author HP
 */
public class Makanan implements Pembayaran {
    @Override
    public double hitungPajak(double harga) {
        return harga * 0.05;
    }
    
    @Override
    public double hitungHargaSetelahPajak(double harga) {
        return harga + hitungPajak(harga);
    }
}