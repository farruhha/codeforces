import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by farruhhabibullaev on 6/20/17.
 */
public class BusinessTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] groups;
        int sum = 0;
        int monthCounter = 0;
        boolean canGrow = false;

        int numberOfGroups = Integer.parseInt(scanner.next().trim());
        groups = new int[12];

        for (int i = 0; i < 12; i++) {
            groups[i] = scanner.nextInt();
        }
        Arrays.sort(groups);

        for (int i = groups.length - 1; i >= 0; i--) {
            sum += groups[i];
            monthCounter++;
            if (sum >= numberOfGroups) {
                canGrow = true;
                break;
            }
        }

        if (canGrow) {
            if (numberOfGroups == 0) {
                System.out.println(0);
            } else {
                System.out.println(monthCounter);
            }
        } else {
            System.out.println(-1);
        }
    }
}
