package lesson3.circle;

public class CircleMain {

    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.radius = 4;
        circle.coordinateX = 10;
        circle.coordinateY = 20;

        Circle circle2 = new Circle();
        circle2.radius = 23;
        circle2.coordinateX = 40;
        circle2.coordinateY = 40;
        double area = circle.getArea();

        System.out.println(area);
        System.out.println(circle2.getDistanceTo(circle));
    }

}
