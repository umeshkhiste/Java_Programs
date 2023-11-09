public class finalizeexample {
    public static void main(String[] args) {
        finalizeexample f = new finalizeexample();
        //printing the hashcode
        System.out.println("Hashcode is: "+f.hashCode());       
        f = null;
        //calling the garbage collector using gc()
        System.gc();
        System.out.println("End of garbage collection");
    }   
    //defining the finalize method
    protected void finalize() {
        System.out.println("Calling the finalize() method");
    }
}
