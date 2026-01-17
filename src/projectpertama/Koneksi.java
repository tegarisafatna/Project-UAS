package projectpertama;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Koneksi {
    
        public static Connection getConnection() {
        Connection conn = null;

        try {
            String url = "jdbc:mysql://localhost:3306/db_aplikasi";
            String user = "root";
            String pass = "";

            conn = DriverManager.getConnection(url, user, pass);
            System.out.println("Koneksi berhasil");

        } catch (SQLException e) {
            System.out.println("Koneksi gagal: " + e.getMessage());
        }

        return conn;
    }
}
