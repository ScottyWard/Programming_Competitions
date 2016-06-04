/*
 * Author: Scotty Ward
 * Email: sward2011@my.fit.edu
 * 
 */
public class CountingBits {

    public static void main(String[] args) {
        System.out.println(countBits(8));

    }

    public static int[] countBits(final int num) {
        int[] array = new int[num+1];
        for (int i = 0; i <= num; i++) {
            array[i] = numOnes(i);
        }
        printarray(array);
        return array;
    }
    
    public static int numOnes(final int num) {
        int n = num;
        int count = 0;
        while (n >= 1) {
            if (n % 2 == 1) {
                count++;
            }
            if (n == 1) {
                break;
            }
            n = n / 2;
        }
        return count;
    }
    
    public static void printarray(final int[] a) {
        for(int i = 0; i < a.length; i++) {
            System.out.printf("%d ", a[i]);
        }
        System.out.println();
    }
}
