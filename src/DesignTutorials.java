import java.util.Scanner;

/**
 * Created by farruhhabibullaev on 6/27/17.
 */
public class DesignTutorials {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbers = scanner.nextInt();
        first:for (int i = 3; i < numbers - 3; i++) {
            System.out.print(i +" - i fuck you");
            for (int j = 3; j < numbers - 3; j++) {
                System.out.print(j+" - j fuck you");
                if (isComposite(i) && isComposite(j)) {
                    if (numbers == i+j){
                        System.out.println(i +" "+ j);
                        break first;
                    }
                }
            }
        }

    }

    static boolean isComposite(int num) {
        for (int i = 2; i <= num; i++) {
            if (num % i == 0) {
                return true;
            }
        }
        return false;
    }
}
