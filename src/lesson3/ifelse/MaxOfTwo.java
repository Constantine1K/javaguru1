package lesson3.ifelse;

import java.util.Scanner;

public class MaxOfTwo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = scanner.nextInt();
        System.out.println("Enter second number");
        int b = scanner.nextInt();

        if(a > b){
            System.out.println("Max a = " + a);
        } else if (b > a){
            System.out.println("Max b = " + b);
        } else {
            System.out.println("a = b = " + a);
        }

    }

}
