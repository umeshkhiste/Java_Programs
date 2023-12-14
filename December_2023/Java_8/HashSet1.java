package Java_8;

import java.util.HashSet;

public class HashSet1 {
    public static void main(String[] args) {
        try {
            HashSet<String> hs = new HashSet<String>();
            hs.add("Core Java");
            hs.add("Python");
            hs.add("Machine Learning");
            hs.add("Artificial Intelligent");

            System.out.println("Before adding duplicate and null values:");
            System.out.println(hs);

            //Adding duplicate values
            hs.add("Core Java");
            hs.add("Python");

            //Adding null 
            hs.add(null);
            hs.add(null);
            System.out.println("Adding few null values:");
            System.out.println(hs);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
