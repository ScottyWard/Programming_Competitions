/*
 * Author: Scotty Ward
 * Email: sward2011@my.fit.edu
 * 
 */
import java.util.Arrays;

public class coinChange {

    public static void main(String[] args) {
        int[] coins = {2};
        System.out.println(coinChange(coins, 3));

    }

    public static int coinChange(int[] coins, int amount) {
        int[] min = new int[amount + 1];
        // Fill with max vaule since were taking min amount
        Arrays.fill(min, Integer.MAX_VALUE - 1);
        // Initialize first index to zero
        min[0] = 0;
        
        /*
         * Iterate through each coin. Look back coins[i]
         * spaces and take the minimum of min[j - coins[i]] + 1
         * and min[j]
         */
        for (int i = 0; i < coins.length; i++) {
            for (int j = coins[i]; j <= amount; j++) {
                int small = Math.min(min[j-coins[i]] + 1, min[j]);
                min[j] = small;
            }
        }
        
        if (min[amount] == Integer.MAX_VALUE - 1) {
            return -1;
        } else {
            return min[amount]; 
        }

    }
}
