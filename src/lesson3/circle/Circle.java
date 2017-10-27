package lesson3.circle;

import static java.lang.Math.PI;

public class Circle {

    double radius;
    int coordinateX;
    int coordinateY;

    double getArea(){
        double area = Math.PI * Math.pow(radius, 2);
        return area;
    }

    double getDistanceTo(Circle circle){
        double cathetusX = Math.abs(coordinateX - circle.coordinateX);
        double cathetusY = Math.abs(coordinateY - circle.coordinateY);
        double squareHipotenuse = Math.pow(cathetusX, 2) + Math.pow(cathetusY, 2);
        double distance = Math.sqrt(squareHipotenuse);
        return distance;
    }

}
