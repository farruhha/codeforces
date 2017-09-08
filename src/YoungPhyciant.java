import java.util.Scanner;

/**
 * Created by farruhhabibullaev on 6/12/17.
 */
public class YoungPhyciant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstSum = 0;
        int secondSum = 0;
        int thirdSum = 0;
        int number = scanner.nextInt();
        int[][] numbers = new int[number][3];
        for (int i = 0; i < number; i++) {
            numbers[i][0] = scanner.nextInt();
            numbers[i][1] = scanner.nextInt();
            numbers[i][2] = scanner.nextInt();
        }

        for (int i = 0; i < numbers.length; i++) {
            firstSum += numbers[i][0];
            secondSum += numbers[i][1];
            thirdSum += numbers[i][2];
        }

        if (firstSum == 0 && secondSum == 0 && thirdSum == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}
