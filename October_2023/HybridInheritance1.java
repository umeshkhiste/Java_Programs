package October_2023;

class HumanBody{
    public void displayHuman(){
        System.out.println("Method defined inside humanbody class");
    }
}

interface Male{
    public void show();
}

interface Female{
    public void show();
}

public class Child extends HumanBody implements Male, Female{
    public void show(){
        System.out.println("Implementation of show method defined in interfaces");
    }

    public void displayChild(){
        System.out.println("Method defined inside child class");
    }

public class HybridInheritance1 {
    public static void main(String[] args) {
        Child c = new Child();
        System.out.println("Implementation of Hybrid inheritance in Java");
        c.show();
        c.displayChild();
    }
}
}

