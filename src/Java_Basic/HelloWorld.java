package Java_Basic;

import java.util.Scanner;

public class HelloWorld {

    public static void print(){
        System.out.println("Java Programming");
    }
    public static void main(String[] args) {
        System.out.println("Hello world");
        System.out.println("Good Morning"+" Rajas");

        // static function madhun aapna non -static function call karu nahi shakat tya sathi fucntion sudha static karava lagta
        // See above , print() also made static in order to call it in main function
        print();

        //create object of scanner class
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=input.nextInt();
        System.out.println(num);
    }
}
