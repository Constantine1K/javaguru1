package lesson2.calculator;


import java.util.Scanner;

public class Calculator {

    /*
    * This class doesn't have any field
    * That mean class doesn't have a state
    * */

    /*
    * But class have one behaviour -
    * it can take two numbers from user and print sum
    * */
    void sum(){
        //scanner can take number from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int a = scanner.nextInt();
        System.out.println("Enter second number : ");
        int b = scanner.nextInt();
        int c = a + b;
        System.out.println("a + b = " + c);
    }
}
