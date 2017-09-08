import java.util.Scanner;

/**
 * Created by farruhhabibullaev on 6/13/17.
 */
public class Translation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        String secondWord = scanner.next();
        String reversedWord = new StringBuffer(secondWord).reverse().toString();
        if (word.equalsIgnoreCase(reversedWord)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
