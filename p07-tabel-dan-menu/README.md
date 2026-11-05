# P07

### Jawaban Praktikum 5
1. Di KontakTableModel, jadikan baris fireTableRowsInserted(baris, baris); sebagai komentar, lalu tambah kontak baru. Apakah tabel langsung berubah?
2. Di method barisTerpilih, ganti isinya menjadi return kontakTable.getSelectedRow();. Cari kata "ah", pilih Ahmad Fauzi, lalu klik Hapus dan pilih No. Nama siapa yang muncul di dialog konfirmasi?
3. Di konstruktor DialogKontak, ubah super(pemilik, judul, true) menjadi false. Saat dialog terbuka, coba klik jendela utama. Apa yang terjadi pada kontak yang ditambahkan?
4. Tekan Ctrl+N, Ctrl+E, dan Ctrl+D. Mengapa Ctrl+E dan Ctrl+D tidak bekerja saat tidak ada baris yang dipilih?
5. Di tab Design, ubah accelerator hapusItem menjadi tombol Delete tanpa Ctrl. Baris apa yang berubah di initComponents()?
6. Ubah deklarasi atribut menjadi private KontakTableModel model; lalu isi model = new KontakTableModel(); setelah initComponents(). Jalankan. Pesan error apa yang muncul dan mengapa?

Jawaban :
1. Tabel tidak langsung berubah.
2. Yang muncul nama Budi Santoso, bukan Ahmad Fauzi.
3. Jendela utama masih bisa diklik dan kontak yang diisi tidak masuk ke tabel.
4. Karena ubahItem dan hapusItem sedang nonaktif selama belum ada baris yang dipilih.
5. Baris hapusItem.setAccelerator() berubah menjadi VK_DELETE tanpa Ctrl.
6. Error null TableModel, karena model masih null saat initComponents() dijalankan.
