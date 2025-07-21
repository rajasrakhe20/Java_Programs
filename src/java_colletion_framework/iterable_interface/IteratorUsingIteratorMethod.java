package java_colletion_framework.iterable_interface;

import java.util.*;

public class IteratorUsingIteratorMethod {

    public static void main(String[] args) {

        List<Character> letters = new ArrayList<>();
        letters.add('A');
        letters.add('B');
        letters.add('1');
        letters.add('$');

        Iterator<Character> it = letters.iterator();

        System.out.println("Printing Characters: ");

        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}
