package homeworks.lesson5.user;

public class User {

    private String nickname;
    private String password;
    private int loginAttemptsLeft = 3;
    private boolean blocked;

    public User(String nickname, String password) {
        this.nickname = nickname;
        this.password = password;
        this.blocked = false;
    }

    public boolean isBlocked() {
        return blocked;
    }

    public boolean verifyPassword(String password){
        if (blocked){
            return false;
        }
        if (this.password.equals(password)){
            loginAttemptsLeft = 3;
            return true;
        }
        loginAttemptsLeft--;
        if (loginAttemptsLeft < 1){
            blocked = true;
        }
        return false;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}
