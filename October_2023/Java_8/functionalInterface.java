package October_2023.Java_8;

@FunctionalInterface
interface Animal{
    void Dog(String msg);
}

public class functionalInterface implements Animal{
    public void Dog(String msg){
        System.out.println(msg);
    }
    public static void main(String[] args) {
        functionalInterface f = new functionalInterface();
        f.Dog("Calling dog");
    }
}
