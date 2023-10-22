package Java_8;

interface Sayable{
    public String say(String name);
}

public class Lambda3 {
    public static void main(String[] args) {
        //Lambda Expression Example: Single Parameter
        Sayable s1 = (name)->{
            return "Hello" +name;
        };
        System.out.println(s1.say("Umesh"));

        Sayable s2 = name ->{
            return "Hello" +name;
        };

        System.out.println(s2.say("Khiste"));
    }    
}
