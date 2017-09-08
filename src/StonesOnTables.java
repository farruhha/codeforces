import java.util.Scanner;

/**
 * Created by farruhhabibullaev on 2/10/17.
 */
public class StonesOnTables {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int stoneAmount = scanner.nextInt();
        String string = scanner.next();
        int counter = 0;


        for (int i = 0; i < string.length() - 1; i++) {
            if (string.charAt(i) == string.charAt(i + 1)) {
                counter++;
            }
        }

        System.out.println(counter);


    }
}
