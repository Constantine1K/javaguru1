package lesson5.User;

public class UserTest {
    public static void main(String[] args) {
        User user = new User("new", "123",3);

        user.verifyPassword("abc");

        System.out.println(user);


    }
}
