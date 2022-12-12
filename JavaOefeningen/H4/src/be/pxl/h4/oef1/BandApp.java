package be.pxl.h4.oef1;

    public class BandApp {
        public static void main(String[] args) {
            Instrument instrument1 = new Instrument("Gitaar", "pling pling");
            instrument1.speel();
            System.out.println("Instrument 1 is een " + instrument1.toString());
            System.out.println(("**********"));

            Muzikant muzikant1 = new Muzikant("Sam", instrument1);
            muzikant1.speel();
            System.out.println(muzikant1.toString());
            System.out.println("*********");
            Muzikant b1 = new Muzikant("Sam", new Instrument("Gitaar", "Wawawaaw"));
            Muzikant b2 = new Muzikant("Heidi", new Instrument("Drum", "Boenk baf boenk baf"));
            Muzikant b3 = new Muzikant("Ingrid", new Instrument("Bas", "Bow bow bow"));
            Muzikant b4 = new Muzikant("Nele", new Instrument("Klarinet", "Pftooooee"));
            Muzikant b5 = new Muzikant("Francis", new Instrument("Triangel", "Tinnnngg..."));
            Muzikant[] leden = {b1, b2, b3, b4, b5};
            Band band = new Band("PXL-Digital", leden);
            System.out.println(band.toString());
            band.speel(20);
        }
    }