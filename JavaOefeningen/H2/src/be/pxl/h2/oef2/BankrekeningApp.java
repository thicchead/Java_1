package be.pxl.h2.oef2;

public class BankrekeningApp {
    public static void main(String[] args) {
        Bankrekening rek = new Bankrekening("000-01574125-77", "Jef Klak", 100, 1.2);

        rek.neemOp(50);
        rek.stort(20);
        rek.schrijfRenteBij();
        System.out.println("***********************************");

        Bankrekening rek2 = new Bankrekening();
        rek2.neemOp(1000);  // kan niet uitgevoerd worden
        rek2.setRekeningnummer("000-0178294-63");
        rek2.setNaam("Karel Dekeyzer");
        rek2.doeVerrichting(new double[]{100, -50, 60});
        System.out.println("***********************************");

        rek.stort(rek2.getSaldo());
        System.out.println("saldo rek 1 is " + rek.getSaldo());
    }
}
