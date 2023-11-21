//package Collections;
import java.util.HashMap;

public class HashMapSum {
    public static void main(String[] args) {
        HashMap<String,Integer> keyValueMap = new HashMap<>();

        keyValueMap.put("A",10);
        keyValueMap.put("B",20);
        keyValueMap.put("C",30);
        keyValueMap.put("D",40);

        int sum = 0;
        for(Integer value : keyValueMap.values()){
            sum += value;
        }

        System.out.println("Sum of values:"+sum);
    }   
}
