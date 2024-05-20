package Slides_303_14_1;


@FunctionalInterface
public interface MyFunctionalInterfaceKBA {
    public Integer sqr(int a);

    default String sqr(String a){
        return a + a;
    }

}
