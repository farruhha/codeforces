import java.util.*;

/**
 * Created by farruhhabibullaev on 2/12/17.
 */
public class ChatRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        List<Character> characters = new ArrayList<>();
        String words = "";
        if (word.length() < 5) {
            System.out.println("NO");
        } else {
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == 'h' || word.charAt(i) == 'e' || word.charAt(i) == 'l' || word.charAt(i) == 'o') {
                    if (word.charAt(i) == 'l') {
                        if (!doubleL(characters)) {
                            characters.add(word.charAt(i));
                        }
                    } else {
                        if (!characters.contains(word.charAt(i))) {
                            characters.add(word.charAt(i));
                        }
                    }
                }
            }
            for (Character character : characters) {
                words += character;
            }
            if (words.equalsIgnoreCase("hello")) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

    }

    static boolean doubleL(List<Character> stack) {
        int counter = 0;
        for (Character character : stack) {
            if (character == 'l') {
                counter++;
            }
        }
        if (counter >= 2) {
            return true;
        }
        return false;
    }


}
