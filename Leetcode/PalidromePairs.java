/*
 * Author: Scotty Ward
 * Email: sward2011@my.fit.edu
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PalidromePairs {

    public static void main(String[] args) {
        String t = "abca";
        String[] list1 = {"bat", "tab", "cat"};
        String[] list2 = {"abcd", "dcba", "lls", "s", "sssll"};
        String[] list3 = {"a", ""};
        System.out.println(palindromePairs(list2));
        
    }

    public static List<List<Integer>> palindromePairs(String[] s) {
        HashMap<String, Integer> palindromes = new HashMap<String, Integer>();
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        // Use set to take out multiples
        Set<List<Integer>> set = new HashSet<List<Integer>>();
        // Add words into a hashmap with their indexes.
        for (int i = 0; i < s.length; i++) {
            palindromes.put(s[i], i);
        }
        
        for (int i = 0; i < s.length; i++) {
            String word = s[i];
            for (int j = 0; j <= word.length(); j++) {
                String pre = word.substring(0, j);
                String suf = word.substring(j);
                if (isPalindrome(pre) && palindromes.containsKey(reverse(suf)) &&
                        palindromes.get(reverse(suf)) != i) {
                    List<Integer> tmp = new ArrayList<Integer>();
                    tmp.add(palindromes.get(reverse(suf)));
                    tmp.add(i);
                    set.add(tmp);
                }
            }
            
            String reverseWord = reverse(s[i]);
            for (int j = 0; j <= reverseWord.length(); j++) {
                String pre = reverseWord.substring(0, j);
                String suf = reverseWord.substring(j);
                if (isPalindrome(pre) && palindromes.containsKey(suf) &&
                        palindromes.get(suf) != i) {
                    List<Integer> tmp = new ArrayList<Integer>();
                    tmp.add(i);
                    tmp.add(palindromes.get(suf));
                    set.add(tmp);
                }
            }
        }
        
        // Turn the set into specifide list
        for (List<Integer> li: set) {
            list.add(li);
        }
        
        return list;
    }

    public static String reverse(String s) {
        StringBuilder reversed = new StringBuilder();
        
        for (int i = s.length() - 1; i >= 0; i--) {
            reversed.append(s.charAt(i));
        }
        
        return reversed.toString();
    }
    
    public static boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;
        
        while (start <= end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        
        return true;
    }
}
