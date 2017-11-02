package homeworks.lesson6;

import java.util.Random;

public class ReverseArrayCopy {
    public static void main(String[] args) {
        Random random = new Random();
        int[] firstArray = new int[10];
        int[] secondArray = new int[10];
        for (int i = 0; i < firstArray.length; i++) {
            firstArray[i] = random.nextInt(100);
            System.out.println((i+1) + ". " + firstArray[i]);
        }
        int j = 0;
        for (int i = firstArray.length - 1; i >= 0 ; i-- ) {
            secondArray[j] = firstArray[i];
            j++;
            
        }
        System.out.println("Reversed array:");
        for (int i = 0; i < secondArray.length; i++) {
            System.out.println((i+1) + ". " + secondArray[i]);

        }




        }



    }

