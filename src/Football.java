import java.util.Scanner;

/**
 * Created by farruhhabibullaev on 2/9/17.
 */
public class Football {
    public static void main(String[] args) {
        String dangerous;
        Scanner scanner = new Scanner(System.in);
        dangerous = scanner.next();
        boolean isDangerousNot = false;
        int counter = 0;
        int tempInt;
        if (dangerous.length() >= 7) {
            for (int i = 0; i < dangerous.length() - 6; i++) {
                counter = 0;
                tempInt = Character.getNumericValue(dangerous.charAt(i));
                for (int j = 0; j < i + 7; j++) {
                    if (tempInt == Character.getNumericValue(dangerous.charAt(j))) {
                        counter++;
                    } else {
                        counter = 0;
                    }
                }
                if (counter == 7) {
                    System.out.println("YES");
                    isDangerousNot = false;
                    break;
                } else {
                    isDangerousNot = true;
                }
            }
            if (isDangerousNot) {
                System.out.println("NO");
            }
        }else{
            System.out.println("NO");
        }

    }
}
