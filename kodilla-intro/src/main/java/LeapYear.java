import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj rok: ");
        int rok = scanner.nextInt();

        if (rok % 4 == 0 && rok % 100 != 0  || rok % 400 == 0){
            System.out.print("Rok " + rok + " jest rokiem przestępnym");
        } else {
            System.out.print("Rok " + rok + " nie jest rokiem przestępnym");
        }
    }
}
