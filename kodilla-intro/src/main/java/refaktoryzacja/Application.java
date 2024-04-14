package refaktoryzacja;

public class Application {
    public static void main(String[] args) {
        Person adam = new Person("Adam", 40.5, 178);
        DisplayCharacteristics printer = new DisplayCharacteristics();
        printer.displayCharacteristic(adam);
    }
}
