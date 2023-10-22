// Program showing lambda expression 

package Java_8;

import java.util.ArrayList;
import java.util.List;

public class forEach1 {
    public static void main(String[] args) {
        List<String> gameList = new ArrayList<String>();
        gameList.add("Football");
        gameList.add("Cricket");
        gameList.add("Chess");
        gameList.add("Hocky");
        System.out.println("Iterating by passing lambda expression:");
        gameList.forEach(games ->System.out.println(games));    
    }
}
