package modal;

import java.sql.*;

public class ConnectDAO {
    String conString = "jdbc:sqlserver://localhost:1433;databaseName=QuanLiSieuThiMini;user=sa;password=sa";
    public Connection getConnection() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(conString);
            return conn;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }
}
