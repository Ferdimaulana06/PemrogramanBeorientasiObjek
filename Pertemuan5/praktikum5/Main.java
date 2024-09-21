/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum5;

/**
 *
 * @author HP
 */
public class Main {
    public static void main(String[] args) {
        Mobil supra = new Mobil();
        supra.nama = "Supra";
        supra.kecepatan = 200;
        supra.jumlahPintu = 2;
        supra.tampilkanInfo();
        
        SepedaMotor ninja = new SepedaMotor();
        ninja.nama = "Kawasaki";
        ninja.kecepatan = 160;
        ninja.jenisMesin = "Turbo";
        ninja.tampilkanInfo();
    }
}
