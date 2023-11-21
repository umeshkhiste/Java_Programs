package October_2023;

class Calculation{
    int z;

    public void addition(int x, int y){
        z = x + y;
        System.out.println("The sum of given number is: "+z);
    }
    public void Substraction(int x, int y){
        z = x-y;
        System.out.println("The difference between given numbers is: "+z);
    }
}

public class Inheritance1  extends Calculation{
    public void Multiplication(int x, int y){
        z = x * y;
        System.out.println("The product of the given number is: "+z);
    }

    public static void main(String args[]){
        int a = 20, b=10;
        Inheritance1 demo = new Inheritance1();
        demo.addition(a, b);
        demo.Substraction(a, b);
        demo.Multiplication(a, b);
    }
}
