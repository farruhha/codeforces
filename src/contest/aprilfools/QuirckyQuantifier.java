package contest.aprilfools;

import java.util.Scanner;

public class QuirckyQuantifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n % 2 == 0) {
            System.out.println("0");
        } else {
            System.out.println("1");
        }

    }
}
