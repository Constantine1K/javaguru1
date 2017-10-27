package lesson2.variables;

public class DoubleVariables {

    public static void main(String[] args) {
        double a = 4.0;
        double b = 5.0;
        double c = a / b;
        System.out.println("c = " + c);

        c = 1 / 0.0;
        System.out.println("c = " + c);

        c = 5 / 3.0;
        System.out.println("5 / 3 = " + c);

        a = 0.1;
        b = 0.1;
        c = a + b + 0.1;
        System.out.println(c);
    }

}
