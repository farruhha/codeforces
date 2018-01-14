package contest.round36_edu;

import java.util.Arrays;
import java.util.Scanner;

public class Garden {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int maxNumber = -1;
        for (int i = 0; i < n; i++) {
            int ith = scanner.nextInt();
            if (k % ith == 0 && maxNumber < ith) {
                maxNumber = ith;
            }
        }

        System.out.println(k/maxNumber);

    }
}
