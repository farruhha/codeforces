package contest.round36_edu;

import java.util.Scanner;

public class Browser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int pos = scanner.nextInt();
        int l = scanner.nextInt();
        int r = scanner.nextInt();


        int sum = 0;

        if (l == 1 && r == n) {
            System.out.println("0");
        } else if (pos > l && pos < r) {
            if (l != 1) {
                sum += 1;
                sum += pos - l;
            } else {
                sum += pos - l;
            }

            if (r != n) {
                sum += 1;
                sum += r - l;
            }
        } else if (pos <= l) {
            if (pos == l && pos != 1 ){
                sum += 1;
            }else{

            }
        }

    }
}
