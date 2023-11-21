package OOPS;

abstract class Abstraction1 {
    public abstract void sound();
}

public class lion extends Abstraction1{
    public void sound(){
        System.out.println("Roar");
    }
    public static void main(String[] args) {
        Abstraction1 ab = new lion();
        ab.sound();
    }
}
