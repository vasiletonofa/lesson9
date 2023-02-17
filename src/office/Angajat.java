package office;

public class Angajat {

    String limbajProgramare;

    String nume;


    Angajat(String nume) {
        this.nume = nume;
    }

    Angajat(String nume, int x) {
        this.nume = nume;
    }

    public void lucreaza() {
        System.out.println("Lucreaza");
    }

    public String getNume() {
        return nume;
    }

}
