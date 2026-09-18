/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.uniska.pbo2.p01;

/**
 *
 * @author arsan
 */
public class KartuMahasiswa {
    String nama = "Muhammad Arifin Ikhsan";
    String npm = "2410010092";
    String prodi = "Teknik Informatika";
    int semester = 5;
    String alasan = "Ingin memahami pemrograman berorientasi objek lebih lanjut";
    
    public static void main(String[] args) {
        KartuMahasiswa mahasiswa = new KartuMahasiswa();

        System.out.println("==============================");
        System.out.println("KARTU MAHASISWA PBO 2");
        System.out.println("==============================");
        System.out.println("Nama       : " + mahasiswa.nama);
        System.out.println("NPM        : " + mahasiswa.npm);
        System.out.println("Prodi      : " + mahasiswa.prodi);
        System.out.println("Semester   : " + mahasiswa.semester);
        System.out.println("Alasan     : " + mahasiswa.alasan);
        System.out.println("==============================");
    }
}
