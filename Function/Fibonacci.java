package Function;

public class Fibonacci {


    static void Fibo(int limit){
        limit++;
        int a=0 , b=1 ,c;
        int i=2;
        System.out.println("Fibonacci series: ");
        System.out.print(a+" ");
        System.out.print(b+" ");
        while(i<limit){
            c=a+b;
            System.out.print(c+" ");

            a=b;
            b=c;
            i++;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int limit=7;
        Fibo(limit);

        limit=limit+5;

        System.out.println(limit);




    }
}
