package Utils;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Properties;

public class DemoJDBC1 {

    public static void main(String[] args) throws Exception {
        Properties info = new Properties();
        info.load(new FileInputStream("src\\jdbc.properties"));
        String url = info.getProperty("url");
        String user = info.getProperty("username");
        String driver  = info.getProperty("driverClassName");
        String password = info.getProperty("password");
        //1.加载驱动
        // DriverManager.registerDriver(new Driver());
        //Class.forName("com.mysql.jdbc.Driver");
        Class.forName(driver);
        //2.获取连接
        //Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/book","root","huyikuan123");
        Connection conn = DriverManager.getConnection(url,user,password);

        //3.执行操作
        String sql = "insert into t_user(username,password,email) values('123','abc','133@qq.com')";
        Statement statement = conn.createStatement();
        int i = statement.executeUpdate(sql);
        System.out.println(i);
        //4.释放资源
        statement.close();
        conn.close();
    }

}
