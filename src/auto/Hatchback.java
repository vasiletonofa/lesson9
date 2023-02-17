package auto;

class Hatchback extends Automobil {


    @Override
    public void accelereaza() {

    }

    @Override
    public void franeaza() {
        accelereaza();
        System.out.println("");
    }


    void hatchBackLogic() {

    }

    public int calculeazaForma() {
        return 1;
    }
}

// 1. Toate clasele abstracte pot implementa metodele abstracte a unei clase parinte care este abstracta, dar nu sunt obligate
// 2. Toate clasele non-abstracte sunt obligate sa implementeze metodele abstracte din ierarhie