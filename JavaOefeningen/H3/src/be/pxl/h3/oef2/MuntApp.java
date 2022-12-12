package be.pxl.h3.oef2;

import java.util.ArrayList;

public class MuntApp {
    public static void main(String[] args) {
        /* Munt pond = new Munt("Britse Pond", 0.985);
        Munt dollar = new Munt("Dollar", 1.287);
        Munt roebel = new Munt("Russische Roebel", 86.950);
        Munt euro = new Munt();

        ArrayList<Munt> munten = new ArrayList<>();
        munten.add(pond);
        munten.add(dollar);
        munten.add(roebel);
        munten.add(euro);

        for (Munt munt : munten) {
            System.out.println(Math.round(munt.getKoers() * Math.pow(10, Munt.getAfronding())) / Math.pow(10, Munt.getAfronding()) + " " + munt.getNaam());
        }

        double koersEersteMunt = euro.getKoers() / munten.get(0).getKoers();
        System.out.println("Overzicht koersen tov " + munten.get(0).getNaam() + ": " + Math.round(munten.get(0).getKoers() * Math.pow(10, Munt.getAfronding()) * koersEersteMunt) / Math.pow(10, Munt.getAfronding()) + " " + munten.get(0).getNaam());
        munten.remove(0);

        for (Munt munt : munten) {
            System.out.println(Math.round(munt.getKoers() * Math.pow(10, Munt.getAfronding()) * koersEersteMunt) / Math.pow(10, Munt.getAfronding()) + " " + munt.getNaam());
        } */
        Munt amDollar = new Munt("Amerikaanse dollar", 1.1268);
        Munt brPond = new Munt("Britse pond", 0.8757);
        Munt euro = new Munt();
        Munt rusRoebel = new Munt("Russische roebel", 76.1420);
        Munt testMunt = new Munt("testmunt", 0.5);
        Munt testMunt2 = new Munt("testmunt2", 2);

        ArrayList<Munt> muntArList = new ArrayList<>();
        muntArList.add(brPond);
        muntArList.add(amDollar);
        muntArList.add(euro);
        muntArList.add(rusRoebel);
        muntArList.add(testMunt);
        muntArList.add(testMunt2);

        String formaat = "%10." + Munt.getAfronding() + "f %s%n"; // BELANGRIJK
        for(Munt muntje : muntArList){
            System.out.printf(formaat, muntje.getKoers(), muntje.getNaam());
        }

        System.out.println();

        System.out.println("overzicht koersen tov " + muntArList.get(0).getNaam() + ": 1 " + muntArList.get(0).getNaam() + " =");

        for (int i = 1; i < Munt.getAantal(); i++) {
            //eerst omrekening naar euro, dan naar vreemde munt
            double res = muntArList.get(i).getKoers() / muntArList.get(0).getKoers();
            System.out.printf(formaat, res, muntArList.get(i).getNaam());
        }
    }
}
