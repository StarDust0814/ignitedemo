package lu.ankang.ignitedemo.model;

import org.apache.ignite.cache.query.annotations.QuerySqlField;

public class UserDTO {

    // 登录用户名
    private String userAccount;

    // 登陆密码
    @QuerySqlField
    private String password;

    // 用户ID
    @QuerySqlField
    private int userID;

    // 用户名
    @QuerySqlField
    private String userName;

    public UserDTO() {
    }

    public UserDTO(String key, User value) {
        this.userAccount = key;
        this.password = value.getPassword();
        this.userID = value.getUserID();
        this.userName = value.getUserName();
    }

    public String getUserAccount() {
        return userAccount;
    }

    public String getPassword() {
        return password;
    }

    public int getUserID() {
        return userID;
    }

    public String getUserName() {
        return userName;
    }
}
