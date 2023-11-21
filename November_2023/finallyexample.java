public class finallyexample {
    public static void main(String[] args) {
        try{
            System.out.println("Inside try block");
            int data = 25/0;
            System.out.println(data);
        }
        // handles the arithmatic exception
        catch(ArithmeticException e){
            System.out.println("Exception handled");
            System.out.println(e);
        }
        //executes regardless of exception occurred or not
        finally{
            System.out.println("finally block is always executed.");
        }
        System.out.println("rest of the code");
    }
}
