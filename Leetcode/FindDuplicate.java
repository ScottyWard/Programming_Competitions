/*
 * Author: Scotty Ward
 * Email: sward2011@my.fit.edu
 * 
 */
import java.util.HashSet;

public class FindDuplicate {

    public static void main(String[] args) {
        
    }
    
    public static int findDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
        
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return nums[i];
            } else {
                set.add(nums[i]);
            }
        }
        
        return nums[nums.length];
    }

}
