package PALab_303_9_1_Hackerank_Overloading;

public class Solution2 {
    public void main(String[] argh){
        Adder X=new Adder();
        System.out.println(STR."My superclass is: \{X.getClass().getSuperclass().getName()}");
        System.out.print(STR."""
\{X.add(10, 32)} \{X.add(10, 3)} \{X.add(10, 10)}
""");

    }
    class Arithmetic{
        public String getName()
        {
            return "Arithmetic";

        }
    }
    class Adder extends Arithmetic
    {
        public int add(int a, int b)
        {
            return a+b;

        }
    }
}
