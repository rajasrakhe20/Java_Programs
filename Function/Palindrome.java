package Function;

import java.util.Scanner;

public class Palindrome {


//   static boolean IsPalindrome(int n){
//       int rev=0;
//       int temp=n;
//
//       while(n!=0){
//           int digit=n%10;
//           rev=rev*10+digit;
//           n=n/10;
//       }
//       if(rev==temp){
//           return true;
//       }
//       else {
//           return false;
//       }
//
//   }

    static void palindrome(int n){
        int rev=0;
        int temp=n;
        while(n!=0){
            int digit=n%10;
            rev=rev*10+digit;
            n=n/10;
       }
        if(rev==temp){
            System.out.println("Given number is palindrome");

        }
        else {
            System.out.println("Not a palindrome");
        }
    }


    public static void main(String[] args) {
        int num;
        Scanner input= new Scanner(System.in);
        System.out.println("Enter number:");
        num=input.nextInt();

        palindrome(num);

//        boolean ans=IsPalindrome(num);
//        if (ans==true){
//            System.out.println("Given number is palindrome");
//        }
//        else{
//            System.out.println("Not Palindrome number");
//        }



    }
}
