package Test;

import Utils.CRUDUtils;
import Utils.user;
import org.junit.Test;

import java.util.List;

public class testCRUDUtils {
    @Test
    public void testUpdate(){
        String sql = "update t_user set username = ? where id = 1";
        int update = CRUDUtils.update(sql,"huyikuan");
        System.out.println(update);
    }

    @Test
    public void testQuery(){
        String sql = "select * from t_user where id = ?";
        user user = CRUDUtils.queryString(sql, 1);
        System.out.println(user.toString());
    }

    @Test
    public void testAll(){
        String sql = "Select * from t_user";
        List<user> users = CRUDUtils.queryAll(sql);
        System.out.println(users);
    }
}
