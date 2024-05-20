package Slides_303_14_1;

public class FunctionalKBA {
    public static void main(String[] args) {
        MyFunctionalInterfaceKBA fi = n -> {
            return n * n;
        };

        MyFunctionalInterfaceKBA fi2 = new MyFunctionalInterfaceKBA() {
            @Override
            public Integer sqr(int a){
                return a * a;
            }
        };
        System.out.println(fi.sqr(5));


    }
}
