# P06

### Foto atau pindaian lembar peer review yang Anda terima dari teman
<img width="1251" height="1600" alt="WhatsApp Image 2026-11-03 at 00 09 11" src="https://github.com/user-attachments/assets/8e58e84e-7401-4024-839d-ebf37d1d1042" />

### Nama peninjau: Muhammad Rifaldi | Nama pemilik form: Muhammad Arifin Ikhsan

---

### Perbaikan yang dilakukan :

# 1. Penambahan ToolTip pada field nama
<img width="960" height="540" alt="Screenshot 2026-11-01 222922" src="https://github.com/user-attachments/assets/a411a70b-a8fc-44a4-897a-cf0f2d339232" />

### 2. Pencegahan kesalahan pada field nama
<img width="960" height="540" alt="Screenshot 2026-11-01 222836" src="https://github.com/user-attachments/assets/f5ae5184-25b4-40de-8136-300b438b7b35" />

### 3. Penambahan pesan perbaikan untuk field nama
<img width="960" height="540" alt="Screenshot 2026-11-01 223143" src="https://github.com/user-attachments/assets/b5f3efde-ddca-4bc8-908d-7a2d37a8f84e" />

### Hasil commit
<img width="959" height="63" alt="image" src="https://github.com/user-attachments/assets/c0434fe9-5d4d-419d-90f1-3fa46a4baece" />

---

### Tangkapan layar (screenshot) form dengan pesan kesalahan
<img width="960" height="540" alt="Screenshot 2026-11-01 224140" src="https://github.com/user-attachments/assets/a9b29fe5-c7b1-4898-9f77-d1165cde6d39" />

### Tangkapan layar (screenshot) jendela Navigator yang memperlihatkan label pesan
<img width="960" height="540" alt="image" src="https://github.com/user-attachments/assets/4c98b285-8d92-40e8-b586-af8474e9619b" />

---

### Jawaban praktikum 4
1. Ketik huruf pada isian NPM. Apa yang terjadi dan baris mana di npmFieldKeyTyped yang menyebabkannya?
2. Isi email dengan siti@, lalu tekan Tab. Kapan pesan kesalahan muncul?
3. Klik isian Nama tanpa mengetik, lalu tekan Tab. Mengapa tidak ada pesan kesalahan?
4. Centang persetujuan, lalu klik Daftar dengan form kosong. Isian mana yang mendapat fokus?
5. Tekan tombol Alt bersama huruf N. Isian mana yang mendapat fokus, dan properti apa yang mengaturnya?
6. Isi beberapa isian, lalu klik Batal dan pilih No. Apakah data tetap ada?

Jawaban :
1. Huruf tidak muncul. Penyebabnya evt.consume() di npmFieldKeyTyped.
2. Muncul pesan error "Format email belum benar, contoh: nama@gmail.com". pesannya muncul ketika kita meninggalkan isiannya.
3. Tidak ada pesan karena focuslost hanya memeriksa isian yang tidak kosong. Isian kosong baru diperiksa saat Daftar diklik.
4. Isian NPM mendapatkan fokus lebih dulu.
5. Fokus ke isian nama yang diatur oleh properti displayedMnemonic (N) dan labelFor (namaField) pada namaLabel.
6. Data tetap ada.
7. 

---

### Deklarasi penggunaan AI
Penggunaan AI di tugas P6 ini digunakan untuk memandu saya ketika mengerjakan Latihan Mandiri. 
Semua kegiatan dilakukan oleh saya sendiri tanpa mengambil hasil generate AI.
