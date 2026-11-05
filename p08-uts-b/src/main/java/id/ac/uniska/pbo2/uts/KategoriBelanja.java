//Nama : Muhammad Arifin Ikhsan | NPM : 2410010092

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package id.ac.uniska.pbo2.uts;

/**
 *
 * @author arsan
 */
public enum KategoriBelanja {
    /** Kategori Belanja. Nilai toString() dipakai sebagai teks di combo dan tabel. */
    ALAT_TULIS("Alat Tulis"),
    MAKANAN("Makanan"),
    MINUMAN("Minuman"),
    LAINNYA("Lainnya");

    private final String label;

    KategoriBelanja(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return label;
    }
}
