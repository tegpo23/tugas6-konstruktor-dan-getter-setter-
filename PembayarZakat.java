/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package task6zakatmaal;

/**
 *
 * @author ASUS
 */

public class PembayarZakat {
    private String nama;  // Nama pembayar zakat
    private double harta; // Harta yang dimiliki oleh pembayar zakat
    private double zakat; // Jumlah zakat yang dikeluarkan oleh pembayar zakat

    // Konstruktor untuk PembayarZakat
    public PembayarZakat(String nama, double harta) {
        this.nama = nama;
        this.harta = harta;
        this.zakat = hitungZakat(); // Menghitung zakat berdasarkan harta yang dimiliki
    }

    // Getter dan Setter untuk nama
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    // Getter dan Setter untuk harta
    public double getHarta() {
        return harta;
    }

    public void setHarta(double harta) {
        this.harta = harta;
        this.zakat = hitungZakat(); // Menghitung ulang zakat saat harta berubah
    }

    // Getter untuk zakat
    public double getZakat() {
        return zakat;
    }

    // Metode untuk menghitung zakat 2.5% dari harta
    private double hitungZakat() {
        return harta * 2.5 / 100;
    }

    // Menampilkan informasi tentang pembayar zakat
    public void tampilkanInformasi() {
        System.out.println("Pembayar Zakat: " + nama);
        System.out.printf("Jumlah Harta: %.2f%n", harta);
        System.out.printf("Jumlah Zakat yang Dikeluarkan: %.2f%n", zakat);
    }
}
