package Utils;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;


public class DemoJDBC2 {
    public static void main(String[] args) throws Exception {
        Properties info = new Properties();
        info.load(new FileInputStream("src\\jdbc.properties"));
        String url = info.getProperty("url");
        String username = info.getProperty("username");
        String driver  = info.getProperty("driverClassName");
        String password = info.getProperty("password");
        //1.加载驱动
        // DriverManager.registerDriver(new Driver());
        //Class.forName("com.mysql.jdbc.Driver");
        Class.forName(driver);
        //2.获取连接
        //Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/book","root","huyikuan123");
        Connection conn = DriverManager.getConnection(url,username,password);

        //3.执行操作
        String sql = "select id,username,password from t_user";
        Statement statement = conn.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);//返回结果集
        while(resultSet.next()){
            int id = resultSet.getInt(1);
            String name = resultSet.getString(2);
            String password1 = resultSet.getString(3);
            System.out.println(id + " " + name + " " + password1);
        }

        //4.释放资源
        resultSet.close();
        statement.close();
        conn.close();
    }

}
