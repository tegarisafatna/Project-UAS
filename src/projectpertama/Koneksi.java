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
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Koneksi {
    
        public static Connection getConnection() {
        Connection conn = null;

        try {
            Properties props = new Properties();
            try (FileInputStream fis = new FileInputStream(".env")) {
                props.load(fis);
            } catch (IOException e) {
                System.out.println("Gagal membaca file .env: " + e.getMessage());
                return null;
            }

            String url = "jdbc:mysql://" + props.getProperty("DB_HOST") + ":" + props.getProperty("DB_PORT") + "/" + props.getProperty("DB_NAME");
            String user = props.getProperty("DB_USER");
            String pass = props.getProperty("DB_PASS");

            conn = DriverManager.getConnection(url, user, pass);
            System.out.println("Koneksi berhasil");

        } catch (SQLException e) {
            System.out.println("Koneksi gagal: " + e.getMessage());
        }

        return conn;
    }
}
