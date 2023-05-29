package pl.comarch.szkolenia.abstrakcja;

public interface Ptak {
    void fly();
    void eat();

    default void cos() {
        k1();
        k2();
    }

    private void k1() {
        //??
    }

    private void k2() {
        //???
    }
}
