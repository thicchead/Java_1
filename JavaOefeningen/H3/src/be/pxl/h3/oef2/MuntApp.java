package be.pxl.h3.oef2;

import java.util.ArrayList;

public class MuntApp {
    public static void main(String[] args) {
        Munt pond = new Munt("Britse Pond", 0.985);
        Munt dollar = new Munt("Dollar", 1.287);
        Munt roebel = new Munt("Russische Roebel", 86.950);
        Munt euro = new Munt();

        ArrayList<Munt> munten = new ArrayList<>();
        munten.add(pond);
        munten.add(dollar);
        munten.add(roebel);
        munten.add(euro);

        for (Munt munt : munten) {
            System.out.println((double)Math.round(munt.getKoers() * Math.pow(10, Munt.getAfronding())) / Math.pow(10, Munt.getAfronding()) + " " + munt.getNaam());
        }
        double koersEersteMunt = euro.getKoers() / munten.get(0).getKoers();

        System.out.println("Overzicht koersen tov " + munten.get(0).getNaam() + ": " + munten.get(0).getKoers() * koersEersteMunt + " " + munten.get(0).getNaam());

        for (Munt munt : munten) {
            System.out.println((double)Math.round(munt.getKoers() * Math.pow(10, Munt.getAfronding())) / Math.pow(10, Munt.getAfronding()) * koersEersteMunt + " " + munt.getNaam());
        }

    }
}
