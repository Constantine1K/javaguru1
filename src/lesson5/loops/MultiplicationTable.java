package lesson5.loops;

public class MultiplicationTable {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                int value = (i + 1) * (j + 1);
                System.out.print(value + " ");
            }
            System.out.println();
        }

    }

}
