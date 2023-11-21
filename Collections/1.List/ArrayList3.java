import java.util.ArrayList;
import java.util.*;

public class ArrayList3 {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<String>();
        list1.add("Apple");
        list1.add("Banana");
        list1.add("Banana");
        list1.add("Grapes");
        list1.add("Apple");

        Collections.sort(list1);
        for(String fruit:list1)
        System.out.println(fruit);

        System.out.println("\n Sorting numbers");
        List<Integer> list2 = new ArrayList<Integer>();
        list2.add(21);
        list2.add(11);
        list2.add(33);
        list2.add(5);
        list2.add(5);

        Collections.sort(list2);
        for(Integer number:list2)
        System.out.println(number);
    }    
}
