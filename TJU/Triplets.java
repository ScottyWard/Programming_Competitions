import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
 * https://www.interviewstreet.com/challenges/dashboard/#problem/50bff669014b8
 */
public class Triplets {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cases = scan.nextInt();
        ArrayList<Integer> array = new ArrayList<Integer>();

        for (int i = 0; i < cases; i++) {
            int next = scan.nextInt();
            if (!array.contains(next))
                array.add(next);
        }
        Collections.sort(array);
        int count = 0;

        for (int i = 0; i < array.size(); i++) {
            for (int j = i + 1; j < array.size(); j++) {
                for (int k = j + 1; k < array.size(); k++) {
                    count++;
                }
            }
        }

        System.out.println(count);

    }

}
