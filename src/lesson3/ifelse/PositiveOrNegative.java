package lesson3.ifelse;

import java.util.Scanner;

public class PositiveOrNegative {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number : ");
        int a = scanner.nextInt();

        if (a >= 0){
            System.out.println("Positive");
        } else {
            System.out.println("Negative");
        }
    }

}
