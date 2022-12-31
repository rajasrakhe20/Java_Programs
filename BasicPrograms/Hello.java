package BasicPrograms;

import java.util.Scanner;

public class Hello {


    public static void main(String[] args) {

        System.out.println("अक्षय");
        System.out.println("Hello Akshay");

        float num = 9.2f; /// float=(float)9.2;
        double n1=9.234545;

         char ch='A';
         String name= "akshay";

         String Name;

         int age;

         float height = 162.5f;

          long  salary = 12088680;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter user name:");

        Name=input.next();
        System.out.print("Enter your age");
        age=input.nextInt();
        System.out.println("Hello " +Name +" Your age is "+ age );
        System.out.println("Your height is"+ height);
        System.out.println("Your salary"+salary);


        // Check size of data type
        // syntax: data_type.SIZE/8;

        System.out.println("Size of int is: "+Integer.SIZE/8);

    }
}
