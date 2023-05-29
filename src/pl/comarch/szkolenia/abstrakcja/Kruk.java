package pl.comarch.szkolenia.abstrakcja;

public class Kruk implements Pet, Ptak {
    @Override
    public void walk() {
        System.out.println("Ide na dwoch nogach");
    }

    @Override
    public void glos() {
        System.out.println("cwir cwir");
    }

    @Override
    public void eat() {
        System.out.println("jem ziarno");
    }

    @Override
    public void fly() {
        System.out.println("lece");
    }
}
