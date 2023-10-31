package October_2023.Java_8;

interface Sayable{
    public String say();
}

public class LambdawithNoParam {
    public static void main(String[] args) {
        Sayable s=()->{
            return "I have nothing to say";
        };
        System.out.println(s.say());
    }
}
