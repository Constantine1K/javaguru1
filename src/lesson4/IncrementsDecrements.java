package lesson4;

public class IncrementsDecrements {

    public static void main(String[] args) {
        int a = 0;
        int b = a--;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        int c = 0;
        int d = --c;
        System.out.println("c = " + c);
        System.out.println("d = " + d);

        int g = 4;
        g += 10;
        System.out.println("g = " + g);
    }
}
