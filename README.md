# ProjectUAS - Aplikasi Data Mahasiswa

Aplikasi desktop berbasis **Java Swing** untuk mengelola data mahasiswa (CRUD). Project ini dibuat menggunakan **NetBeans IDE 8.2** dan database **MySQL** (via XAMPP).

Project ini merupakan hasil kolaborasi antara **Manusia dan AI Agent**, dikembangkan dengan pendekatan *Computational Thinking* yang sistematis dan mengikuti kaidah *Industry Best Practices*.

## 📋 Fitur Utama

-   **Login System**: Keamanan akses menggunakan username dan password.
-   **Dashboard (Home)**: Menu navigasi utama.
-   **Manajemen Biodata (CRUD)**:
    -   **Create**: Menambahkan data mahasiswa baru.
    -   **Read**: Menampilkan daftar mahasiswa dalam tabel.
    -   **Update**: Memperbarui data mahasiswa yang sudah ada.
    -   **Delete**: Menghapus data mahasiswa.
-   **Secure Configuration**: Menggunakan `.env` untuk menyimpan kredensial database (tidak hardcoded).
-   **Clean Architecture**: Menggunakan pattern **DAO (Data Access Object)** dan **MVC** untuk memisahkan logika UI dan Database.

## 🛠️ Teknologi yang Digunakan

-   **Bahasa**: Java (JDK 8+)
-   **Framework UI**: Java Swing (JFrame)
-   **IDE**: NetBeans 8.2 (Ant Project)
-   **Database**: MySQL
-   **Version Control**: Git

## 🤖 Alur Pengembangan (AI-Powered Workflow)

Project ini dikembangkan melalui proses interaktif dengan AI Agent, menekankan pada pemahaman konsep sebelum penulisan kode.

### 1. Discovery & Planning
-   **User Prompt**: Menjelaskan kebutuhan ("Buat aplikasi CRUD Mahasiswa dengan Java Swing dan MySQL").
-   **System Analysis**: AI menganalisis stack teknologi (NetBeans/Ant) dan merancang database schema.
-   **Task Breakdown**: Memecah project menjadi tugas-tugas kecil (Setup, UI, Logic, Refactoring).

### 2. Implementation (Iteractive Coding)
-   **Step 1 - Foundation**: Membuat database dan koneksi JDBC (`Koneksi.java`).
-   **Step 2 - UI Design**: Mendesain Form Login dan CRUD menggunakan NetBeans GUI Builder.
-   **Step 3 - Logic Integration**: Menghubungkan tombol event handler dengan query SQL.

### 3. Verification & Debugging
-   **Testing**: Menjalankan setiap fitur (Login, Simpan, Edit, Hapus) secara manual.
-   **Bug Fixing**: Menangani *edge cases* seperti koneksi putus atau input kosong.

### 4. Refactoring (Pro Level)
-   **Security**: Migrasi kredensial database ke file `.env` untuk keamanan.
-   **Architecture**: Refactoring kode "Spaghetti" menjadi **DAO Pattern**.
    -   *Sebelum*: Code SQL campur dengan kode UI di Button Action.
    -   *Sesudah*: UI memanggil `dao.insert()`, logika SQL bersih di class terpisah.

## 🤝 Cara Berkontribusi (Contribution)

Kami mengundang Anda untuk belajar dan berkontribusi di project ini!

1.  **Fork** repository ini.
2.  Buat **Branch** baru untuk fitur Anda:
    ```bash
    git checkout -b fitur-baru-anda
    ```
3.  **Commit** perubahan Anda (gunakan pesan commit yang deskriptif):
    ```bash
    git commit -m "feat: Menambahkan fitur pencarian mahasiswa"
    ```
4.  **Push** ke branch Anda:
    ```bash
    git push origin fitur-baru-anda
    ```
5.  Buat **Pull Request** di GitHub.

## ⚙️ Persyaratan Sistem

-   **JDK 8** atau terbaru.
-   **NetBeans IDE 8.2** (Recommended).
-   **XAMPP** (MySQL Server).

## 🚀 Cara Menjalankan

1.  **Database**:
    -   Import database script atau buat manual database `db_aplikasi`.
    -   Pastikan tabel `tbl_mahasiswa` dan `user_login` sudah ada.
2.  **Konfigurasi**:
    -   Copy `.env.example` menjadi `.env`.
    -   Sesuaikan `DB_USER` dan `DB_PASS` dengan settingan XAMPP Anda.
3.  **Run**:
    -   Buka project di NetBeans.
    -   Run `ProjectPertama.java` (Entry point yang akan membuka Login Form).

---
**Author**: Tegar Isafatna
**Powered by**: AI Agent Collaboration
