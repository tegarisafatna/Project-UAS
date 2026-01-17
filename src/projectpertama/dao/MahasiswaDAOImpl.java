package projectpertama.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import projectpertama.Koneksi;
import projectpertama.model.Mahasiswa;

/**
 * Implementasi DAO menggunakan JDBC.
 * Berisi kode SQL sebenarnya.
 */
public class MahasiswaDAOImpl implements MahasiswaDAO {
    
    private final Connection conn;

    public MahasiswaDAOImpl() {
        this.conn = Koneksi.getConnection();
    }

    @Override
    public void insert(Mahasiswa m) {
        String sql = "INSERT INTO tbl_mahasiswa (nim, nama, prodi, alamat) VALUES (?, ?, ?, ?)";
        try (PreparedStatement pst = conn.prepareStatement(sql)) {
            pst.setString(1, m.getNim());
            pst.setString(2, m.getNama());
            pst.setString(3, m.getProdi());
            pst.setString(4, m.getAlamat());
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(MahasiswaDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(Mahasiswa m) {
        String sql = "UPDATE tbl_mahasiswa SET nama=?, prodi=?, alamat=? WHERE nim=?";
        try (PreparedStatement pst = conn.prepareStatement(sql)) {
            pst.setString(1, m.getNama());
            pst.setString(2, m.getProdi());
            pst.setString(3, m.getAlamat());
            pst.setString(4, m.getNim());
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(MahasiswaDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void delete(String nim) {
        String sql = "DELETE FROM tbl_mahasiswa WHERE nim=?";
        try (PreparedStatement pst = conn.prepareStatement(sql)) {
            pst.setString(1, nim);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(MahasiswaDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<Mahasiswa> getAll() {
        List<Mahasiswa> list = new ArrayList<>();
        String sql = "SELECT * FROM tbl_mahasiswa";
        try (Statement st = conn.createStatement(); ResultSet rs = st.executeQuery(sql)) {
            while (rs.next()) {
                Mahasiswa m = new Mahasiswa();
                m.setNim(rs.getString("nim"));
                m.setNama(rs.getString("nama"));
                m.setProdi(rs.getString("prodi"));
                m.setAlamat(rs.getString("alamat"));
                list.add(m);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MahasiswaDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    @Override
    public Mahasiswa getByNim(String nim) {
        String sql = "SELECT * FROM tbl_mahasiswa WHERE nim=?";
        Mahasiswa m = null;
        try (PreparedStatement pst = conn.prepareStatement(sql)) {
            pst.setString(1, nim);
            try (ResultSet rs = pst.executeQuery()) {
                if (rs.next()) {
                    m = new Mahasiswa();
                    m.setNim(rs.getString("nim"));
                    m.setNama(rs.getString("nama"));
                    m.setProdi(rs.getString("prodi"));
                    m.setAlamat(rs.getString("alamat"));
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(MahasiswaDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return m;
    }
}
