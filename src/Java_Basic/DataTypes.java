package Java_Basic;

public class DataTypes {

    public static void main(String[] args) {

        byte byteNum = 2;
        short shortNum = 1;
        int intNum = 10;
        long longNum = 12334421;

        float floatNum = 5.25f;
        double doubleNum = 12.3452789d;
        boolean val =  true;
        char ch = 'A';
        char character = 'म';
        String name ="Rajas Rakhe";

        System.out.println("Print Primitive Data Types Values: ");
        System.out.println("Btye: "+ byteNum);
        System.out.println("Short: "+ shortNum);
        System.out.println("Integer: "+ intNum);
        System.out.println("Long: "+longNum);
        System.out.println("Float: "+floatNum);
        System.out.println("Double: "+doubleNum);
        System.out.println("Character: "+ ch);
        System.out.println("Print Non-Primitive Data Type: ");
        System.out.println("String: "+ name);

        /*
        In Java , char has 2 bytes means 16-bits
        For ASCII Code system , 8-bits are enough for ASCII characters
        But JAVA support Unicode code system which is internationally use
        For Unicode system, 8-bits are not enough hence Java use 2 bytes(16-bits) to represent character
        Example -  you can assign different language character/numeric/symbolic values to the variable and
        use it in Java.
        Example: Marathi letter '' is used below and printed also
        */
        System.out.println("Marathi Character: "+ character);

    }
}
