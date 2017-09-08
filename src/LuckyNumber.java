import java.util.Scanner;

/**
 * Created by farruhhabibullaev on 6/12/17.
 */
public class LuckyNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.next();
        boolean isLucky = true;
        String word = "";
        int counter = 0;
        for (int i = 0; i < number.length(); i++) {
            int num = Integer.parseInt(String.valueOf(number.charAt(i)));
            if (num == 7 || num == 4) {
                counter++;
            }
        }
        if (counter == 7 || counter == 4) {
            word = "YES";
        } else {
            word = "NO";
        }

        System.out.println(word);


    }
}
