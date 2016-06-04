/*
 * Author: Scotty Ward
 * Email: sward2011@my.fit.edu
 * 
 */
import java.util.HashSet;
import java.util.LinkedHashSet;

public class singleNumberIII {

    public static void main(String[] args) {
        int[] test1 = {1,1,2,4,2,3,3,6,7,7};
        int[] test2 = {1,2,2,3,3};
        int[] test3 = {10,5,5,3,3,2,2,9,9};
        
        System.out.println(singleNumber(test1));
        System.out.println(singleNumber(test2));
        System.out.println(singleNumber(test3));
    }

    public static int[] singleNumber(int[] nums) {
        int[] ans = new int[2];
        HashSet<Integer> set = new LinkedHashSet<Integer>();
        
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                // element has been seen already, remove
                set.remove(nums[i]);
            } else {
                //element hasnt been seen, add to set
                set.add(nums[i]);
            }
        }
        
        int i = 0;
        
        for (Integer in: set) {
            ans[i] = in;
            i++;
        }
        return ans;
    }
}
