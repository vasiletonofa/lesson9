package auto;

public class Sedan extends Automobil {

    @Override
    public void accelereaza() {
        System.out.println(model + " Accelereaza");
    }

    @Override
    public void franeaza() {
        System.out.println(model + " Franeaza");
    }

    @Override
    public int calculeazaForma() {
        return 0;
    }
}
