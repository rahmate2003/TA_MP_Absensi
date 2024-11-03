package absensi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Koneksi {
    private static Connection koneksi;
    
    public static Connection getKoneksi() {
        if (koneksi == null) {
            try {
                String url = "jdbc:mysql://localhost:3306/absensi?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
                String user = "root";
                String password = "";
                
                // Register Driver
                Class.forName("com.mysql.cj.jdbc.Driver");
                
                // Buat Koneksi
                koneksi = DriverManager.getConnection(url, user, password);
                System.out.println("Koneksi Database Berhasil");
                
            } catch (ClassNotFoundException ex) {
                System.out.println("Driver Database tidak ditemukan: " + ex.getMessage());
            } catch (SQLException ex) {
                System.out.println("Koneksi Database Gagal: " + ex.getMessage());
            }
        }
        return koneksi;
    }
    
    public static void tutupKoneksi() {
        try {
            if (koneksi != null && !koneksi.isClosed()) {
                koneksi.close();
                System.out.println("Koneksi Database Ditutup");
            }
        } catch (SQLException ex) {
            System.out.println("Gagal menutup koneksi: " + ex.getMessage());
        }
    }
    
    // Method untuk test koneksi
    public static void main(String[] args) {
        getKoneksi();
 
    }
}