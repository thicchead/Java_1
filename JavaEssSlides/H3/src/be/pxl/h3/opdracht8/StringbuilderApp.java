package be.pxl.h3.opdracht8;

public class StringbuilderApp {
    public static void main(String[] args) {
        String artikelcode = "ab12";
        StringBuilder string = new StringBuilder();

        string.append(Character.toUpperCase(artikelcode.charAt(0)));
        string.append(Character.toLowerCase(artikelcode.charAt(1)));
        string.append(artikelcode.substring(2));

        /*artikelcode = string.toString();
        System.out.println(artikelcode);*/
        System.out.println(string);

    }
}
