import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        //adding key, value pair
        hm.put("Umesh", 36);
        hm.put("Prakash", 60);
        hm.put("Khiste", 61);
        System.out.println("Before adding duplicate keys: ");
        System.out.println(hm);

        //adding duplicate keys
        hm.put("Khiste", 61);
        hm.put("Umesh", 36);
        System.out.println("After adding duplicate values");
        System.out.println(hm);
    }
}
