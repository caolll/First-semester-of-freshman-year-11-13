package 第一个项目学生管理系统升级版;

public class user {
    private String user;
    private String password;
    private String phoneNumber;
    private String ID;

    public user() {
    }

    public user(String user, String password, String phoneNumber, String ID) {
        this.user = user;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.ID = ID;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
