import java.util.Scanner;

/**
 * Created by farruhhabibullaev on 2/8/17.
 */
public class StringTask {
    public static void main(String[] args) {
        String[] wovels = {"A", "O", "Y", "E", "U", "I"};
        Scanner scanner = new Scanner(System.in);
        String strings = scanner.next();
        String newString = "";
        boolean trueMaker = false;

        for (int i = 0; i < strings.toCharArray().length; i++) {
            second:
            for (String wovel : wovels) {
                if (String.valueOf(strings.charAt(i)).equalsIgnoreCase(wovel)) {
                    trueMaker = true;
                    break second;
                } else {
                    trueMaker = false;
                }
            }
            if (!trueMaker) {
                newString += "." + String.valueOf(strings.charAt(i)).toLowerCase();
            }
        }
        System.out.println(newString);
    }
}
