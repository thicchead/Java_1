package be.pxl.h5.voorbeeldPersoon;

public class Student extends Persoon{
    private int leerkrediet;
    private String studentnummer;
    private String opleiding;

    public Student() {
        this("onbekend", "onbekend", "15999999", "XXX", 140);
    }

    public Student(String naam, String voornaam) {
        this(naam, voornaam, "15999999", "XXX", 140);
    }

    public Student(String naam, String voornaam, String studentnummer, String opleiding, int leerkrediet) {
        super(naam, voornaam);
        setStudentnummer(studentnummer);
        setOpleiding(opleiding);
        setLeerkrediet(leerkrediet);
    }

    public Student(Student origStudent) {
        this(origStudent.getNaam(), origStudent.getVoornaam(), origStudent.getStudentnummer(), origStudent.getOpleiding(), origStudent.getLeerkrediet());
    }

    public void voegKredietToe(int punten) {
        setLeerkrediet(this.leerkrediet += punten);
    }

    @Override
    public void print() {
        super.print();
        System.out.printf("Leerkrediet: %s%n", leerkrediet);
        System.out.printf("Studentennummer: %s%n", studentnummer);
        System.out.printf("Opleiding: %s%n", opleiding);
    }

    public int getLeerkrediet() {
        return leerkrediet;
    }

    public void setLeerkrediet(int leerkrediet) {
        if (leerkrediet < 0) {
            this.leerkrediet = 0;
        } else this.leerkrediet = Math.min(leerkrediet, 140);
    }

    public String getStudentnummer() {
        return studentnummer;
    }

    public void setStudentnummer(String studentnummer) {
        this.studentnummer = studentnummer;
    }

    public String getOpleiding() {
        return opleiding;
    }

    public void setOpleiding(String opleiding) {
        this.opleiding = opleiding;
    }
}
