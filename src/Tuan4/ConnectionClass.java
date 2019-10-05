package Tuan4;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionClass {
    public Connection connection;
    public Connection getConnection(){
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection= DriverManager.getConnection("jdbc:sqlserver://localhost\\QUYSEVER;database=Tuan4Bai1","sa","Quy0164vn");
        }
        catch (Exception ex){
            // ex.printStackTrace();
            System.out.println("Kết Nối Thất Bại");
        }
        return connection;
    }
}

