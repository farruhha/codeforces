import java.util.Scanner;

/**
 * Created by farruhhabibullaev on 6/20/17.
 */
public class CaseOfZerosAndOnes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbers = scanner.nextInt();
        String string = scanner.next().substring(0, numbers);
        StringBuffer buffer = new StringBuffer(string);
        for (int i = 0; i < buffer.length()-1; i++) {
            if (buffer.charAt(i) != buffer.charAt(i + 1)) {
                buffer.deleteCharAt(i);
                buffer.deleteCharAt(i + 1);
            }
            i = 0;
        }

        System.out.println(buffer.toString());


    }
}
