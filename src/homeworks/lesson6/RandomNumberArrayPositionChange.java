package homeworks.lesson6;

import java.util.Random;

public class RandomNumberArrayPositionChange {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(50);
        }
        int max = array[0];
        int index = 0;
        int firstNumber = array[0];
        for (int i = 0; i < array.length; i++) {
            System.out.println((i+1) + ". " + array[i]);
            if (max < array[i]){
                max = array[i];
                index = i;
            }

        }
        System.out.println();
        array[0] = max;
        array[index] = firstNumber;
        for (int i = 0; i < array.length; i++) {
            System.out.println((i + 1) + ". " + array[i]);
        }

    }
}
