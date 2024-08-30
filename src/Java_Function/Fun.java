package Java_Function;

public class Fun {
    public static void main(String[] args) {

        String message=greet(); // function call karun tyachi value message madhe store karat aahot
        System.out.println(message); // Inside static function we not able to call non static fucntion
        // that why we need to  make fucntion static
    }
    static String greet(){
        String str="How are you";
        return  str;
    }

}
