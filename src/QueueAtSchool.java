import java.util.Scanner;

/**
 * Created by farruhhabibullaev on 6/26/17.
 */
public class QueueAtSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int seconds = scanner.nextInt();
        String Strings = scanner.next();
        String[] arrays = new String[number];
        for (int i = 0; i < number; i++) {
            arrays[i] = String.valueOf(Strings.charAt(i));
        }

        for (int i = 0; i < seconds; i++) {
            for (int j = 0; j < number - 1; ) {
                if (arrays[j].equalsIgnoreCase("B")
                        && arrays[j + 1].equalsIgnoreCase("G")) {
                    arrays[j] = "G";
                    arrays[j + 1] = "B";
                    j += 2;
                } else {
                    j++;
                }
            }

        }
        String s = "";
        for (int i = 0; i < arrays.length; i++) {
            s += arrays[i];
        }
        System.out.println(s);
    }

}
