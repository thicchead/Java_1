package be.pxl.h3.oef4;

import java.time.LocalDate;

public class Activiteit {
    private String naam;
    private LocalDate datum;

    public Activiteit() {

    }

    public Activiteit(String naam, LocalDate datum) {
        this.naam = naam;
        this.datum = datum;
    }

    public String getNaam() {
        return naam;
    }

    public LocalDate getDatum() {
        return datum;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(String.format("%-15s %s", this.datum.toString(), this.naam));

        return builder.toString();
    }
}
