import java.util.Arrays;
import java.util.Scanner;

// TJU ACM Problem set 2768

public class MakingChange {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int cents = in.nextInt();
        int numberOfCoins = in.nextInt();
        int[] totalCents = new int[cents + 1];

        Arrays.fill(totalCents, Integer.MAX_VALUE - 1);
        totalCents[0] = 0;

        for (int i = 1; i <= numberOfCoins; i++) {
            int coinValue = in.nextInt();

            for (int x = coinValue; x <= cents; x++) {
                if (totalCents[x] > totalCents[x - coinValue] + 1) {
                    totalCents[x] = totalCents[x - coinValue] + 1;
                }
            }
        }

        System.out.println(totalCents[cents]);
    }

}
