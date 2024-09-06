package Java_Basic;

import java.util.Scanner;

public class Input {

    public static void main(String[] args) {

        // There are two ways in Java to take inputs
        // One way using Scanner class in Java
        // Easy and latest way of taking inputs
        // Syntax - Scanner scn = new Scanner(System.in);

        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int a = input.nextInt();
        int b= input.nextInt();
        System.out.println("Sum is: "+(a+b));

        String str1 = input.next();

        // print String
        System.out.println("Entered String str1 : " + str1);

        // input is a String ( complete Sentence )
        // read by nextLine()function
        String str2 = input.nextLine();

        // print string
        System.out.println("Entered String str2 : " + str2);

        Scanner obj = new Scanner(System.in);
        String name;
        int rollno;
        float marks;

        System.out.println("Enter your name");

        // taking string input
        name = obj.nextLine();
        System.out.println("Enter your rollno");

        // taking integer input
        rollno = obj.nextInt();
        System.out.println("Enter your marks");

        // taking float input
        marks = obj.nextFloat();

        // printing the output
        System.out.println("Name=" + name);
        System.out.println("Rollno=" + rollno);
        System.out.println("Marks=" + marks);
    }
}
