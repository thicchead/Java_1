package testen;

public class methodOverloadingTestApp {
    public static void main(String[] args) {
        methodOverloadingTest test = new methodOverloadingTest();

        test.setGewicht(70);
        test.setLengte(1.50);

        System.out.println(test.verdubbelen(test.getLengte()));
    }
}
