package Utils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class DemoStatement {
    public static void main(String[] args) throws Exception{
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        String psw = scan.next();


//        Properties info = new Properties();
//        info.load(new FileInputStream("src\\jdbc.properties"));
//        String url = info.getProperty("url");
//        String user = info.getProperty("username");
//        String driver  = info.getProperty("driverClassName");
//        String password = info.getProperty("password");
//
//        Class.forName(driver);
//        Connection connection = DriverManager.getConnection(url, user, password);
        Connection connection = JDBCUtils.getConnection();


        String sql = "select username,password from t_user where username = ? and password = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1,name);
        preparedStatement.setString(2,psw);


        ResultSet resultSet = preparedStatement.executeQuery();
        while(resultSet.next()){
            String s = resultSet.getString(1);
            String a = resultSet.getString(2);
            if(s.equals(name) && a.equals(psw)){
                System.out.println("success");
                return;
            }
        }

        System.out.println("fail");
//        JDBCUtils.close(preparedStatement,resultSet,connection);
//        resultSet.close();
//        preparedStatement.close();
//        connection.close();
    }
}
