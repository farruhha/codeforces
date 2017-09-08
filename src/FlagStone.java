import java.util.Scanner;

/**
 * Created by farruhhabibullaev on 2/7/17.
 */
public class FlagStone {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int tempStorage = 0;
        int first = 0;
        int second = 0;

        if ((m <= 1000000000 && n <= 1000000000 && a <= 1000000000)
                && (m >= 1 && n >= 1 && a >= 1)) {

            if (m % a != 0) {
                first = 1;
            }
            if (n % a != 0) {
                second = 1;
            }
            //  System.out.println(first + " " + second);
            tempStorage = ((int) m / a + first) * ((int) n / a + second);
            System.out.println(tempStorage);
        }
    }
}
