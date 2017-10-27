package lesson2.variables;

public class Variables {

    public static void main(String[] args) {
        int a = 4;
        int b = 5;
        int c = a + b;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("a + b = " + c);

        c = c + 1;
        System.out.println("c = c + 1 -> " + c);

        // here will be unexpected result because int can't store 4kkk value
        c = 2000000000 * 2;
        System.out.println(c);
    }
}
