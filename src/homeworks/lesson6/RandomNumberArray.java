package homeworks.lesson6;

import java.util.Random;

public class RandomNumberArray {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println((i+1) + ". " + array[i]);

        }


    }
}
