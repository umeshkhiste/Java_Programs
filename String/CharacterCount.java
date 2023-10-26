package String;

public class CharacterCount {
    public static int countCharacters(String input){
        int count = 0;
        for(int i = 0; i<input.length();i++){
            if(!Character.isWhitespace(input.charAt(i))){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String inputString = "This is a sample string with character.";
        int characterCount = countCharacters(inputString);
        
        System.out.println("Input string: "+inputString);
        System.out.println("Total number of characters: "+characterCount);
    }
}
