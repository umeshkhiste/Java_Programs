package OOPS;

class Calculation
{
    int z;

    public void addition(int x, int y)
    {
        z = x + y;
        System.out.println("The sum of given number is: "+z);
    }

    public void substraction(int x, int y)
    {
        z = x-y;
        System.out.println("The substraction of given number is: "+z);
    }
}

public class SingleInheritance extends Calculation{
    public void multiplication(int x, int y)
    {
        z = x * y;
        System.out.println("The multiplication of given number is: "+z);
    }

    public static void main(String[] args) {
        SingleInheritance s = new SingleInheritance();
        s.addition(25, 10);
        s.substraction(25, 10);
        s.multiplication(25, 10);
    }
}
