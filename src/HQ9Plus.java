import java.util.Scanner;

/**
 * Created by farruhhabibullaev on 2/10/17.
 */
public class HQ9Plus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String stringWord = scanner.next();
        boolean yesNo = false;
           first: for (int i = 0; i < stringWord.length(); i++) {
                if (Character.toString(stringWord.charAt(i)).equals("H")) {
                    yesNo = true;
                    break first;
                } else if (Character.toString(stringWord.charAt(i)).equals("Q")) {
                    yesNo = true;
                   break first;
                } else if (Character.toString(stringWord.charAt(i)).equals("9")) {
                    yesNo = true;
                    break first;
                }

//                else if (Character.toString(stringWord.charAt(i)).equals("+")) {
//                    yesNo = true;
//                    break first;
//                }
            }
        if (yesNo) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
