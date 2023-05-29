package pl.comarch.szkolenia.abstrakcja;

public class AbstrakcyjnaDziecko extends Abstrakcyjna {

    AbstrakcyjnaDziecko() {
        super(6);
    }

    @Override
    public void metodaAbstrakcyjna() {
        System.out.println("Implementacja metody abstrakcyjnej");
    }
}
