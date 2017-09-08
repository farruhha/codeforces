import java.util.*;

/**
 * Created by farruhhabibullaev on 2/9/17.
 */
public class Taxi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] groups;

        int numberOfGroups = Integer.parseInt(scanner.next().trim());
        groups = new int[numberOfGroups];

        for (int i = 0; i < numberOfGroups; i++) {
            groups[i] = scanner.nextInt();
        }
        Arrays.sort(groups);





    }

}
