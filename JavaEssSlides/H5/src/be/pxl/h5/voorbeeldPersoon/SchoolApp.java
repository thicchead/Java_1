package be.pxl.h5.voorbeeldPersoon;

public class SchoolApp {
    public static void main(String[] args) {
        Persoon persoon = new Persoon();
        Student student = new Student();

        student.setNaam("Karakoruk");
        student.setVoornaam("Metehan");
        // System.out.println("Student: " + student.getNaam() + " " + student.getVoornaam());

        student.setLeerkrediet(50);
        // System.out.println(student.getLeerkrediet());
        student.voegKredietToe(-10);
        // System.out.println(student.getLeerkrediet());
        student.setStudentnummer("12100606");
        student.setOpleiding("Toegepaste IT");

        // student.print();
        // persoon.print();

        Persoon poly = new Student();

        poly.setVoornaam("Metje");
        // poly.print(); // --> print van student

        Lector lector = new Lector();
        lector.setAanstellingsPercentage(50);
        lector.setSalaris(1000);

        //System.out.println(lector.getAanstellingsPercentage());
        //System.out.println(lector.getSalaris());

        lector.setAanstellingsPercentage(25);
        //System.out.println("Salaris: €" + lector.getSalaris());

        lector.setAanstellingsPercentage(75);
        //System.out.println("Salaris: €" + lector.getSalaris());

        lector.setAanstellingsPercentage(10);
        //System.out.println("Salaris: €" + lector.getSalaris());

        //lector.print();

        Student student1 = new Student("Karakoruk", "Metehan", "12100606", "TIN", 125);
        //student1.print();

        Student student2 = new Student(student1);
        //student2.print();

        Student student3 = new Student("Karakoruk", "Metehan");
        //student3.print();

        Lector lector1 = new Lector("Kara", "Metje", "12100606", 75, 3000);
        //lector1.print();

        System.out.println("***********");

        Lector lector2 = new Lector("K", "M", 30, 2500);
        //lector2.print();

        System.out.println("***********");

        Lector lector3 = new Lector();
        //lector3.print();

        System.out.println(Persoon.getAantal());
        System.out.println(Student.getAantal());
        System.out.println(Lector.getAantal());

        /*Student sena = new Student("Sengul", "Sena", "67", "Tandheelkunde", 140);

        System.out.println(sena.getVoornaam());

        System.out.println(sena.getVoornaam() + " is slecht in typen");
        sena.print();

        Student nisa = new Student("Sengul", "Nisa");
        nisa.print();

        Student erdem = new Student();
        erdem.print();

        Student kopieNisa = new Student(nisa);
        kopieNisa.print();*/
    }
}
