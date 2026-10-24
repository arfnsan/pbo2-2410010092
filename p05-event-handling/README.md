# P05

### Tabel pengamatan Praktikum 2

| No | Tindakan | Event yang tercatat |
|---|---|---|
| 1 | Arahkan kursor ke tombol, lalu jauhkan | `MouseEvent` kursor masuk ke tombol, lalu `MouseEvent` kursor keluar dari tombol |
| 2 | Klik tombol Klik saya | `MouseEvent` kursor masuk ke tombol, `ActionEvent` tombol diklik |
| 3 | Centang lalu hapus centang Aktifkan fitur | `ItemEvent` kotak dicentang, lalu `ItemEvent` centang dihapus |
| 4 | Ganti pilihan dari Pagi menjadi Malam | `ItemEvent` memilih Malam (satu baris saja, karena DESELECTED disaring) |
| 5 | Klik isian, lalu ketik kata "abc" | `FocusEvent` isian mendapat fokus, lalu `KeyEvent` huruf a, b, c |
| 6 | Klik tombol setelah mengetik di isian | `MouseEvent` kursor masuk ke tombol, `FocusEvent` isian kehilangan fokus, `ActionEvent` tombol diklik |

---

### Jawaban eksperimen Praktikum 3 

Eksperimen:
1. Hapus pemeriksaan if (evt.getStateChange() == ItemEvent.SELECTED) dan tambahkan
System.out.println("item berubah"); di dalam event handler. Berapa kali pesan tercetak setiap
pilihan diganti?
2. Di jendela Properties bagian Events, kosongkan event keyReleased pada celsiusField, lalu buat event
keyPressed yang memanggil konversi(). Mengapa hasil yang tampil terlambat satu karakter?
3. Hapus blok try dan catch di method konversi, lalu ketik huruf pada isian. Apa yang muncul di jendela
Output?

Jawaban:
1. Pesan tercetak 2 kali: sekali untuk pilihan lama (DESELECTED) dan sekali untuk pilihan baru (SELECTED).
2. Karena keyPressed dipicu sebelum karakter masuk ke text field, sehingga getText() masih berisi teks lama. keyReleased dipicu setelah karakter masuk.
3. Muncul NumberFormatException di jendela Output, dan hasil tidak diperbarui. Aplikasi tetap terbuka.

---

### Jawaban eksperimen Praktikum 4

Eksperimen:
1. Buat event actionPerformed untuk kaliButton melalui Events tanpa menghapus lambda di konstruktor, lalu
tambahkan System.out.println("kali"); di kedua tempat. Berapa kali pesan tercetak? Mengapa satu
tombol sebaiknya hanya memakai satu cara?
2. Tambahkan tombol % untuk sisa bagi (modulus). Apa saja yang diubah di tab Design dan di tab Source?
3. Tekan tombol Hapus. Mengapa kursor langsung berada di isian pertama?

Jawaban:
1. Pesan tercetak 2 kali, karena tombol punya dua listener (dari GUI Builder dan dari lambda). Satu tombol sebaiknya satu cara agar aksi tidak berjalan ganda.
2. Tab Design: tambah tombol `%` dan ubah Columns grid menjadi 5. Tab Source: tambah handler `hitung('%');`, `case '%' -> a % b;`, dan pemeriksaan nol untuk `%`.
3. Karena method hapus memanggil angka1Field.requestFocusInWindow().

---

### Screenshoot

### 1 Tangkapan layar jendela Properties bagian Events untuk tombol Daftar
<img width="960" height="540" alt="Screenshot 2026-10-24 154751" src="https://github.com/user-attachments/assets/98d28cf9-a9ce-41dc-97b9-9d866eb33d0f" />

### 2 Tangkapan layar dialog ringkasan
<img width="960" height="540" alt="Screenshot 2026-10-24 154419" src="https://github.com/user-attachments/assets/2618d6d0-96c7-4bc7-b6a0-0d7a80a6b487" />

### 3 dialog konfirmasi keluar.
<img width="960" height="540" alt="Screenshot 2026-10-24 154448" src="https://github.com/user-attachments/assets/419b19c7-6e49-48fb-b6a3-e6fe1281a47c" />

# Deklarasi Penggunaan AI :
Di penugasan ini, saya menggunakan Claude AI untuk memahami modul karena ada beberapa langkah yang hampir membuat saya keliru. 
Dan saya minta Claude untuk membuatkan kode ringkasan dialog pada form Perpustakaan.
