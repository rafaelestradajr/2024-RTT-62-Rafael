package PALab_303_10_2;

import java.util.*;
abstract class Book
{
    String title;
    abstract void setTitle(String s);
    String getTitle()
    {
        return title;
    }

}

//Write MyBook class here
class MyBook extends Book{
    void setTitle(String s)  {
        title = s;
    }

}

public class JavaAbstractClass{

    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        String title=sc.nextLine();
        MyBook new_novel=new MyBook();
        new_novel.setTitle(title);
        System.out.println("The title is: "+new_novel.getTitle());

    }
}