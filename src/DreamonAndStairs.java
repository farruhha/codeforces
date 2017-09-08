import java.util.Scanner;

/**
 * Created by farruhhabibullaev on 8/25/17.
 */
public class DreamonAndStairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int numberOfMoves = (int) Math.ceil(n / 2.0);
        while (n >= numberOfMoves) {
            if (numberOfMoves % m == 0) {
                System.out.println(numberOfMoves);
                return;
            } else {
                numberOfMoves++;
            }
        }
        if (numberOfMoves>n) {
            System.out.println(-1);
        }
    }
}
