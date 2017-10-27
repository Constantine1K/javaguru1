package lesson2.variables;

public class PrimitiveWrappers {

    public static void main(String[] args) {
        Integer a = new Integer(5);
        Integer b = new Integer(5);

        boolean result = a == b;
        boolean isEqual = a.equals(b);

        System.out.println("== -> " + result);
        System.out.println("isEqual -> " + isEqual);

        Integer c = null;
        System.out.println("c = " + c);

        Integer fromString = Integer.parseInt("5");
        System.out.println("from string = " + fromString);
    }

}
