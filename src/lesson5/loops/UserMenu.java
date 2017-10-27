package lesson5.loops;

import java.util.Scanner;

public class UserMenu {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String userChoice = "";

        do{
            System.out.println("1. Print hello");
            System.out.println("2. Exit");
            System.out.print("Your choice : ");
            userChoice = scanner.next();
            if (userChoice.equals("1")){
                System.out.println("HELLO");
            }
        } while (!userChoice.equals("2"));

    }

}
