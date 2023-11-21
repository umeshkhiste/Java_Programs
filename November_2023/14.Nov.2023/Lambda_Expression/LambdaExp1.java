import java.lang.FunctionalInterface;

@FunctionalInterface
interface MyInteface{
    double getPiValue();
}

public class MyInteface{
    public static void main(String[] args) {
        MyInterface ref;
        ref = ()-> 3.14159;
        System.out.println("Value of Pi="+ref.getPiValue());
    }
}