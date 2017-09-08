import java.util.Scanner;

/**
 * Created by farruhhabibullaev on 2/9/17.
 */
public class BitPlus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        String[] operation = new String[number];
        int x = 0;
        for (int i = 0; i < number; i++) {
            operation[i] = scanner.next();
        }
        for (String word:operation){
            if (word.contains("X++")||word.contains("++X")){
                x++;
            }else if (word.contains("X--")||word.contains("--X")){
                x--;
            }
        }
        System.out.println(x);
    }
}
