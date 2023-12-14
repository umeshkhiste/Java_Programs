package Java_8;

import java.util.HashSet;

public class HashSet2 {
    public static void main(String[] args) {
     HashSet hs = new HashSet();
     boolean b1 = hs.add("RED");
     boolean b2 = hs.add("GREEN");
     boolean b3 = hs.add("BLUE");
     boolean b4 = hs.add("PINK");

     //Removing element
     boolean b5 = hs.remove("RED");

     //Adding element
     boolean b6 = hs.add("GREEN");

     System.out.println("b1 = " +b1);
     System.out.println("b2 = " +b2);
     System.out.println("b3 = " +b3);
     System.out.println("b4 = " +b4);
     System.out.println("b5 = " +b5);
     System.out.println("b6 = " +b6);

     System.out.println(hs);
    }
}
