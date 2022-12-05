package be.pxl.h2.oef2;

public class Bankrekening {
    private String rekeningnummer;
    private String naam;
    private double saldo;
    private double rentepercentage;

    public Bankrekening() {
        this("geen", "onbekend", 0, 1.2);
    }

    public Bankrekening(String rekeningnummer, String naam, double saldo, double rentepercentage) {
        setRekeningnummer(rekeningnummer);
        setNaam(naam);
        if (saldo < 0) {
            this.saldo = 0;
        } else {
            this.saldo = saldo;
        }
        if (rentepercentage < 0) {
            this.rentepercentage = 0;
        } else {
            this.rentepercentage = rentepercentage;
        }
        System.out.printf("Bankrekening geopend met saldo %.2f euro%n", this.saldo);
        print();
    }

    public void stort(double bedrag) {
        if (!valideerRekening()) {
            this.saldo += bedrag;
            System.out.printf("> Na storting van %.2f euro %n", bedrag);
            print();
        } else {
            System.out.println("Fout, rekening niet herkend");
        }
    }

    public void neemOp(double bedrag) {
        if (!valideerRekening()) {
            if (this.saldo == 0) {
                System.out.println("U kan geen geld opnemen");
            } else if (bedrag > this.saldo) {
                System.out.println("U mag enkel " + this.saldo + " opnemen");
                this.saldo = 0;
            } else {
                this.saldo -= bedrag;
                System.out.printf("> Na opname van %.2f euro%n", bedrag);
                print();
            }
        } else {
            System.out.println("Fout, rekening niet herkend");
        }
    }

    public void doeVerrichting(double[] bedragen) {
        for (double bedrag : bedragen) {
            if (bedrag > 0) {
                stort(bedrag);
            } else {
                neemOp(- bedrag);
            }
        }
    }

    public void schrijfRenteBij() {
        if (!valideerRekening()) {
            double rente = this.saldo * (this.rentepercentage / 100);
            this.saldo += rente;
            System.out.printf("> Rente wordt bijgeschreven voor %.2f euro%n", rente);
            print();
        } else {
            System.out.println("Fout, rekening niet herkend");
        }
    }

    private boolean valideerRekening() {
        return this.naam.equals("onbekend") && this.rekeningnummer.equals("geen");
    }

    public void print() {
        System.out.printf("Saldo op spaarrekening " + this.rekeningnummer + " op naam van "
                + this.naam + " bedraagt %.2f euro%n", this.saldo);
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public void setRekeningnummer(String rekeningnummer) {
        this.rekeningnummer = rekeningnummer;
    }

    public double getSaldo() {
        return saldo;
    }
}
