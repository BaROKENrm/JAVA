package Utils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class CRUDUtils {

    /**
     * 执行则增删改
     * @param sql 执行的sql语句
     * @param params 占位符
     * @return
     */
    public static int update(String sql,Object... params){
        Connection connection = null;
        PreparedStatement ps = null;
        try {
            //1.获取连接
            connection = JDBCUtilsByDruid.getConnection();
            //2.执行sql语句
            ps = connection.prepareStatement(sql);
            for (int i = 0; i < params.length; i++) {//  params.length 获取可变长度的长度
                ps.setObject(i + 1,params[i]);
            }
            int update = ps.executeUpdate();
            return update;
        } catch (Exception e) {
           throw new RuntimeException();
        }finally {
            JDBCUtilsByDruid.close(ps,connection);
        }
    }

    public static user queryString(String sql,Object... params) {
        Connection connection = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            //1.获取连接
             connection = JDBCUtilsByDruid.getConnection();
            //2.执行查询
             ps = connection.prepareStatement(sql);
            for (int i = 0; i < params.length; i++) {
                ps.setObject(i + 1,params[i]);
            }
            rs = ps.executeQuery();
            if(rs.next()){
                int id = rs.getInt("id");
                String username = rs.getString("username");
                String password = rs.getString("password");
                String email = rs.getString("email");
                user user = new user(id,username,password,email);
                return user;
            }
            return null;
        } catch (Exception e) {
            throw new RuntimeException();
        } finally {
            JDBCUtilsByDruid.close(rs,ps,connection);
        }
    }
    public static List<user> queryAll(String sql, Object... params) {
        Connection connection = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            //1.获取连接
            connection = JDBCUtilsByDruid.getConnection();
            //2.执行查询
            ps = connection.prepareStatement(sql);
            for (int i = 0; i < params.length; i++) {
                ps.setObject(i + 1,params[i]);
            }
            rs = ps.executeQuery();
            List<user> list = new ArrayList<>();
            while(rs.next()){
                int id = rs.getInt("id");
                String username = rs.getString("username");
                String password = rs.getString("password");
                String email = rs.getString("email");
                user user = new user(id,username,password,email);
                list.add(user);
            }
            return list;
        } catch (Exception e) {
            throw new RuntimeException();
        } finally {
            JDBCUtilsByDruid.close(rs,ps,connection);
        }
    }


}
