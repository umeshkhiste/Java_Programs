package Java_8;

import java.util.stream.IntStream;

public class MinMaxExample {
    public static void main(String[] args) {
    int[] numbers = {9,5,7,0,6,8,3,4,1};
    int min = IntStream.of(numbers).min().getAsInt();
    int max = IntStream.of(numbers).max().getAsInt();
    System.out.println("Minimum number: "+min);
    System.out.println("Maximum number: "+max);
    }
}
