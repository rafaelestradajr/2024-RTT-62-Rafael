package PALab_303_10_3;

public class LibraryInterfaceDemo {

    static KidUsers kidUsers = new KidUsers();
    static AdultUser adultUser = new AdultUser();

    public static void main(String[] args) {

        testCase1();
        testCase2();

    }

    public static void testCase1() {

        kidUsers.setAge(10);
        kidUsers.registerAccount();
        kidUsers.setAge(18);
        kidUsers.registerAccount();
        kidUsers.setBookType("kids");
        kidUsers.requestbook();
        kidUsers.setBookType("fiction");
        kidUsers.requestbook();
    }

    public static void testCase2() {

        adultUser.setAge(5);
        adultUser.registerAccount();
        adultUser.setAge(23);
        adultUser.setBookType("kids");
        adultUser.requestbook();
        kidUsers.setBookType("fiction");
        adultUser.requestbook();

    }

}
