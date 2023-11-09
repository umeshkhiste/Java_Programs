// LinkedList example to reverse list of element

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample2 {
    public static void main(String[] args) {
        LinkedList<String> l = new LinkedList<String>();
        l.add("Umesh");
        l.add("Prakash");
        l.add("Khiste");

        Iterator i = l.descendingIterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }
    }
}
