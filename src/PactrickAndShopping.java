import java.util.Scanner;

/**
 * Created by farruhhabibullaev on 6/20/17.
 */
public class PactrickAndShopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int d = scanner.nextInt();
        int d2 = scanner.nextInt();
        int d3 = scanner.nextInt();

        if (d + d2 < d3) {
            System.out.println(2 * (d + d2));
        } else if (d2 + d3 < d) {
            System.out.println(2 * (d3 + d2));
        } else if (d3 + d < d2) {
            System.out.println(2 * (d3 + d));
        } else {
            System.out.println(d + d2 + d3);
        }

    }
}
