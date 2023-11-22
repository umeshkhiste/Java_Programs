package Java_8;

    interface Months
    {
        public String November();
    }

public class Lambda7 {

    public static void main(String[] args) {
        Months m=()-> {
        return " We are in November month...";
        };
        System.out.println(m.November());
    }
}
