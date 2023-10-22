// Program showing method reference 

package Java_8;

import java.util.ArrayList;
import java.util.List;

public class forEach2 {
    public static void main(String[] args) {
        List<String> gamesList = new ArrayList<String>();
        gamesList.add("Football");
        gamesList.add("Cricket");
        gamesList.add("Chess");
        gamesList.add("Football");
        System.out.println("Iterating by passing method reference:");
        gamesList.forEach((System.out::println));
    }  
}
