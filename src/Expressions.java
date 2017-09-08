import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by farruhhabibullaev on 6/27/17.
 */
public class Expressions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int max = 0;
        List<Integer> integerList = new ArrayList<>();
        integerList.add(a + b + c);
        integerList.add(a + b * c);
        integerList.add(a * b + c);
        integerList.add(a * b * c);
        integerList.add((a + b) * c);
        integerList.add(a * (b + c));
        max = integerList.get(0);
        for (int i = 0; i < integerList.size(); i++) {
            if (max <= integerList.get(i)) {
                max = integerList.get(i);
            }
        }
        System.out.println(max);


    }
}
