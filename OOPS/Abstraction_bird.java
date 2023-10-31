/*Abstraction:
Abstraction is the process of hiding certain data from the users and showing only the required 
information to them. For instance, while driving a car, we are not concerned about internal 
functions or mechanisms. What is shown to us are the speed at which the car is being driven
and the litres of petrol available. All the other marginalized data are not displayed to the
driver. 

The abstract keyword is used for methods and classes while performing abstraction. 
For an abstract class, we cannot create an object while the abstract method should not include
a body. If any of the two rules are violated, the output will generate an error.
*/

package OOPS;

abstract class Abstraction_bird {
    public abstract void animalSound();
    public void working(){
        System.out.println("working");
    }
}

class Duck extends Abstraction_bird{
    public void animalSound(){
        System.out.println("Making noice...");
    }
}

class main{
    public static void main(String[] args) {
        Duck d = new Duck();
        d.working();
        d.animalSound();
    }
}


