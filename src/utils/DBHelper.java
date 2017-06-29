package utils;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBHelper {

    private static final String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private static final String url="jdbc:sqlserver://localhost:1433;DatabaseName=testForLaop";
    private static final String username="sa";//数据库的用户名
    private static final String password="sqlserver";//数据库的密码

    private static Connection conn = null;

    static {
        try {
            Class.forName(driver);
        } catch (Exception e) {

        }
    }

    public static Connection getConnection() throws Exception {
        if (conn == null) {
            conn = DriverManager.getConnection(url, username, password);
            return conn;
        }
        return conn;
    }

//    public static void main(String[] args) {
//        try {
//            Connection conn = DBHelper.getConnection();
//            if (conn == null) {
//                System.out.println("数据连接失败");
//            } else {
//                System.out.println("数据连接成功");
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
}
