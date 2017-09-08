import java.util.Scanner;

/**
 * Created by farruhhabibullaev on 2/9/17.
 */
public class TeamProblems {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] solutions = new String[n+1];
        int counter = 0;
        int solutionCounter = 0;
        for (int i = 0; i <= n; i++) {
            if (scanner.hasNextLine()) {
                solutions[i] = scanner.nextLine();
            }
        }
        for (int i = 1; i <= n; i++) {
            counter = 0;
            String[] innerString = solutions[i].split(" ");
            for (int j = 0; j < 3; j++) {
                if (innerString[j].equalsIgnoreCase("1")) {
                    counter += 1;
                }
            }
            if (counter >= 2) {
                solutionCounter += 1;
            }
        }

        System.out.println(solutionCounter);
    }
}
