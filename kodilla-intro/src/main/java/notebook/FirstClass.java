package notebook;

public class FirstClass {
    public static void main(String[] args) {
        Notebook notebook = new Notebook(600,5000, 2017);
        System.out.println("notebook.weight: " + notebook.weight + ", notebook.price: " + notebook.price
                + ", notebook.year: " + notebook.year);
        notebook.CheckPrice();
        notebook.CheckWeight();
        notebook.checkDeviceStatus();
        System.out.println ("\n");

        Notebook heavyNotebook = new Notebook(2000, 2000, 2022);
        System.out.println("heavyNotebook.weight: " + heavyNotebook.weight + ", heavyNotebook.weight: " + heavyNotebook.price
                + ", heavyNotebook.weight: " + heavyNotebook.year);
        heavyNotebook.CheckPrice();
        heavyNotebook.CheckWeight();
        heavyNotebook.checkDeviceStatus();
        System.out.println ("\n");

        Notebook oldNotebook = new Notebook(1200, 600,2013 );
        System.out.println("oldNotebook.weight: " + oldNotebook.weight + ", oldNotebook.price: " + oldNotebook.price
                + ", oldNotebook.year: " + oldNotebook.year);
        oldNotebook.CheckPrice();
        oldNotebook.CheckWeight();
        oldNotebook.checkDeviceStatus();

        }
    }


