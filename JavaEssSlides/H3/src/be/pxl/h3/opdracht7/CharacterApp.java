package be.pxl.h3.opdracht7;

public class CharacterApp {
    public static void main(String[] args) {
        String artikelcode = "ab12";
        char eersteChar = artikelcode.charAt(0);
        char tweedeChar = artikelcode.charAt(1);
        char derdeChar = artikelcode.charAt(2);
        char vierdeChar = artikelcode.charAt(3);

        if (artikelcode.length() > 4) {
            System.out.println("Artikelcode is te lang");
        } else {
            if (Character.isLetter(eersteChar) && Character.isLetter(tweedeChar) && Character.isDigit(derdeChar) && Character.isDigit(vierdeChar)) {
                System.out.println("Juiste artikelcode");
                System.out.println(Character.toUpperCase(eersteChar) + artikelcode.substring(1));
            } else {
                System.out.println("Foute artikelcode");
            }
        }
    }
}
