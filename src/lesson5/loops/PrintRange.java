package lesson5.loops;

import java.util.Scanner;

public class PrintRange {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("From : ");
        int from = scanner.nextInt();
        System.out.println("To : ");
        int to = scanner.nextInt();

        for (int i = from; i <= to; i++) {
            System.out.println(i);
        }

    }

}
