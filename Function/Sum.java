package Function;

import java.util.Scanner;

public class Sum {


    // Creating function
    // static return data_type function_name(parameters){
    //  code to be executed;
    //  }

    static int sum(int n , int m){
        int s;
        s=n+m;
        return s;
    }


    public static void main(String[] args) {

        int a, b;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        a=input.nextInt();
        b= input.nextInt();

       int ans= sum(a,b);
       int ans1=sum(12,5);
        System.out.println("Sum is: "+ ans);
    }

}
