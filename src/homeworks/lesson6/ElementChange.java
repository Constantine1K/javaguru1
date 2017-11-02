package homeworks.lesson6;

import java.util.Random;
import java.util.Scanner;

public class ElementChange {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println((i+1) + ". " + array[i]);

        }
        int a = 0;
        System.out.println("Please enter number: ");
        a = scanner.nextInt();

        for (int i = 0; i < array.length; i++) {
            if (array[i] < a){
                array[i] = a;
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println((i+1) + ". " + array [i]);

        }

    }
}
