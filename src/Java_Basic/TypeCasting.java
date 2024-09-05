package Java_Basic;

import  java.util.*;

public class TypeCasting {

//    Type Casting in Java:
//    Converting one form of data type into another form of data type is called as type casting
//
//      Two types of type casting in Java:

//         Widening Casting :
//         - Where smaller data  type to larger data type conversion.
//         - This type casting is done automatically.
//
//         Narrowing Casting:
//         - Larger data type to smaller data type conversion is done.
//         - It is done manually.
//         - Both Examples are given below
//
    public static void main(String[] args) {

        int Intnum = 24;
        double flotNum  = Intnum;

        System.out.println("Integer is type casted to float");
        System.out.println("Integer ----> Float: " + flotNum);
        System.out.println("This is called as Widening Casting in Java");

        double DoubleValue = 9.2356d;
        int IntValue = (int) DoubleValue;

        System.out.println("Double is type casted to integer");
        System.out.println("Double ----> Integer: " + Intnum);
        System.out.println("This is called as Narrowing Casting in Java");

    }



}
