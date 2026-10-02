<h1>P2</h1>

1. Aplikasi Perpustakaan (Dalam pengerjaan tugas modul P02 ini, saya banyak dibantu oleh AI (Gemini) untuk memahami konsep OOP, mencari solusi saat ada kode yang error, serta menyusun bagian kode pengujian untuk pencarian judul dan peminjaman skripsi)
   <img width="1920" height="1080" alt="Screenshot 2026-09-30 211813" src="https://github.com/user-attachments/assets/663b12f7-05db-4ea9-a468-8e784f2d74ab" />

<h1>Jawaban Eksperimen</h1>

1.Tambahkan baris Koleksi x = new Koleksi("X01", "Uji", 2026); di method main. Apa pesan error
dari kompiler dan mengapa?

Jawab : 
Error dari kompiler : Koleksi is abstract; cannot be instantiated. Karena kelas abstrak tidak bisa membuat objek dengan new.

2.Pada kelas Buku, ubah nama method hitungDenda menjadi hitungdenda. Apa yang terjadi jika anotasi
@Override ada, dan jika dihapus?

Jawab : 
- Kalau Anotasi @Override Masih Terpasang : 
Error, karena java itu case sensitive yang artinya membedakan huruf yang besar dan kecil.

- Kalau Anotasi @Override Dihapus :
Java mengira hitungdenda adalah method baru biasa buatan sendiri.

3.Tambahkan new Buku("B009", "", 2020, "Anonim"). Apa yang terjadi saat program dijalankan?

Jawab:
Pesan error menampilkan kalau judul tidak boleh kosong : Exception in thread "main" java.lang.IllegalArgumentException: Judul tidak boleh kosong. Karena di kelas Koleksi sudah diantisipasi supaya judul tidak boleh kosong.
