package pl.comarch.szkolenia.abstrakcja;

public abstract class Abstrakcyjna {
    int a = 5;
    int b;

    Abstrakcyjna(int b) {
        this.b = b;
    }

    public void cos() {
        System.out.println("cos");
    }

    public abstract void metodaAbstrakcyjna();

}
