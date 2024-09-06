package Java_Basic;

import java.util.*;

public class Conditional {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = input.nextInt();

        if(age>18){
            System.out.println("Your Eligible to drive a vehicle");
        }
        else{
            System.out.println("You are not eligible to drive a vehicle");
        }

    }
}
