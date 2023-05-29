package pl.comarch.szkolenia.abstrakcja;

public class Dog implements Pet {
    @Override
    public void walk() {
        System.out.println("ide na czterech lapach");
    }

    @Override
    public void glos() {
        System.out.println("Hau hau");
    }

    @Override
    public void eat() {
        System.out.println("Jem");
    }
}
