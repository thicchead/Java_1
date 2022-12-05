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


        double midden = tekst.length() / 2.0;
        String middelsteLetters;

        if (midden / 1.0 != 1) {
            middelsteLetters = tekst.substring((int)midden - 1, (int)midden + 1);
        } else {
            middelsteLetters = tekst.substring((int) midden);
        }
        System.out.println(midden);
        System.out.println(middelsteLetters);
    }
}
