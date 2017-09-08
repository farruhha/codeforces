import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by farruhhabibullaev on 2/10/17.
 */
public class HelpfulMaths {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] numbers = scanner.next().split("\\+");
        int[] sortedString = new int[numbers.length];
        String sortedStr;
        sortedString = convertToInt(sortedString, numbers);
        Arrays.sort(sortedString);
        sortedStr = "" + sortedString[0];
        for (int i = 1; i < sortedString.length; i++) {
            sortedStr += "+" + sortedString[i];
        }
        System.out.println(sortedStr);
    }

    static int[] convertToInt(int[] numbers, String[] needsToBeSorted) {
        for (int i = 0; i < needsToBeSorted.length; i++) {
            numbers[i] = Integer.parseInt(needsToBeSorted[i]);
        }
        return numbers;
    }
}

