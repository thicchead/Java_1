package be.pxl.h1.oef1;

public class MijnToren {
    public static void main(String[] args) {
        Toren mijnToren = new Toren();

        mijnToren.setNaam("Boerentoren");
        mijnToren.setLocatie("Antwerpen");
        mijnToren.setJaarVoltooid(1932);
        mijnToren.setHoogte(97);
        mijnToren.setVerdiepingen(26);

        System.out.println("De " + mijnToren.getNaam() + " gelegen in " + mijnToren.getLocatie() + " is voltooid met bouwen in " + mijnToren.getJaarVoltooid());
        System.out.println("Het gebouw is " + mijnToren.getHoogte() + " meter hoog en heeft " + mijnToren.getVerdiepingen() + " verdiepingen");
    }
}
