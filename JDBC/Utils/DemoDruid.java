package Utils;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.sql.Connection;
import java.util.Properties;

public class DemoDruid {
    public static void main(String[] args) throws Exception {

        Properties properties = new Properties();
        properties.load(new FileInputStream("src\\JDBC.properties"));
        //1.创建连接池
        DataSource ds = DruidDataSourceFactory.createDataSource(properties);


        //2.从数据库连接池获取可用连接对象
        Connection connection = ds.getConnection();

        //3.关闭
        connection.close();


    }


}
