package Java_8;

interface Drawable{
    public void draw();
}

public class Lambda1 {
    public static void main(String[] args) {
        int width = 10;
        /*
    with lambda expression
        Drawable d2 =()->{
            System.out.println("Drawing: "+width);
        };
        d2.draw();*/
    //withdout lambda expression
        Drawable d = new Drawable() {
            public void draw()
            {
                System.out.println("Drawing "+width);
            }
        };
        d.draw();
    }
}
