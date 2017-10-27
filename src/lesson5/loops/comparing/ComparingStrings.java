package lesson5.loops.comparing;

public class ComparingStrings {

    public static void main(String[] args) {

        String s0 = "s0";
        String s1 = "s0";

        String s2 = new String("s2");
        String s3 = new String("s2");

        System.out.println("s0 == s1 = " + (s0 == s1));
        System.out.println("s2 == s3 = " + (s2 == s3));
        System.out.println("s2 equals s3 = " + (s2.equals(s3)));
    }

}
