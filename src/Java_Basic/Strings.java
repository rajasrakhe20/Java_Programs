package Java_Basic;

import java.util.Locale;

public class Strings {

    public static void main(String[] args) {

        String message = "Java Programming";
        System.out.println(message);

        System.out.print("Length od string is: ");
        System.out.println(message.length());

        System.out.print("Making UPPERCASE:");
        System.out.println(message.toUpperCase());

        System.out.print("Making Lowercase:");
        System.out.println(message.toLowerCase());

        // Concatenation

        System.out.print("Concatenation of two strings: ");
        System.out.println("Welcome to "+ message);

        String s1 = "Welcome to Java Programming:  ";
        String s2 = "Rajas Rakhe";
        System.out.println(s1.concat(s2));

        // indexOf()
        System.out.print("IndexOf in Java: ");
        System.out.println(s1.indexOf("Java"));

    }
}
