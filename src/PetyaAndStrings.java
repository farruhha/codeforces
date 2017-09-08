import java.util.Scanner;

/**
 * Created by farruhhabibullaev on 2/10/17.
 */
public class PetyaAndStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstString = scanner.next();
        String secondString = scanner.next();
        if (firstString.compareToIgnoreCase(secondString) == 0){
            System.out.println("0");
        }else if (firstString.compareToIgnoreCase(secondString) < 0){
            System.out.println("-1");
        }else{
            System.out.println("1");
        }
//        System.out.println(firstString.compareToIgnoreCase(secondString));


    }
}
