package be.pxl.h6.opdracht;

public class DagApp {
    public static void main(String[] args) {
        for (Dag dag : Dag.values()) {
            System.out.println(dag);
            System.out.println(dag.ordinal());
            dag.weekendDag(dag);
        }
    }
}
