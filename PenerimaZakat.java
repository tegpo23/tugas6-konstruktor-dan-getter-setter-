/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package task6zakatmaal;

/**
 *
 * @author ASUS
 */

public class PenerimaZakat {
    private String nama;   // Nama penerima zakat
    private double zakat;  // Jumlah zakat yang diterima

    // Konstruktor untuk PenerimaZakat
    public PenerimaZakat(String nama) {
        this.nama = nama;
        this.zakat = 0.0;  // Penerima akan menerima zakat saat ada pembayar zakat
    }

    // Getter dan Setter untuk nama
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    // Getter untuk zakat
    public double getZakat() {
        return zakat;
    }

    // Metode untuk menambahkan zakat yang diterima
    public void terimaZakat(double jumlahZakat) {
        this.zakat += jumlahZakat;
    }

    // Menampilkan informasi tentang penerima zakat
    public void tampilkanInformasi() {
        System.out.println("Penerima Zakat: " + nama);
        System.out.printf("Jumlah Zakat yang Diterima: %.2f%n", zakat);
    }
}
