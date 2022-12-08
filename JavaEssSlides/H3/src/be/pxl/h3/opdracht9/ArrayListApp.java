package be.pxl.h3.opdracht9;

import java.util.ArrayList;

public class ArrayListApp {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        String voorbeeld1 = "voorbeeld1";
        String voorbeeld2 = "voorbeeld2";
        String voorbeeld3 = "voorbeeld3";

        arrayList.add(voorbeeld1);
        arrayList.add(voorbeeld2);
        arrayList.add(voorbeeld3);

        String tussenString = "tussen 1 en 2";
        arrayList.add(1, tussenString);;
        System.out.println(arrayList);

        tussenString = "iets anders";
        arrayList.set(1, tussenString); // originele weg
        System.out.println(arrayList);

        arrayList.remove(1);

        for (String x : arrayList) {
            System.out.println(x);
        }

        System.out.println("Voorbeeld 2 staat op index " + arrayList.indexOf(voorbeeld2));

        arrayList.clear();
        System.out.println(arrayList);
    }
}
