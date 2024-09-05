package Java_Basic;

public class Operators {

    public static void main(String[] args) {

        // Arithmetic operators
        int a = 12;
        int b = 5 ;
        boolean x = true;
        boolean y = false;

        // Arithmetic Operator
        System.out.println("Arithmetic Operations (+,-,*,/,%)");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));


        // Unary Operator
        System.out.println("Unary Operations: ");
        System.out.println("Postincrement : " + (a++));
        System.out.println("Preincrement : " + (++a));

        System.out.println("Postdecrement : " + (b--));
        System.out.println("Predecrement : " + (--b));

        // Logical Operator
        System.out.println("Logical Operations: ");
        System.out.println(" Logical AND (x && y) : " + (x && y));
        System.out.println(" Logical OR  (x || y) : " + (x || y));
        System.out.println(" Logical NOT (!x) : " + (!x));


    }
}
