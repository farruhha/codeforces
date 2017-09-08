import java.util.Scanner;

/**
 * Created by farruhhabibullaev on 2/10/17.
 */
public class WordCapitalization {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String givenWord = scanner.next();
        System.out.println(givenWord.substring(0,1).toUpperCase() + givenWord.substring(1));
    }
}
