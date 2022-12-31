package Function;

public class DgitSum {

    static void digitsum(int num){
        int sum=0;
        while(num!=0){
           int digit=num%10;
           sum=sum+digit;
           num=num/10;
        }
        System.out.println("Sum of digits is: "+sum);
    }

    public static void main(String[] args) {
        int n=786;
        digitsum(n);
        digitsum(123);
        digitsum(444);
        digitsum(256);
    }
}
