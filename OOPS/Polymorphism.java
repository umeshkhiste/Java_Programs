/*
 Polymorphism:
Polymorphism allows the programmer to perform different tasks using the same variable or function.
 A real-life example of polymorphism would be- consider an open ground, now this ground can be used 
 for playing sports.
Besides, it could also be used to organize weddings and concerts. Lastly, the same ground can be
 used for parking vehicles. From this, we can infer that a single variable can have multiple 
 implementations depending upon its usage. 

The polymorphism we usually come across two terms namely- Method overloading and Method overriding.
In Method Overloading, a single method can be used in numerous ways and perform different functions. The methods will have the same name but different parameters can be used as input. 
In Method Overriding, the method of the parent class can be overridden by the child class.
 With this, the same method can perform differently when invoked by the parent class and 
 by the child class. 
 */

package OOPS;

class polymorphism {
    public void voice(){
        System.out.println("Bird making noice...");
    }
}

class Duck extends polymorphism{
    public void voice(){
        System.out.println("Duck making noice...");
    }
}

class main{
    public static void main(String[] args) {
        polymorphism p = new polymorphism();
        p.voice();

        Duck d = new Duck();
        d.voice();
    }
}
