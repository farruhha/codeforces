import java.util.Scanner;

/**
 * Created by farruhhabibullaev on 6/13/17.
 */
public class Dubstep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        StringBuffer stringBuffer = new StringBuffer(word);
        for (int i = 0; i < stringBuffer.length() - 2;i++ ) {
            if (stringBuffer.substring(i, i + 3).equalsIgnoreCase("WUB")) {
                stringBuffer.replace(i, i + 3, " ");
            }
        }
        System.out.println(stringBuffer.toString().trim());

    }
}
