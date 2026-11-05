//Nama : Muhammad Arifin Ikhsan | NPM : 2410010092

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.uniska.pbo2.uts;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author arsan
 */
public class BelanjaTableModel extends AbstractTableModel{
    private static final String[] KOLOM = {"Nama Barang", "Kategori", "Harga", "Jumlah", "Subtotal"};
    private final List<Belanja> tambah = new ArrayList<>();
    private final NumberFormat rupiahFormat;
    
    public BelanjaTableModel() {
        rupiahFormat = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));
        rupiahFormat.setMaximumFractionDigits(0);
    }
    
    @Override
    public int getRowCount() {
        return tambah.size();
    }

    @Override
    public int getColumnCount() {
        return KOLOM.length;
    }

    @Override
    public String getColumnName(int kolom) {
        return KOLOM[kolom];
    }

    // Kolom tahun bertipe Integer agar diurutkan sebagai angka, bukan teks
    @Override
    public Class<?> getColumnClass(int kolom) {
        return kolom == 3 ? Integer.class : Object.class;
    }

    @Override
    public Object getValueAt(int baris, int kolom) {
        Belanja b = tambah.get(baris);
        return switch (kolom) {
            case 0 -> b.nama();
            case 1 -> b.kategori().toString();
            case 2 -> formatRupiah(b.harga());
            case 3 -> b.jumlah();
            case 4 -> formatRupiah(b.subtotal());
            default -> null;
        };
    }
    
    public boolean isBarangExist(String nama) {
        for (Belanja b : tambah) {
            if (b.nama().trim().equalsIgnoreCase(nama.trim())) {
                return true;
            }
        }
        return false;
    }

    public Belanja get(int baris) {
        return tambah.get(baris);
    }

    public void tambah(Belanja belanja) {
        tambah.add(belanja);
        int baris = tambah.size() - 1;
        fireTableRowsInserted(baris, baris);
    }

    public void ubah(int baris, Belanja belanja) {
        tambah.set(baris, belanja);
        fireTableRowsUpdated(baris, baris);
    }

    public void hapus(int baris) {
        tambah.remove(baris);
        fireTableRowsDeleted(baris, baris);
    }
    
    public int hitungTotal() {
        int total = 0;
        for (Belanja b : tambah) {
            total += b.subtotal();
        }
        return total;
    }

    public int hitungDiskon() {
        int total = hitungTotal();
        if (total >= 100000) {
            return (int) Math.floor(total * 0.10);
        }
        return 0;
    }

    public int hitungBayar() {
        return hitungTotal() - hitungDiskon();
    }
    
    public String formatRupiah(int nilai) {
        return rupiahFormat.format(nilai).replace("Rp ", "Rp");
    }
}
