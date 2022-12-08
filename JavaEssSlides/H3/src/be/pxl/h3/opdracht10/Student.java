package be.pxl.h3.opdracht10;


import java.util.Objects;

public class Student {
    private int nr;
    private String naam;

    public Student(int nr, String naam) {
        this.nr = nr;
        this.naam = naam;
    }

    public Student(String naam) {
        this.naam = naam;
    }

    public Student(int nr) {
        this.nr = nr;
    }

    public void drukAf() {
        System.out.println("Student  " + naam + " heeft nummer " + nr);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(naam, student.naam);
    }

    @Override
    public int hashCode() {
        return Objects.hash(naam);
    }
}
