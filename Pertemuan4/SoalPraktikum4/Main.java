/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SoalPraktikum4;

/**
 *
 * @author HP
 */
public class Main {
    public static void main(String[] args) {
      Pekerja Yanto = new Pekerja("Yanto",20,"Kuli Tower",100000000);
        
      System.out.println("Informasi Pekerja:");
      System.out.println(Yanto.toString());
        
      Yanto.setNama("Faiz");
      System.out.println("\n Informasi setelah diperbarui:");
      System.out.println(Yanto.toString());
        
      //Mengakses langsung atribut
      //System.out.println("Nama: " + Yanto.nama); Error karena private
      //System.out.println("Usia: " + Yanto.usia); Error karena protected
      //System.out.println("Gaji: " + Yanto.gaji); Error karena private
    }

}
