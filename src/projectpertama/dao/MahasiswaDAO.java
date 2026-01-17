package projectpertama.dao;

import java.util.List;
import projectpertama.model.Mahasiswa;

/**
 * Interface untuk Data Access Object (DAO) Mahasiswa.
 * Mendefinisikan operasi apa saja yang bisa dilakukan ke database.
 */
public interface MahasiswaDAO {
    // Menambah data mahasiswa baru
    void insert(Mahasiswa m);
    
    // Mengupdate data mahasiswa
    void update(Mahasiswa m);
    
    // Menghapus data mahasiswa berdasarkan NIM
    void delete(String nim);
    
    // Mengambil semua data mahasiswa
    List<Mahasiswa> getAll();
    
    // (Opsional) Mengambil satu mahasiswa berdasarkan NIM
    Mahasiswa getByNim(String nim);
    
    // Pencarian data mahasiswa
    List<Mahasiswa> search(String keyword);
}
