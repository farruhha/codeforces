package contest.aprilfools;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.*;

public class GrumpyCat {
    public static void main(String[] args) {
        String[] firstCat = new String[]{"no", "no", "no", "great", "don't think so", "don't even touch", "not bad", "cool", "no", "no"};
        String[] secondCat = new String[]{"no", "no way", "no way", "don't even", "are you serious?", "go die in a hole", "worse", "terrible", "no", "no"};
        Stack<String> cat1 = new Stack<>();
        Stack<String> cat2 = new Stack<>();
        for (int i = 0; i < firstCat.length ; i++) {
            cat1.push(firstCat[i]);
            cat2.push(secondCat[i]);
        }

        Scanner scanner = new Scanner(System.in);
        int index =  scanner.nextInt();


    }
}
