/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soalpraktikum12;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SistemManajemenBuku {
    private static final String TEXT_FILE = "buku.txt";
    private static final String SERIAL_FILE = "buku.ser";
    private static List<Buku> bukuList = new ArrayList<>();
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Buku Baru");
            System.out.println("2. Simpan ke File Teks");
            System.out.println("3. Simpan Objek ke File (Serialisasi)");
            System.out.println("4. Tampilkan Daftar Buku");
            System.out.println("5. Keluar");
            System.out.print("Pilihan: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();
            
            switch (pilihan) {
                case 1 -> tambahBuku(scanner);
                case 2 -> simpanKeFileTeks();
                case 3 -> simpanKeFileSerial();
                case 4 -> tampilkanBuku();
                case 5 -> {
                    System.out.println("Keluar dari sistem.");
                    scanner.close();
                    return;
                }
                default -> System.out.println("Pilihan tidak valid.");
            }
        }
    }
    
    private static void tambahBuku(Scanner scanner) {
        System.out.print("Masukkan judul buku: ");
        String judul = scanner.nextLine();
        System.out.println("Masukkan pengarang: ");
        String pengarang = scanner.nextLine();
        System.out.print("Masukkan tahun terbit: ");
        int tahunTerbit = scanner.nextInt();
        
        bukuList.add(new Buku(judul, pengarang, tahunTerbit));
        System.out.println("Buku berhasil ditambahkan.");
    }
    
    private static void simpanKeFileTeks() {
        try (FileWriter writer = new FileWriter(TEXT_FILE)) {
            for (Buku buku : bukuList) {
                writer.write(buku.toString() + "\n");
            }
            System.out.println("Data buku berhasil disimpan ke file teks.");
        }
        catch (IOException e) {
            System.out.println("Terjadi kesalahan saat menyimpan ke file teks.");
            e.printStackTrace();
        }
    }
    
    private static void simpanKeFileSerial() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(SERIAL_FILE))) {
            oos.writeObject(bukuList);
            System.out.println("Objek buku berhasil disimpan ke file serial.");
        }
        catch (IOException e) {
            System.out.println("Terjadi kesalahan saat menyimpan ke file serial.");
            e.printStackTrace();
        }
    }
    
    private static void tampilkanBuku() {
        System.out.println("Daftar Buku (Dari List):");
        for (Buku buku : bukuList) {
            System.out.println(buku);
        }
        
        System.out.println("\nDaftar buku (Dari File Teks):");
        try (BufferedReader reader = new BufferedReader(new FileReader(TEXT_FILE))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        }
        catch (IOException e) {
            System.out.println("Tidak dapat membaca file teks.");
        }
        
        System.out.println("\nDaftar Buku (Dari File Serialiasasi:");
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(SERIAL_FILE))) {
            List<Buku> bukuDariFile = (List<Buku>) ois.readObject();
            for (Buku buku : bukuDariFile) {
                System.out.println(buku);
            }
        }
        catch (IOException | ClassNotFoundException e) {
            System.out.println("Tidak dapat membaca file serialisasi.");
        }
    }
}
