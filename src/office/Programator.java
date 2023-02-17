package office;

public class Programator extends Angajat {

    String limbajProgramare;

    Programator() {
        this("DEFAULT", 2);
    }

    Programator(String limbaj) {
        super("Ion", 1);
        System.out.println(nume);

        System.out.println(super.limbajProgramare);

        limbajProgramare = limbaj;
    }

    Programator(String limbaj, int x) {
      super("Andrei");
    }

    public void fixBugs(String limbajProgramare) {
        System.out.println(this.limbajProgramare + "Fix bugs");
    }

    @Override
    public void lucreaza() {
        System.out.println("Lucreaza Programator");
    }

}
