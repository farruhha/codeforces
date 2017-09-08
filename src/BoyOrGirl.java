import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by farruhhabibullaev on 2/12/17.
 */
public class BoyOrGirl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();
        Set<String> stringSet = new HashSet<>();

        for (int i = 0; i <string.length() ; i++) stringSet.add(Character.toString(string.charAt(i)));
        if (stringSet.size()%2!=0) System.out.println("IGNORE HIM!");
        else System.out.println("CHAT WITH HER!");

    }
}
