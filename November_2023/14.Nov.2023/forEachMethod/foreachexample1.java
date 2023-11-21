package forEachMethod;

import java.util.List;
import java.util.ArrayList;

public class foreachexample1 {
    public static void main(String[] args) {
        List<String> subList = new ArrayList<String>();
        subList.add("Carrot");
        subList.add("Potato");
        subList.add("Cauliflower");
        subList.add("LadyFinger");
        subList.add("Tomato");
        System.out.println("--------Vegetables List--------------");
        subList.forEach(sub->System.out.println(sub));
    }
}
