/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package task6zakatmaal;

import java.util.ArrayList;
/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {
        // Membuat daftar pembayar zakat dengan jumlah harta yang diperbarui
        ArrayList<PembayarZakat> daftarPembayarZakat = new ArrayList<>();
        daftarPembayarZakat.add(new PembayarZakat("Muhammad Yoga", 33000000));  // 33 juta
        daftarPembayarZakat.add(new PembayarZakat("Atta Halilintar", 14000000)); // 14 juta
        daftarPembayarZakat.add(new PembayarZakat("Aditya Viko", 88000000));     // 88 juta

        // Membuat daftar penerima zakat
        ArrayList<PenerimaZakat> daftarPenerimaZakat = new ArrayList<>();
        daftarPenerimaZakat.add(new PenerimaZakat("mohammad Ali"));
        daftarPenerimaZakat.add(new PenerimaZakat("fskhlia tika angela"));
        daftarPenerimaZakat.add(new PenerimaZakat("Fahmi nur rasyid"));

        // Menampilkan informasi awal pembayar zakat dan penerima zakat
        System.out.println("Informasi Pembayar Zakat Sebelum Zakat Dibagikan:");
        for (PembayarZakat pembayarZakat : daftarPembayarZakat) {
            pembayarZakat.tampilkanInformasi();
            System.out.println();
        }

        System.out.println("Informasi Penerima Zakat Sebelum Menerima Zakat:");
        for (PenerimaZakat penerimaZakat : daftarPenerimaZakat) {
            penerimaZakat.tampilkanInformasi();
            System.out.println();
        }

        // Pembagian zakat dari setiap pembayar zakat kepada penerima zakat (dibagi rata)
        System.out.println("Pembagian Zakat:");
        for (PembayarZakat pembayarZakat : daftarPembayarZakat) {
            double zakatPerPenerima = pembayarZakat.getZakat() / daftarPenerimaZakat.size();
            for (PenerimaZakat penerimaZakat : daftarPenerimaZakat) {
                penerimaZakat.terimaZakat(zakatPerPenerima);
            }
        }

        // Menampilkan informasi pembayar zakat dan penerima zakat setelah zakat dibagikan
        System.out.println("\nInformasi Pembayar Zakat Setelah Zakat Dibagikan:");
        for (PembayarZakat pembayarZakat : daftarPembayarZakat) {
            pembayarZakat.tampilkanInformasi();
            System.out.println();
        }

        System.out.println("Informasi Penerima Zakat Setelah Menerima Zakat:");
        for (PenerimaZakat penerimaZakat : daftarPenerimaZakat) {
            penerimaZakat.tampilkanInformasi();
            System.out.println();
        }
    }
}
