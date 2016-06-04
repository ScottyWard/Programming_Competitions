/*
 * Author: Scotty Ward
 * Email: sward2011@my.fit.edu
 */
import java.util.Arrays;

public class singleNumber {

    public static void main(String[] args) {
        int[] test1 = {1,1,2,2,3,3,6,7,7};
        int[] test2 = {1,2,2,3,3};
        int[] test3 = {10,5,5,3,3,2,2,9,9};

        //System.out.println(singleNumber(test1));
        //System.out.println(singleNumber(test2));
        System.out.println(singleNumber(test3));
    }

    public static int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int one = 0;
        
        for (int i = 0; i < nums.length; i=i+2) {
            // Last index left
            if (i == nums.length-1) {
                one = nums[i];
                break;
            }
            int beg = nums[i];
            int end = nums[i+1];
            
            if (beg != end) {
                one = nums[i];
                break;
            }
        }
        return one;
    }
}
