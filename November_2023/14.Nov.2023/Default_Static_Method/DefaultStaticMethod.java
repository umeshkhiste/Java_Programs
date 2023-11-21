package Default_Static_Method;

import Default_Static_Method.interface_default.derived_Class;

interface interface_default{
    default void default_method(){
        System.out.println("We are default method of interface");
    }
class derived_Class implements interface_default{

}

}

public class DefaultStaticMethod {
    public static void main(String[] args) {
        derived_Class obj1 = new derived_Class();
        obj1.default_method();
    }
    
}
