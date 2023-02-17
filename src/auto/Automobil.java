package auto;

public abstract class Automobil extends Obiect {

    String model;

    abstract void accelereaza();

    public abstract void franeaza();

    public String getModel() {
        return model;
    }

}
