package PALab_303_3_1;

import java.util.Scanner;
public class SolutionC{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        int n=50;
        n=A.length();
        String rev="";
        for (int i=n-1;i>-1;i--)
        {
            rev=rev+A.charAt(i);
        }
        if(A.equals(rev)) System.out.println("Yes");
        else  System.out.println("No");
        /* Enter your code here. Print output to STDOUT. */
    }
}
