package lesson5.loops;

import java.util.Scanner;

public class ForTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        System.out.print("Input numbers count : ");
        int count = scanner.nextInt();

        for (int i = 0; i < count; i++) {
            System.out.print("Input next number : ");
            sum += scanner.nextDouble();
        }

        double average = sum / count;
        System.out.println("Average = " + average);
    }

}
