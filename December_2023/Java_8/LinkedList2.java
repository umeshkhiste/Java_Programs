package Java_8;
import java.util.LinkedList;

public class LinkedList2 {
    public static void main(String[] args) {
        try {
        LinkedList<Integer> linkedlist = new LinkedList<Integer>();
        linkedlist.add(25);
        linkedlist.add(35);
        linkedlist.add(45);

        System.out.println(linkedlist);

        System.out.println("Add first");
        linkedlist.addFirst(15);
        System.out.println(linkedlist);

        System.out.println("Add last");
        linkedlist.addLast(55);
        System.out.println(linkedlist);

        System.out.println("Remove first");
        linkedlist.removeFirst();
        System.out.println("After removal list: "+ linkedlist);

        System.out.println("Remove last");
        linkedlist.removeLast();
        System.out.println("After remove last element list: "+linkedlist);  
        } catch (Exception e) {
            System.out.println(e);
        }      
    }
}
