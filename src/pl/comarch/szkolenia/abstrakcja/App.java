package pl.comarch.szkolenia.abstrakcja;

public class App {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.glos();
        dog.walk();

        Snake snake = new Snake();
        snake.eat();
        snake.glos();
        snake.walk();

        Pet pet = new Snake();
        pet.eat();
        pet.glos();
        pet.walk();

        Kruk kruk = new Kruk();
        kruk.eat();
        kruk.glos();
        kruk.walk();
        kruk.fly();

        /*Ptak ptak = new Ptak();
        ptak.eat();
        ptak.fly();*/

        AbstrakcyjnaDziecko abstrakcyjnaDziecko = new AbstrakcyjnaDziecko();
        abstrakcyjnaDziecko.b = 5;
        System.out.println(abstrakcyjnaDziecko.a);
        abstrakcyjnaDziecko.cos();
        abstrakcyjnaDziecko.metodaAbstrakcyjna();

        Abstrakcyjna abstrakcyjna = new AbstrakcyjnaDziecko();
    }
}
