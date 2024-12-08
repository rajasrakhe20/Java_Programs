package Java_OOPS;
import  java.util.*;

 interface Shape{

     double findArea();

}

class Circle implements Shape{
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }


    @Override
    public double findArea() {
        return Math.PI*radius*radius;
    }
}

public class Abstraction {

    public static void main(String[] args) {

        Circle myShape = new Circle(2.1);
        double result = myShape.findArea();

        System.out.println("Area of circle is: "+ result);

    }


}
