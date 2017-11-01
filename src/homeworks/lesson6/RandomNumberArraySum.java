package homeworks.lesson6;

import java.util.Random;

public class RandomNumberArraySum {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(50);
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println((i+1) + ". " + array[i]);

        }
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("Total sum of an array: " + sum);


    }
}
