import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by farruhhabibullaev on 2/12/17.
 */
public class Twins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] groups;
        int numberOfGroups = Integer.parseInt(scanner.next().trim());
        int sumOfAllCoins = 0;
        int anotherSum = 0;
        int counter = 0;
        groups = new int[numberOfGroups];
        for (int i = 0; i < numberOfGroups; i++) {
            groups[i] = scanner.nextInt();
        }
        Arrays.sort(groups);
        for (int i = 0; i < groups.length; i++) {
            sumOfAllCoins += groups[i];
        }
        first:
        for (int i = groups.length - 1; i >= 0; i--) {
            anotherSum += groups[i];
            if (anotherSum > sumOfAllCoins / 2) {
                counter++;
                break first;
            } else {
                counter++;
            }
        }
        System.out.println(counter);

    }
}
