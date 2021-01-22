package Utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

/**
 * 封装JDBC工具类
 * 功能：
 * 1.获取连接
 * 2.释放资源
 */
public class JDBCUtils {
    static String url;
    static String password;
    static String driver;
    static String user;
       static {
           try {
               Properties info = new Properties();
               info.load(new FileInputStream("src\\jdbc.properties"));
                url = info.getProperty("url");
                user = info.getProperty("username");
                driver  = info.getProperty("driverClassName");
                password = info.getProperty("password");
               Class.forName(driver);
           } catch (IOException e) {
               e.printStackTrace();
           } catch (ClassNotFoundException e) {
               e.printStackTrace();
           }
       }
    public static Connection getConnection() throws Exception{
        return DriverManager.getConnection(url, user, password);
    }


    public static void close(Statement st,Connection conn){
        if(st != null){
            try {
                st.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        if(conn != null){
            try {
                conn.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }



    public static void close(ResultSet rs,Statement ps,Connection conn){
        if(rs != null){
            try {
                rs.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        if(ps != null){
            try {
                ps.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        if(conn != null){
            try {
                conn.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }
}
