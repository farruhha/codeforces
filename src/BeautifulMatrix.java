import java.util.Scanner;

/**
 * Created by farruhhabibullaev on 6/26/17.
 */
public class BeautifulMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int minumMove = 0;
        int[][] indexes = new int[5][5];
        for (int i = 0; i < 5; i++) {
            indexes[i][0] = scanner.nextInt();
            indexes[i][1] = scanner.nextInt();
            indexes[i][2] = scanner.nextInt();
            indexes[i][3] = scanner.nextInt();
            indexes[i][4] = scanner.nextInt();
        }

        first:
        for (int i = 0; i < indexes.length; i++) {
            for (int j = 0; j < indexes.length; j++) {
                if (indexes[i][j] == 1) {
                    minumMove = Math.abs(j - 2) + Math.abs(i - 2);
                    break first;
                }
            }
        }
        System.out.println(minumMove);

    }
}
