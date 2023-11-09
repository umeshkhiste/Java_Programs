import java.util.*;
public class LinkedListExample1 {
    public static void main(String[] args) {
       LinkedList<String> al = new LinkedList<String>();
        al.add("Umesh");
        al.add("Prakash");
        al.add("Khiste");
        al.add("Umesh");

        Iterator<String> itr = al.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());       
        }
    }
}
