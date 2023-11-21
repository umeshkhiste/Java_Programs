/*
Inheritance:
The term inheritance refers to inheriting the properties of one class to another. 
The properties refer to the attributes and methods of the parent class. 
The parent class is that class whose properties need to be inherited by other classes. 
The classes that inherit the properties of the parent class are called the child class or subclass.
To inherit the properties of the parent class into the child class, 
a keyword called extends is used. 
*/

package OOPS;

public class Sponcer_Inheritance {
    protected String owner = "Rakuteen";
}

class Team extends Sponcer_Inheritance{
    private String teamName = "Barcalona";
    public static void main(String[] args) {
        Team t = new Team();
        System.out.println(t.owner+" "+t.teamName);
    }
}
