package projectpertama.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import projectpertama.Koneksi;
import projectpertama.model.User;

public class UserDAOImpl implements UserDAO {
    
    private final Connection conn;

    public UserDAOImpl() {
        this.conn = Koneksi.getConnection();
    }

    @Override
    public User login(String username, String password) {
        User user = null;
        String sql = "SELECT * FROM user_login WHERE username=? AND password=?";
        
        try (PreparedStatement pst = conn.prepareStatement(sql)) {
            pst.setString(1, username);
            pst.setString(2, password);
            
            try (ResultSet rs = pst.executeQuery()) {
                if (rs.next()) {
                    user = new User();
                    user.setUsername(rs.getString("username"));
                    user.setPassword(rs.getString("password"));
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return user;
    }
}
