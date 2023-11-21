package OOPS;
interface Drawable
{
    void draw();
}

class Rectangle implements Drawable
{
public void draw()
    {
        System.out.println("Drawable Rectangle...");
    }
}

class Circle implements Drawable
{
    public void draw()
    {
        System.out.println("Drawable Circle...");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        Drawable r = new Rectangle();
        Drawable c = new Circle();

        r.draw();
        c.draw();
    }    
}
