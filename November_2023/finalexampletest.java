public class finalexampletest {
    //declaring final variable
    final int age = 18;
    void display(){
    //reassigning value of age variable
    //gives compile time error.
    age = 36;
    }
    public static void main(String[] args) {
        finalexampletest f = new finalexampletest();
        //gives compile time error
        f.display();
    }
}
