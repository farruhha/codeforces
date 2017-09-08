import java.util.Scanner;

/**
 * Created by farruhhabibullaev on 6/12/17.
 */
public class SoldierAndBanana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int sum = a * ((c + 1) * c) / 2 - b;
        if (sum < 0) {
            System.out.println(0);
        } else {
            System.out.println(sum);
        }


    }
}
