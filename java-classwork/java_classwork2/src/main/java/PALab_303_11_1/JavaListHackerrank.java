package PALab_303_11_1;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JavaListHackerrank {




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numElements = Integer.parseInt(sc.nextLine());
        ArrayList<Integer> numList = new ArrayList<>();
        for(int i = 0; i < numElements; i++){
            numList.add(sc.nextInt());
        }
        int numQueries = sc.nextInt();
        sc.nextLine();
        for (int i =0; i < numQueries;i++){
            String queryType = sc.nextLine();
            if(queryType.equals("Insert")){
                String[] queryArray =sc.nextLine().split(" ");
                numList.add(Integer.parseInt(queryArray[0]), Integer.parseInt(queryArray[1]));

            }else{
                int removeIndex = Integer.parseInt(sc.nextLine());
                numList.remove(removeIndex);
            }

        }
        for(Integer num : numList){
            System.out.print(STR."\{num} ");
            //Sample Input
            //
            //5
            //12 0 1 78 12
            //2
            //Insert
            //5 23
            //Delete
            //0
            //Sample Output
            //
            //0 1 78 12 23
        }
    }

}
