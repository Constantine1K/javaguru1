package homeworks.lesson6;

import java.util.Random;

public class ReversePrintOut {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
            System.out.println((i+1) + ". " + array[i]);
        }
        System.out.println();

        for (int i = array.length - 1; i >= 0 ; i--) {
            System.out.println(array[i]);

        }
    }
}
