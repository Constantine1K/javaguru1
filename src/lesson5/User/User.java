package lesson5.User;

public class User {
    private String nickname;
    private String password;
    private int loginAttemp = 3;
    private boolean blocked;

    public User(String nickname, String password, int loginAttemp){
        this.nickname = nickname;
        this.password = password;
        this.loginAttemp = loginAttemp;
            }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean verifyPassword(String verificationPassword){
        return verificationPassword.equals(password);
             }



    //public String toString(){
   //     return verifyPassword(String ver);

    }



