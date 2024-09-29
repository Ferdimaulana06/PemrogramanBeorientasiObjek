/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum6;

/**
 *
 * @author HP
 */
public class Main {
    public static void main (String args[]) {
        Hewan kewan = new Hewan();
        kewan.bersuara();
        
        Hewan kucing = new Kucing();
        kucing.bersuara();
        
        Kucing kitty = new Kucing();
        kitty.makan("ikan");
        kitty.makan("Ikan", 2);
        
        Anjing waung = new Anjing();
        waung.bersuara();
        waung.makan("daging", 3);
    }
}
