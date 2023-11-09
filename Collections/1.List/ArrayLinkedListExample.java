import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayLinkedListExample {
    public static void main(String[] args) {
        List<String> l = new ArrayList<String>();
        l.add("Umesh");
        l.add("Prakash");
        l.add("Khiste");

        List<String> l1 = new LinkedList<String>();
        l1.add("Deepali");
        l1.add("Umesh");
        l1.add("Khiste");

        System.out.println("ArrayList: "+l);
        System.out.println("LinkedList: "+l1);
    }
}
