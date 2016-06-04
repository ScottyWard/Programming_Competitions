import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class removeDuplicateLetters {

    public static void main(String[] args) {
        //String s = "bcabc";
        String s = "cbacdcbc";

        System.out.println(removeDuplicateLetters(s));
    }

    public static String removeDuplicateLetters(String s) {
        Set<Character> set = new HashSet<Character>();
        List<Character> list = new LinkedList<Character>();
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!set.contains(c)){
                set.add(c);
            }
        }
        list.addAll(set);
        Collections.sort(list);
        StringBuilder sb = new StringBuilder();
        for (Character c : list) {
            sb.append(c);
        }
        return sb.toString();
    }
}
