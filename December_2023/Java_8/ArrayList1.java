package Java_8;

import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

public class ArrayList1 
{
    public static void main(String[] args) {   
        List<String> list = new ArrayList<String>();
        list.add("Apple");
        list.add("Banana");
        list.add("Carrot");
        list.add("Banana");

        int sizeArray = list.size();
        System.out.println("Size of the ArrayList: " +sizeArray);

        //Print ArrayList
        //System.out.println("ArrayList: " +list);

        /* Getting elements from ArrayList
        String getArray = list.get(1);
        System.out.println("ArrayList(4): "+ getArray); */

        /* Modify ArrayList
        System.out.println("Original ArrayList: " +list);
        list.set(3, "IceCream");
        System.out.println("Modified ArrayList: "+list); */

        /* Remove ArrayList Element
        System.out.println("Original ArrayList: " +list);
        String removeArray = list.remove(3);
        System.out.println("ArrayList after remove: "+ list);
        System.out.println("Removed element: "+ removeArray); */
        

        Collections.sort(list);
        for(String fruit:list)
        {
            System.out.println(fruit);
        }
    }
}
