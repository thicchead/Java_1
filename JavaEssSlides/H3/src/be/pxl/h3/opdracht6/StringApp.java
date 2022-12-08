package be.pxl.h3.opdracht6;

public class StringApp {
    public static void main(String[] args) {
        String tekst = "hallo";

        System.out.println(tekst);
        System.out.println(tekst.length());

        tekst = tekst.replace('a', 'o');
        System.out.println(tekst);

        int aantalEs = 0;
        System.out.println(aantalEs);
        for (int i = 0; i < tekst.length(); i++) {
            if (tekst.charAt(i) == 'e') {
                aantalEs++;
            }
        }

        String tekst1 = "hoi";
        System.out.println(tekst.equals(tekst1));

        int midden = tekst.length() / 2;
        String einde = tekst.substring(midden + 1, tekst.length());

        if (tekst.length() % 2 != 0) {
            System.out.println(tekst.substring(0, midden) + tekst.substring(midden, midden + 1).toUpperCase() + einde);
        } else {
            System.out.println(tekst.substring(0, midden - 1) + tekst.substring(midden - 1, midden + 1).toUpperCase() + einde);
        }

    }
}
