package Java_8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda6 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Umesh","Prakash","Khiste");
        List<String> filteredNames = names.stream()
        .filter(name -> name.startsWith("U"))
        .map(name -> name.toUpperCase())
        .collect(Collectors.toList());
        System.out.println(filteredNames);
    }
}
