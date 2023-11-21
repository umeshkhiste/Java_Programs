/*Encapsulation:
Encapsulation is the process of binding the code and the data together into a single unit. 
Here, the variables of a class are hidden from other classes (by using the keyword private)
 but can only be accessed through a member function. Setter and getter functions are used to 
 access the private variables of a class that is abstract. 
 */

package OOPS;

public class Encapsulation {
    private String name;

    public String getName()
    {
        return name;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }

    public static void main(String[] args) {
        Encapsulation en = new Encapsulation();
        en.setName("Umesh");
        System.out.println(en.getName());
    }
}
