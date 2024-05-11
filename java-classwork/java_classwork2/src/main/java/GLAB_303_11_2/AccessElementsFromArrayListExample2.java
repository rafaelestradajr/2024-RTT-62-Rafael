package GLAB_303_11_2;

import java.util.ArrayList;
import java.util.List;
public class AccessElementsFromArrayListExample2 {
    public static void main(String[] args) {
        List<String> topCompanies = new ArrayList<>();
// Check if an ArrayList is empty
        System.out.println(STR."Is the topCompanies list empty? : \{topCompanies.isEmpty()}");
        topCompanies.add("Google");
        topCompanies.add("Apple");
        topCompanies.add("Microsoft");
        topCompanies.add("Amazon");
        topCompanies.add("Facebook");
// Find the size of an ArrayList
        System.out.println(STR."Here are the top \{topCompanies.size()} companies in the world");
                System.out.println(topCompanies);
// Retrieve the element at a given index
        String bestCompany = topCompanies.get(0);
        String secondBestCompany = topCompanies.get(1);
        String lastCompany = topCompanies.get(topCompanies.size() - 1);
        System.out.println(STR."Best Company: \{bestCompany}");
        System.out.println(STR."Second Best Company: \{secondBestCompany}");
        System.out.println(STR."Last Company in the list: \{lastCompany}");
// Modify the element at a given index
        topCompanies.set(4, "Walmart");
        System.out.println(STR."Modified top companies list: \{topCompanies}");
    }
}