/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum3;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {
        Hewan kucing = new Hewan("Mimi", 3);
        System.out.println("\nKucing");
        kucing.suara();
        kucing.info();
        kucing.lari();
        
        System.out.println("\nAnjing");
        Hewan anjing = new Hewan("Budi", 5);
        anjing.suara();
        anjing.info();
        anjing.lari();
    }
}
