import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by farruhhabibullaev on 8/25/17.
 */
public class DuffAndMeat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int amount[] = new int[a];
        int price[] = new int[a];
        int minPrice = 0;
        int minMoney = 0;

        for (int i = 0; i < a; i++) {
            amount[i] = scanner.nextInt();
            price[i] = scanner.nextInt();
        }
        minPrice = price[0];
        minMoney = amount[0] * price[0];
        for (int i = 1; i < amount.length; i++) {
            if (minPrice >= price[i]) {
                minPrice = price[i];
                minMoney += (amount[i] * minPrice);
            } else {
                minMoney += (amount[i] * minPrice);
            }
        }

        System.out.println(minMoney);


    }
}
