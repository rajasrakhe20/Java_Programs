package Java_Basic;

public class DataTypes {

    public static void main(String[] args) {

        int a = 10;
        float b = 5.25f;
        double c = 12.3452789d;
        boolean val =  true;
        char ch = 'A';
        String name ="Rajas Rakhe";

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(val);
        System.out.println(ch);
        System.out.println(name);

        /* Type Casting in Java
         Widening Casting : Where smaller data  type to larger data type conversion is done automatically

         Narrowing Casting: Larger data type to smaller data type conversion is done. I t is done manually.
         Both Examples are given below*/

        int num = 24;
        double myNum  = num;
        System.out.println(myNum);

        double value = 9.2356d;
        int answer = (int) value;
        System.out.println(answer);

    }
}
