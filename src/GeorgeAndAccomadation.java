import java.util.Scanner;

/**
 * Created by farruhhabibullaev on 6/12/17.
 */
public class GeorgeAndAccomadation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int counter = 0;
        for (int i = 0; i < a; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            if (y - x >= 2) {
                counter++;
            }
        }

        System.out.println(counter);
    }
}
