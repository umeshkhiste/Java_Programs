package October_2023;

interface Payment{
    public void pay();
}

class CashPayment implements Payment{

    @Override
    public void pay(){
        System.out.println("This is cash payment...!");
    }
}

class CreditPayment implements Payment{
    @Override
    public void pay(){
        System.out.println("This is credit card payment...!");
    }
}

public class Polymorphism1 {
    public static void main(String[] args) {
     CashPayment c = new CashPayment()   ;
     c.pay();

     Payment p = new CreditPayment();
     p.pay();
    }
}
