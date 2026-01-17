package projectpertama.model;

/**
 * Entity class untuk tabel tbl_mahasiswa.
 * Merepresentasikan satu baris data mahasiswa sebagai Object.
 */
public class Mahasiswa {
    private String nim; // Menggunakan String agar fleksibel (bisa 0812.., bisa huruf)
    private String nama;
    private String prodi;
    private String alamat;

    // Constructor Kosong (Opsional, tapi bagus untuk framework)
    public Mahasiswa() {
    }

    // Constructor Lengkap
    public Mahasiswa(String nim, String nama, String prodi, String alamat) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.alamat = alamat;
    }

    // Getter dan Setter
    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getProdi() {
        return prodi;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    
    @Override
    public String toString() {
        return "Mahasiswa{" + "nim=" + nim + ", nama=" + nama + '}';
    }
}
