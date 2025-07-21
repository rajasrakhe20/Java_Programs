package java_colletion_framework.iterable_interface;

import java.util.*;

public class IteratorUsingEnhancedForLoop {

    public static void main(String[] args) {

        List<String> languages = new ArrayList<String>();
        languages.add("C Language");
        languages.add("Java");
        languages.add("C++");
        languages.add("Python");

        System.out.println("Various Types of programming languages: ");
        for(String val: languages){
            System.out.println(val);
        }

        // Here we are using Enhanced for loop method to iterate over the object(that storing names of programming
        // langauges) that have implemnted the interable interface
        // List is an interface that extends interable interface
        // languages is  reference variable of type List that is holding strings.
        //new ArrayList<String>() - This creates a new instance of the ArrayList class (which implements List) to store String objects.
        //"languages is a reference variable pointing to a List (specifically an ArrayList) object that stores String elements"
    }
}
