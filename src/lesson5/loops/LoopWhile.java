package lesson5.loops;

public class LoopWhile {

    public static void main(String[] args) {

        System.out.println("-----FOR-----");
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello");
        }

        System.out.println("-----WHILE----");
        //the same with while loop
        int i = 0;
        while (i < 10){
            System.out.println("Hello");
            i++;
        }

        System.out.println("-----DO-WHILE----");
        //not the same, because one iteration will be executed
        i = 10;
        do{
            System.out.println("Hello");
            i++;
        } while (i < 10);

    }

}
