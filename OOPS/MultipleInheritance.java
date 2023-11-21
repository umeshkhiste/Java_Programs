package OOPS;

interface Event
{
    public void start();
}

interface Sports
{
    public void play();
}

interface Hockey extends Event, Sports
{
    public void show();
}

public class MultipleInheritance {
    public static void main(String[] args) {
        Hockey h = new Hockey() 
        {
            public void start()    
            {
                System.out.println("Event started...");
            }

            public void play()
            {
                System.out.println("Play sports...");
            }

            public void show()
            {
                System.out.println("Show hockey...");
            }
        };

        h.start();
        h.play();
        h.show();
    }
}
