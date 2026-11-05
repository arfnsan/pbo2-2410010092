//Nama : Muhammad Arifin Ikhsan | NPM : 2410010092

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Record.java to edit this template
 */
package id.ac.uniska.pbo2.uts;

/**
 *
 * @author arsan
 */
public record Belanja(String nama, KategoriBelanja kategori, int harga, int jumlah) {
    public int subtotal() {
        return harga * jumlah;
    }
}
