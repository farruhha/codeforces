import java.util.Scanner;

/**
 * Created by farruhhabibullaev on 6/12/17.
 */
public class DistinctYear {
    String number = "";

    int a[] = new int[12];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        for (int i = year + 1; ; i++) {
            if (isDistinct(String.valueOf(i))) {
                System.out.println(i);
                break;
            }
        }

    }

    private static boolean isDistinct(String number) {
        for (int i = 0; i < number.length(); i++) {
            for (int j = 0; j < number.length(); j++) {
                if (j == i) break;
                if (String.valueOf(number.charAt(i)).equalsIgnoreCase(String.valueOf(number.charAt(j)))) {
                    return false;
                }
            }

        }
        return true;

    }
}
