import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<String>();
        //adding values to hashset
        hs.add("Java");
        hs.add("Python");
        hs.add("Machine Learning");
        hs.add("Artificial Inteligence");

        System.out.println("Before adding duplicates and null values");

        System.out.println(hs);
        
        //adding duplicate values
        hs.add("Java");
        hs.add("Python");
        System.out.println("After adding duplicate values");
        System.out.println(hs);

        //adding null values
        hs.add(null);
        hs.add(null);
        System.out.println("After adding null values");
        System.out.println(hs);

    }
}
