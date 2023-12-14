//https://www.programiz.com/java-programming/hashmap

package Java_8;
import java.util.HashMap;

public class HashMap1 {
    public static void main(String[] args) {
        try {
            var hmp = new HashMap<String, Integer>();
            //Adding key, value pair
            hmp.put("Umesh", 36);
            hmp.put("Deepali", 32);
            hmp.put("Priti", 7);

            Integer ind = hmp.get(1);
            System.out.println("Value at Index 1 is: " +ind);

            System.out.println("Before adding duplicate keys: ");
            System.out.println(hmp);

            //Adding duplicate values
            hmp.put("Priti", 7);
            System.out.println("After adding duplicate values: ");
            System.out.println(hmp);

            // Return set of keys using keyset()
            System.out.println("Keys are: "+hmp.keySet());

            // Return set of values using values()
            System.out.println("Values are: " +hmp.values());

            // Return entry set
            System.out.println("Complete set: " +hmp.entrySet());

            // Changing element with set 2
            var rhmp = hmp.replace("Khiste", 2);
            System.out.println("Values after replace: "+rhmp);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
