package notebook;

public class Notebook {
    int weight;
    int price;
    int year;

    public Notebook(int weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;
    }
    public void CheckPrice() {
        if (this.price < 600) {
            System.out.println("This notebook is very cheap");
        } else if (this.price >= 600 && this.price <= 1000)
            System.out.println("The price is good.");
        else {
            System.out.println("This notebook is expensive.");
        }
    }
    public void CheckWeight() {
        if (this.weight < 1000) {
            System.out.println("This notebook is light");
        } else if (this.weight >= 1000 && this.weight <= 1500)
            System.out.println("This notebook is not too heavy");
        else {
            System.out.println("This notebook is very heavy");
        }
    }
    public void checkDeviceStatus() {
        if (this.year >= 2018) {
            if (this.price > 1000) {
                System.out.println("This device is the latest and costs over 1000. It's a modern and expensive piece of equipment.");
            } else {
                System.out.println("This device is the latest, but its price is affordable. It's a good investment.");
            }
        } else {
            if (this.price > 1000) {
                System.out.println("This device may be older, but its price is still high. Check if it's worth it.");
            } else {
                System.out.println("This device is older and has an affordable price. It might be a good choice for budget-conscious buyers.");
            }
        }
    }
}

