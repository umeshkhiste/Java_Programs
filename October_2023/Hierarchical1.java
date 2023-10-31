package October_2023;

class Parent{
    void printName(){
        System.out.println("Inside class parent");
    }
}

class Daughter extends Parent{
    void age(int iage){
        System.out.println("Her age is: ${age}");
    }
}

class Son extends Parent{
    void name(String stringname){
        System.out.println("My name is: ${name}");
    }
}

public class Hierarchical1 {
    public static void main(String[] args) {
        Daughter d = new Daughter();
        d.printName();
        d.age(18);

       Son s = new Son();
       s.printName();
       s.name("Umesh"); 
    }
    
}
