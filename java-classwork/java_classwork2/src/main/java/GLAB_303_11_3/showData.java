package GLAB_303_11_3;

import java.util.ArrayList;
import java.util.Iterator;
public class showData {
    public static void main(String[] args) {
// instantiation to class AddDataToArrayList
        AddDataToArrayList b = new AddDataToArrayList();
        ArrayList<Book> mybooklist = b.bookdetails();
        for(Book showValue: mybooklist)
        {
// ---- invoking getter method for geting Data---------
            System.out.println(STR."\{showValue.getNumber()} \{showValue.getName()} \{showValue.getCategory()} \{showValue.getAuthor()}");
        }
    }
}
