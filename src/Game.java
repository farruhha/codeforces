import java.util.Scanner;
import java.util.function.BinaryOperator;

/**
 * Created by farruhhabibullaev on 6/26/17.
 */
public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int k1 = scanner.nextInt();
        int k2 = scanner.nextInt();
        int counter = 0;
        int firstThrow = n1 - k1;
        int secondThrow = n2 - 1;

        while (true) {
            counter++;
            if (counter % 2 != 0) {
                if (firstThrow != 0) {
                    if (secondThrow == 0) {
                        System.out.println("First");
                        return;
                    } else {
                        firstThrow--;
                    }
                } else {
                    if (secondThrow != 0) {
                        System.out.println("Second");
                        return;
                    }
                }
            } else {
                if (secondThrow != 0) {
                    if (firstThrow == 0) {
                        System.out.println("Second");
                        return;
                    } else {
                        secondThrow--;
                    }
                } else {
                    if (firstThrow!= 0) {
                        System.out.println("First");
                        return;
                    }
                }
            }
        }
    }


}
