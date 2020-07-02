package lu.ankang.ignitedemo.entity;

public class FrontUser {
    String userAccount;
    String password;
    String userName;

    @Override
    public String toString() {
        return "FrontUser{" +
                "userAccount='" + userAccount + '\'' +
                ", password='" + password + '\'' +
                ", userName='" + userName + '\'' +
                '}';
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }
}
