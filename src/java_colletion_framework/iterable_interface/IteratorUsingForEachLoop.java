package java_colletion_framework.iterable_interface;

import java.util.*;

public class IteratorUsingForEachLoop {
    public static void main(String[] args) {

        List<Integer> values = new ArrayList<Integer>();
        values.add(1);
        values.add(2);
        values.add(3);
        values.add(4);
        values.add(5);

        System.out.println("Printing Numbers in an Array: ");

        values.forEach((val)->{
            System.out.println(val);
        });


    }
}
