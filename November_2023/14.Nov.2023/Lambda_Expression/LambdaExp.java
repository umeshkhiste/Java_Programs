
interface MyInterface {
    void abstract_func(int x, int y)    ;
    default void default_fun()
    {
        System.out.println("This is default method");
    }
}

public class LambdaExp {
    public static void main(String[] args) {
        MyInterface fobj = (int x, int y)-> System.out.println(x+y);
        System.out.println("The result is: ");
        fobj.abstract_func(10, 20);
        //fobj.default_fun();
    }
}
