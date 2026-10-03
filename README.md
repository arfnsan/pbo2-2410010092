<h1>PBO 2 - 2410010092</h1>

<h1>Muhammad Arifin Ikhsan - 2410010092</h1>
<h1>5A TI REGULER BJM</h1>

<h1>P1</h1>

1. HaloPBO2
   <img width="1919" height="1079" alt="Screenshot 2026-09-27 204816" src="https://github.com/user-attachments/assets/a9ace269-e556-4362-9098-cfec2b2fac0a" />

2. Kartu Mahasiswa (Pemakaian AI (Gemini) saya gunakan untuk bertanya apakah data yang bertipe String bisa digabung manjadi satu)

Prompt saya : untuk data yang bertipe string bisakah digabungkan menjadi 1 saja? dan bagaimana caranya.

Jawaban AI :
Bisa banget. Caranya cukup pakai satu tipe String di awal, lalu pisahkan setiap variabel dengan tanda koma (,) dan akhiri dengan titik koma (;).

Ini bagian kode String-nya saja:

   <img width="1147" height="386" alt="Screenshot 2026-10-03 134527" src="https://github.com/user-attachments/assets/a4ca7874-3668-4103-a0b5-cd09b04aa556" />

   <img width="1920" height="1080" alt="Screenshot 2026-10-03 134947" src="https://github.com/user-attachments/assets/42730697-bcaa-4886-8267-5c7d92e22c9f" />

4. git log --oneline
   <img width="1920" height="1080" alt="Screenshot 2026-09-18 214355" src="https://github.com/user-attachments/assets/b01bc30f-81fa-4136-9bd9-c68e2c40c6e5" />

<hr>

<h1>P2</h1>

1. Aplikasi Perpustakaan (Dalam pengerjaan tugas modul P02 ini, saya banyak dibantu oleh AI (Gemini) untuk memahami konsep OOP, mencari solusi saat ada kode yang error, serta menyusun bagian kode pengujian untuk pencarian judul dan peminjaman skripsi)
   <img width="1920" height="1080" alt="Screenshot 2026-09-30 211813" src="https://github.com/user-attachments/assets/663b12f7-05db-4ea9-a468-8e784f2d74ab" />

<h1>Jawaban Eksperimen</h1>

1. Tambahkan baris Koleksi x = new Koleksi("X01", "Uji", 2026); di method main. Apa pesan error
dari kompiler dan mengapa?

Jawab : 
Error dari kompiler : Koleksi is abstract; cannot be instantiated. Karena kelas abstrak tidak bisa membuat objek dengan new.

2. Pada kelas Buku, ubah nama method hitungDenda menjadi hitungdenda. Apa yang terjadi jika anotasi
@Override ada, dan jika dihapus?

Jawab : 
- Kalau Anotasi @Override Masih Terpasang : 
Error, karena java itu case sensitive yang artinya membedakan huruf yang besar dan kecil.

- Kalau Anotasi @Override Dihapus :
Java mengira hitungdenda adalah method baru biasa buatan sendiri.

3. Tambahkan new Buku("B009", "", 2020, "Anonim"). Apa yang terjadi saat program dijalankan?

Jawab:
Pesan error menampilkan kalau judul tidak boleh kosong : Exception in thread "main" java.lang.IllegalArgumentException: Judul tidak boleh kosong. Karena di kelas Koleksi sudah diantisipasi supaya judul tidak boleh kosong.

4. Ubah private StatusKoleksi status menjadi public, lalu ubah status B002 langsung dari main
menjadi TERSEDIA saat masih dipinjam. Aturan apa yang dilanggar?

Jawab:
Aturan yang dilanggar adalah Enkapsulasi yang menyembunyikan data dan mengontrol perubahannya melalui sebuah method.

<h1>P3</h1>

1. Form Pemesanan Tiket Travel (tema terang dan gelap)
   <img width="1920" height="1080" alt="Screenshot 2026-10-03 001303" src="https://github.com/user-attachments/assets/46d57312-0cbc-471f-8181-5b2316ca39e9" />
   
   <img width="1920" height="1080" alt="Screenshot 2026-10-03 001312" src="https://github.com/user-attachments/assets/8218325a-823b-4281-8075-1b13d147f87d" />

2. Tab Design Jendela Navigator
   <img width="1920" height="1080" alt="Screenshot 2026-10-03 001637" src="https://github.com/user-attachments/assets/fd3dd8b2-c660-488a-b6b4-1270e79007ac" />

<h1>Pertanyaan Refleksi</h1>

1. Apa perbedaan top-level container, intermediate container, dan atomic component? Berikan masing-masing
satu contoh.

Jawab : 
- Top-level container : Jendela utama yang memiliki bingkai dan judul. Contoh: JFrame, JDialog.
  
- Intermediate container : Wadah untuk mengelompokkan komponen. Contoh: JPanel, JScrollPane, JTabbedPane.

- Atomic component Komponen yang berinteraksi langsung dengan pengguna. Contoh: JLabel, JTextField, JButton.

2. Mengapa kedua JRadioButton perlu diberi properti buttonGroup yang sama?

Jawab : 
Agar RadioButton tersebut hanya bisa dilihin salah satunya saja.

3. Kapan Anda memilih JComboBox dibandingkan JRadioButton?

Jawab : 
Pakai JComboBox kalau pilihannya banyak dan area form terbatas. Pakai JRadioButton kalau hanya memilih satu dari sedikit pilihan dan area form luas.

4. Mengapa kode di dalam initComponents() tidak boleh diedit langsung, dan di mana kode tambahan
seharusnya ditulis?

Jawab : 
initComponents() tidak boleh diedit karena dia kode yang otomatis dibuat oleh Netbeans dari tab design, yang mana Membuat label, mengatur properti  dan menyusun GroupLayout. Sebaiknya kode tambahan ditulis setelah blok kode initComponents().

5. Mengapa FlatLightLaf.setup() harus dipanggil sebelum form dibuat?

Jawab : 
Agar tema FlatLaf diinisialisasi sebelum komponen swing.
