package be.pxl.h6.opdracht;

public enum Dag {
    MAANDAG, DINSDAG, WOENSDAG, DONDERDAG, VRIJDAG, ZATERDAG, ZONDAG;
    private boolean weekend;

    public void isWeekend(Dag dag) {
        weekend = dag == Dag.ZONDAG || dag == Dag.ZATERDAG;
    }

    public boolean isWeekend() {
        return weekend;
    }
}
