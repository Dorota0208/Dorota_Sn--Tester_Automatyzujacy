package refaktoryzacja;
public class DisplayCharacteristics {
    public void displayCharacteristic(Person p) {
        if (p.getName() != null) {
            if (p.getAge() > 30 && p.getHeight() > 160) {
                System.out.println(p.getName() + " is older than 30 and taller than 160cm");
            } else {
                System.out.println(p.getName() + " is 30 (or younger) or 160cm (or shorter)");
            }
        }
    }
}


