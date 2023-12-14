package Java_8;

import java.util.LinkedList;

public class LinkedList1 {
    public static void main(String[] args) {
     LinkedList<String> ll = new LinkedList<String>();
     ll.add("Umesh");
     ll.add("Prakash");
     ll.add("Khiste");
     ll.add("Khiste");

     java.util.Iterator<String> itr = ll.iterator();
    while (itr.hasNext()) {
        System.out.println(itr.next());        
        }
    }
}
