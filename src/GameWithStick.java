import java.util.Scanner;

/**
 * Created by farruhhabibullaev on 6/27/17.
 */
public class GameWithStick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int number = m * n;
        if (number <= 2) {
            System.out.println("Akshat");
        } else {
            if (number % 2 != 0) {
                System.out.println("Akshat");
            } else {
                System.out.println("Malvika");
            }
        }
    }
}
