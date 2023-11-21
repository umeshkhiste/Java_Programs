package October_2023.Java_8;

interface Sayable{
    public String say(String name);
}

public class Lambdasingleparam {
    public static void main(String[] args) {
        Sayable s1 = (name)->{
            return "Hello," +name;
        };
        System.out.println(s1.say("Umesh"));

        Sayable s2 = name ->{
            return "Hello,"+name;
        };
        System.out.println(s2.say("Khiste"));
    }
}
