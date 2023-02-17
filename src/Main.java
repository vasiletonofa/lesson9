import auto.Hatchback;
import auto.Limousine;

public class Main {
    public static void main(String[] args) {
        Limousine limousine = new Limousine();
        limousine.method(1, "Marca");  // overloading
        limousine.method( 1);

        Hatchback hatchback = new Hatchback();
    }
}