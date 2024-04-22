package loops;

public class Application {
    public static void main(String[] args) {
        User kasia = new User("Kasia", 38);
        User ewa = new User("Ewa", 36);
        User dawid = new User("Dawid", 54);
        User kacper = new User("Kacper", 12);
        User albert = new User("Albert", 1);
        User alfred = new User("Alfred", 3);

        User[] users = {kasia, ewa, dawid, kacper, albert, alfred};

        ageLessThanAverageAge(users);
    }
    public static int averageAge(User[] users) {
        if (users.length == 0) {
            System.out.println("There are no users to display");
            return 0;
        }
        int totalAge = 0;
        for (int i = 0; i < users.length; i++) {
            totalAge += users[i].getAge();
        }
        return totalAge / users.length;
    }
    public static void ageLessThanAverageAge(User[] users) {
        int avgAge = averageAge(users);
        if (avgAge == 0) {
            return;
        }
        for (int i = 0; i < users.length; i++) {
            if (users[i].getAge() < avgAge) {
                System.out.println(users[i].getName() + " has an age below the average age of all users");
            }
        }
    }
}