package busresv;

import java.sql.*;

public class DbConnection {
    private static final String url = "jdbc:mysql://localhost:3306/busresvation";
    private static final String userName = "root";
    private static final String passWord = "123KOUSHiik";

    public static Connection getConnection() throws SQLException{
        return  DriverManager.getConnection(url,userName,passWord);
    }

}