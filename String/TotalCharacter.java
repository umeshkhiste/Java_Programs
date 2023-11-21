package String;
//Java Program to count the total number of characters in a string

public class TotalCharacter {
    public static int countCharacters(String input){
        return input.length();
    }

    public static void main(String[] args) {
        String inputString = "This is a sample string for program";
        int characterCount = countCharacters(inputString);
        System.out.println("Input string: "+inputString);
        System.out.println("Total number of character: "+characterCount); 
    } 
}
