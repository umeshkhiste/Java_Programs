package Main;
class faculti{
    float salary = 500;
}

class science extends faculti{
    float bonus=300;
}

public class Main { 
    public static void main(String[] args) {
        science s = new science();
        System.out.println("Salary is:" +s.salary);
        System.out.println("Bonus is: "+s.bonus);
        
    }
}
