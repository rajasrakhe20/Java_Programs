package Function;

import java.util.Scanner;
import java.util.*;

public class PrimeNumber {

    static boolean isPrime(int num){
        if(num<=1){
            return false;
        }
        for (int i = 2; i <=Math.sqrt(num) ; i++) {
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {

        int num;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter number: ");
        num=input.nextInt();
        boolean ans=isPrime(num);

        if(ans==true){
            System.out.println("Given number is prime number");
        }
        else{
            System.out.println("Given number is not prime number");
        }
    }
}
