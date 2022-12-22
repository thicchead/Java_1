package be.pxl.h6.opdracht;

public enum Dag {
    MAANDAG, DINSDAG, WOENSDAG, DONDERDAG, VRIJDAG, ZATERDAG, ZONDAG;

    public void weekendDag(Dag dag) {
        if (dag == Dag.ZONDAG || dag == Dag.ZATERDAG) {
            System.out.println("weekend");
        } else {
            System.out.println("midweek");
        }
    }


}
