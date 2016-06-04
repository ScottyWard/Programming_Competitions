/*
 * Author: Scotty Ward
 * Email: sward2011@my.fit.edu
 * 
 */
import java.util.Arrays;

public class findMin {

    public static void main(String[] args) {
        int[] s = {4,5,6,7,0,1,2};
        System.out.println(findMin(s));
    }

    public static int findMin(int[] nums) {
        int smallest = binarySearch(nums);
        return smallest;
    }
    
    public static int binarySearch(int[] nums) {
        if (nums.length == 0) {
            return Integer.MAX_VALUE;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        int start = 1;
        int end = nums.length - 1;
        int middle = nums.length / 2;
        if (nums[middle] > nums[end]) {
            // smaller number is on the left
            return binarySearch(Arrays.copyOfRange(nums, middle, end));
        } else {
            // smaller number is on the right
            return binarySearch(Arrays.copyOfRange(nums, start, middle));
        }
    }
}
