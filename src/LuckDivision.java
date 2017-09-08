import java.util.Scanner;

/**
 * Created by farruhhabibullaev on 2/12/17.
 */
public class LuckDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String doubleNumber = scanner.next();
        boolean isLucky = false;
        first:
        for (int i = 1; i <= Integer.parseInt(doubleNumber); i++) {
            if (isLuckes(String.valueOf(i))) {
                if (Integer.parseInt(doubleNumber) % i == 0) {
                    isLucky = true;
                    break first;
                }
            }
        }
        if (isLucky) System.out.println("YES");
        else System.out.println("NO");
    }

    static boolean isLuckes(String luckyNumber) {
        boolean isLuck = false;
        second:
        for (int i = 0; i < luckyNumber.length(); i++) {
            if (Character.toString(luckyNumber.charAt(i)).equalsIgnoreCase("4")
                    || Character.toString(luckyNumber.charAt(i)).equalsIgnoreCase("7")) {
                isLuck = true;
            } else {
                isLuck = false;
                return isLuck;
            }
        }
        return isLuck;
    }
}