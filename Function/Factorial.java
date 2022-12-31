package Function;

public class Factorial {


    static void factorial(int num){
        num=num+3;
        int fact=1;
        for(int i=1;i<=num;i++){
            fact=fact*i;
        }
        System.out.println("Factorial is: "+ fact);

    }


    public static void main(String[] args) {

        int n1=4,n2=5,n3=6;
        factorial(n1);
        System.out.println(n1);
        factorial(n2);
        factorial(n3);
        factorial(2);
        factorial(n3-n2);
        factorial(0);
    }
}
