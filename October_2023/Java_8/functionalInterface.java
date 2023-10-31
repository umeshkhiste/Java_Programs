package October_2023.Java_8;

@FunctionalInterface
interface sayable{
    void say(String msg);
}

public class functionalInterface implements sayable{
    public void say(String msg){
        System.out.println(msg);
    }
    public static void main(String[] args) {
        functionalInterface f = new functionalInterface();
        f.say("Hello there");
    }
}
