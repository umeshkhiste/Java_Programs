package OOPS;

class Employees{
    float salary = 40000;
}

class Inheritance extends Employees{
    float bonus = 10000;
    public static void main(String[] args) {
        Inheritance i = new Inheritance();
        System.out.println("Salary is: "+i.salary);
        System.out.println("Bonus is: "+i.bonus);
    }   
}
