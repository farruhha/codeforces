import java.util.Scanner;

/**
 * Created by farruhhabibullaev on 2/10/17.
 */
public class CapsLock {
    public static void main(String[] args) {
//        Input
//                OOPS
//        Participant's output
//        Oops
//        Jury's answer
//        oops
//        Checker comment
//        wrong answer 1st words differ - expected: 'oops', found: 'Oops'

        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        if (word.length() <= 100 && word.length() >= 1) {
            boolean isCapsLocked = false;
            boolean isFirstLetterLowerCase = false;
            if (Character.isLowerCase(word.charAt(0))) {
                isFirstLetterLowerCase = true;
            } else {
                isFirstLetterLowerCase = false;
            }
            first:
            for (int i = 1; i < word.length(); i++) {
                if (Character.isUpperCase(word.charAt(i))) {
                    isCapsLocked = true;
                } else {
                    isCapsLocked = false;
                    break first;
                }
            }
            if (word.length() > 1) {
                if (isCapsLocked && (!isFirstLetterLowerCase)) {
                    System.out.println(word.toLowerCase());
                } else if (!isCapsLocked) {
                    System.out.println(word);
                } else if (isFirstLetterLowerCase && isCapsLocked) {
                    System.out.println(word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase());
                }
            } else {
                if (Character.isLowerCase(word.charAt(0))) {
                    System.out.println(word.substring(0).toUpperCase());
                }else{
                    System.out.println(word.substring(0).toLowerCase());
                }
            }
        }
    }
}
