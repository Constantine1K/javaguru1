package homeworks.lesson5.user;

import java.util.Scanner;

public class UserLoginForm {

    public static void main(String[] args) {

        User user = new User("nick", "pass");

        Scanner scanner = new Scanner(System.in);
        boolean loggedIn = false;
        while (!user.isBlocked() || loggedIn){
            System.out.println("Enter your password : ");
            String password = scanner.next();
            loggedIn = user.verifyPassword(password);
            if (!loggedIn){
                System.out.println("Wrong password");
            }
        }

        if (user.isBlocked()){
            System.out.println("You are blocked");
        } else {
            System.out.println("Successful entrance");
        }

    }

}
