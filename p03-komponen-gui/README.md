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
