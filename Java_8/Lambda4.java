package Java_8;

import java.util.ArrayList;
import java.util.List;

public class Lambda4 {
    public static void main(String[] args) {
        //Lambda Expression Example: Foreach Loop
        List<String> list = new ArrayList<String>();
        list.add("Umesh");
        list.add("Prakash");
        list.add("Khiste");

        list.forEach(
            (n)-> System.out.println(n)
        );
    }
}
