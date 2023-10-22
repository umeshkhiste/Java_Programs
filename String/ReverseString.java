package String;

public class ReverseString {
    public static String reverseString(String input){
        StringBuilder stringBuilder = new StringBuilder(input);
        stringBuilder.reverse();
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        String originalString = "Umesh Prakash Khiste";
        String reverseString = reverseString(originalString);

        System.out.println("Original String: "+originalString);
        System.out.println("Reverse String: "+reverseString);
    }
}
