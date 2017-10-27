package lesson2.variables;

public class BooleanVariables {

    public static void main(String[] args) {
        int a = 4;
        int b = 4;
        boolean c = a < b;
        System.out.println("a < b = " + c);

        a = 3;
        b = 4;
        c = (a != b) && (a < b);
        System.out.println("a != b && a < b = " + c);

        int firstNumber = 4;
        int secondNumber = 4;
        boolean result = (firstNumber != secondNumber) && (firstNumber < secondNumber);
    }

}
