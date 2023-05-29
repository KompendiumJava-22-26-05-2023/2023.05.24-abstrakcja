package pl.comarch.szkolenia.abstrakcja;

public class Snake implements Pet {
    @Override
    public void walk() {
        System.out.println("Pelzam");
    }

    @Override
    public void glos() {
        System.out.println("ssssssssss");
    }

    @Override
    public void eat() {
        System.out.println("jem w calosci, nie gryze !!");
    }
}
