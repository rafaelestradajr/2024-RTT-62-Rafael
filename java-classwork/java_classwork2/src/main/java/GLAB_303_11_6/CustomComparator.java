package GLAB_303_11_6;
import java.util.Comparator;

public class CustomComparator implements Comparator<String>{

    @Override
    public int compare(String number1,String number2){
        int value = number1.compareTo(number2);

        // elements are sorted in reverse order
        return Integer.compare(0, value);
    }
    }



