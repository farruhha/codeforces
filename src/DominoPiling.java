import java.util.Scanner;

/**
 * Created by farruhhabibullaev on 2/8/17.
 */
public class DominoPiling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] numbers = scanner.nextLine().split(" ");
        int a = Integer.parseInt(numbers[0]);
        int b = Integer.parseInt(numbers[1]);
        if (a <= 16 && b <= 16 && a >= 1 && b >= 1) {
            int highestOne = a >= b ? a : b;
            int smallestOne = a <= b ? a : b;
            int sum = 0;
            if (highestOne % 2 != 0) {
                sum = (int) highestOne / 2 * smallestOne + (int)(smallestOne / 2);
            } else {
                sum = highestOne / 2 * smallestOne;
            }
            System.out.println(sum);
        }

    }
}
