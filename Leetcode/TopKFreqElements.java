/*
 * Author: Scotty Ward
 * Email: sward2011@my.fit.edu
 * 
 */
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class TopKFreqElements {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] n = {1,1,1,2,2,3,1,3,3};
        topKFrequent(n, 2);

    }

    public static List<Integer> topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
        ValueComparator vc = new ValueComparator(map);
        TreeMap<Integer,Integer> sorted = new TreeMap<Integer,Integer>(vc);
        List<Integer> list = new ArrayList<Integer>();
        
        for(int i = 0; i < nums.length; i++) {
            int n = nums[i];
            
            if (map.containsKey(n)) {
                // Increase the count
                int count = map.get(n);
                count++;
                map.put(n, count);
            } else {
                map.put(n, 1); // Initialize the count
            }
        }
        
        System.out.println(map);
        /*
         * Sorts map as it's put into sorted. Values are
         * based off of ValueComparator
         */
        sorted.putAll(map);
        System.out.println(sorted);
        
        int counter = 0;
        /*
         * Keyset is sorted so just add elements to list
         * until we have k elements in list
         */
        for (Integer key : sorted.keySet()) {
            if (counter == k) break;
            
            list.add(key);
            counter++;
        }
        print(list);
        return list;
    }
    
    static class ValueComparator implements Comparator<Integer> {
        Map<Integer, Integer> base;

        public ValueComparator(Map<Integer, Integer> base) {
            this.base = base;
        }

        @Override
        public int compare(Integer o1, Integer o2) {
            if (base.get(o1) >= base.get(o2)) {
                return -1;
            } else {
                return 1;
            } 
        }
    }
    
    public static void print(List<Integer> l) {
        for (int i = 0; i < l.size(); i++) {
            System.out.printf("%d ", l.get(i));
        }
        System.out.println();
    }
}
