import java.util.Scanner;

/**
 * Created by farruhhabibullaev on 8/25/17.
 */
public class Reward {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt() + scanner.nextInt() + scanner.nextInt();
        int b = scanner.nextInt() + scanner.nextInt() + scanner.nextInt();
        int n = scanner.nextInt();

        int totalNumberOfShelvesNeeded = (int) (Math.ceil(a / 5.0) + Math.ceil(b / 10.0));
        if (totalNumberOfShelvesNeeded <= n) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}
