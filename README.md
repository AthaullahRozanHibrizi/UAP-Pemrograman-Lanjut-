# UAP-Proglan
# Simulasi Sistem Antrian

## Deskripsi
Program ini adalah aplikasi simulasi sistem antrian berbasis GUI (Graphical User Interface) yang dibangun menggunakan Java Swing. Aplikasi ini memungkinkan pengguna untuk mengelola antrian pelanggan dengan fitur CRUD (Create, Read, Update, Delete). Program ini cocok untuk mensimulasikan skenario seperti antrian di bank, rumah sakit, atau restoran.

---

## Fitur Utama
1. **Tambah Pelanggan**: Menambahkan pelanggan baru ke dalam antrian dengan status "Menunggu".
2. **Layani Pelanggan**: Melayani pelanggan pertama dalam antrian dan menghapusnya dari daftar.
3. **Hapus Pelanggan**: Menghapus pelanggan tertentu dari daftar antrian.
4. **Visualisasi Antrian**: Menampilkan daftar pelanggan dalam tabel yang dapat diakses secara langsung.
5. **Status Dinamis**: Memberikan umpan balik langsung kepada pengguna melalui label status.
6. **Exception Handling**: Menangani kesalahan input dan pemilihan pelanggan yang tidak valid dengan pesan yang ramah pengguna.

---

## Teknologi yang Digunakan
- **Bahasa Pemrograman**: Java
- **GUI Framework**: Swing

---

## Cara Menjalankan Program
1. **Prasyarat**:
   - Pastikan Anda telah menginstal JDK (Java Development Kit).

2. **Langkah-Langkah**:
   - Salin kode program ke dalam file bernama `QueueSimulation.java`.
   - Kompilasi program menggunakan perintah berikut di terminal atau command prompt:
     ```bash
     javac QueueSimulation.java
     ```
   - Jalankan program dengan perintah berikut:
     ```bash
     java QueueSimulation
     ```

---

## Screenshot Program
**Antarmuka Utama:**

![image](https://github.com/user-attachments/assets/7c05b7ae-a399-4cd3-9907-234e6f4144c2)


---

## Struktur Program
```plaintext
QueueSimulation.java   # File utama yang berisi seluruh kode aplikasi
```

---

## Penjelasan Fitur
### 1. Tambah Pelanggan
- Pengguna dapat menambahkan pelanggan baru dengan memasukkan nama di kolom input, lalu menekan tombol "Tambah".
- Jika input kosong, akan muncul pesan error.

### 2. Layani Pelanggan
- Pelanggan pertama dalam daftar akan dilayani dan dihapus dari tabel saat tombol "Layani" ditekan.
- Jika antrian kosong, akan muncul pesan informasi.

### 3. Hapus Pelanggan
- Pengguna dapat memilih pelanggan tertentu di tabel dan menekan tombol "Hapus" untuk menghapus pelanggan tersebut.
- Jika tidak ada pelanggan yang dipilih, akan muncul pesan error.

### 4. Status Dinamis
- Setiap aksi pengguna akan ditampilkan pada label status di bagian bawah aplikasi untuk memberikan umpan balik langsung.

---

## Contoh Kasus Penggunaan
- **Antrian Bank**: Mengelola pelanggan yang menunggu giliran untuk dilayani oleh teller.
- **Rumah Sakit**: Mengelola pasien yang menunggu giliran untuk berkonsultasi dengan dokter.
- **Restoran**: Mengelola daftar pelanggan yang menunggu untuk mendapatkan meja.

---

## Pengembangan Lebih Lanjut
1. **Image Handling**:
   - Tambahkan fitur untuk mengunggah foto pelanggan.
2. **API Integration**:
   - Integrasikan dengan API eksternal untuk memperkirakan waktu tunggu pelanggan.
3. **Data Persistence**:
   - Simpan data antrian ke dalam file atau database agar tetap ada setelah program ditutup.
4. **Testing**:
   - Tambahkan unit test menggunakan framework seperti JUnit untuk memastikan stabilitas kode.

---

## Kontributor
Dikembangkan oleh: **[Athaullah Rozan Hibrizi]**

---



