package lu.ankang.ignitedemo.model;

import org.apache.ignite.cache.query.annotations.QuerySqlField;

import java.util.HashMap;
import java.util.Map;

// 登陆账户作为主键在这里不出现
public class User {
    // 登陆密码
    @QuerySqlField
    private String password;





    // 用户ID
    @QuerySqlField
    private int userId;

    // 用户名
    @QuerySqlField
    private String userName;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getUserID() {
        return userId;
    }

    public void setUserID(int userID) {
        this.userId = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
