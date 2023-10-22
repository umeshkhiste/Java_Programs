//Program showing both lambda expression and method reference

package Java_8;

import java.util.ArrayList;
import java.util.List;

public class forEach3 {
    public static void main(String[] args) {
        List<String> gamesList = new ArrayList<>();
        gamesList.add("Football");
        gamesList.add("Cricket");
        gamesList.add("Chess");
        gamesList.add("Hocky");
        System.out.println("Iterating by passing lambda expression:");
        gamesList.stream().forEachOrdered(games -> System.out.println(games));
        System.out.println("Iterating by passing method reference:");
        gamesList.stream().forEachOrdered(System.out::println);
    }
}
