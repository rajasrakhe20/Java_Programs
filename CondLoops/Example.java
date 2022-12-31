package CondLoops;

import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        int sum=0,num=0,max=0;
        Scanner in = new Scanner(System.in);
        while((num=in.nextInt())!=0){
            if (num>max){
                max=num;
            }
        }
        System.out.println("Max= "+max);
    }
}
