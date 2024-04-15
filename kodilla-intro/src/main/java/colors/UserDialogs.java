package colors;

import java.util.Scanner;

public class UserDialogs {
        public static String getColorCode() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the first letter of the color:");
            return scanner.nextLine().trim().toUpperCase();
        }
        public void displaySelectedColor(Colors.Color color) {
            System.out.println("Selected color: " + color);
        }
    }


