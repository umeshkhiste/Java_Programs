package OOPS;

class Parent
{
    void printName()
    {
        System.out.println("Inside parent class");
    }
}

class Daughter extends Parent
{
    void age(int iage)
    {
        System.out.println("My age is: ${age}");
    }
}

class Son extends Parent
{
    void name(String iname)
    {
        System.out.println("My Name is:${name}");
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        Daughter d = new Daughter();
        d.printName();
        d.age(7);

        Son s = new Son();
        s.printName();
        s.name("Umesh");
    }
}
