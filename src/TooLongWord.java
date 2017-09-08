import java.util.Scanner;

/**
 * Created by farruhhabibullaev on 2/8/17.
 */
public class TooLongWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        String[] words = new String[number];
        for (int i = 0; i < number; i++) {
            words[i] = scanner.next();
        }

        for (String wordpre : words) {
                if (wordpre.length() > 10) {
                    System.out.println(wordpre.substring(0,1) + (wordpre.length() - 2) + wordpre.substring(wordpre.length()-1));
                } else {
                    System.out.println(wordpre);
                }
            }
    }
}
