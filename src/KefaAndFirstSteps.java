import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by farruhhabibullaev on 6/27/17.
 */
public class KefaAndFirstSteps {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalLength = scanner.nextInt();
        int max = 1;
        int counter = 1;
        int sequence[] = new int[totalLength];
        for (int i = 0; i < totalLength; i++) {
            sequence[i] = scanner.nextInt();
        }

        for (int i = 0; i < sequence.length - 1; i++) {
            if (sequence[i] <= sequence[i + 1]) {
                counter++;
                if (counter >= max) {
                    max = counter;
                }
            } else counter = 1;
        }


        System.out.println(max);


    }
}
