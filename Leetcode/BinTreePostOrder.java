/*
 * Author: Scotty Ward
 * Email: sward2011@my.fit.edu
 * 
 */
import java.util.ArrayList;
import java.util.List;

public class BinTreePostOrder {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode(int x) { val = x; }
     * }
     */
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {
            val = x;
        }
    }
    
    public static List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        if (root == null) {
            return list;
        }
        list.addAll(postorderTraversal(root.left));
        list.addAll(postorderTraversal(root.right));
        list.add(root.val);
        
        return list;
    }

}
