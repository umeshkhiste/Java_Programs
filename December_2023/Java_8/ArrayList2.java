package Java_8;

import java.util.ArrayList;
import java.util.List;

public class ArrayList2 {
    public static void main(String[] args) {
        try {
        List<String> topCompanies = new ArrayList<>();
        System.out.println("Is the topCompanies list empty: " + topCompanies.isEmpty());

        topCompanies.add("Google");
        topCompanies.add("Apple");
        topCompanies.add("Microsoft");
        topCompanies.add("Amazon");
        topCompanies.add("Facebook");

        System.out.println(" Here are worlds top " + topCompanies.size() +" tech companies list:");

        // Retrieve the companies list
        String bestCompany = topCompanies.get(0);
        String secondCompany = topCompanies.get(1);
        String lastCompany = topCompanies.get(topCompanies.size() -1);

        //Printing company List
        System.out.println("Best Company: " +bestCompany);
        System.out.println("Second best Company: " +secondCompany);
        System.out.println("Last best Company: " +lastCompany);

        // Modify company list
        String newCompany = topCompanies.set(4, "Walmart");
        System.out.println("New list of company: "+topCompanies);
        System.out.println("Newly added company: "+newCompany);
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}
