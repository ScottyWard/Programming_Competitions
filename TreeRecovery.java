import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

// TJU ACM Problem set 1144

public class TreeRecovery {

    public static void buildTree(String pre, String in) {
        if (pre.length() == 0)
            return;
        char root = pre.charAt(0);
        int index = in.indexOf(root);

        String inLeft = in.substring(0, index);
        String inRight = in.substring(index + 1);

        String preLeft = pre.substring(1, index + 1);
        String preRight = pre.substring(index + 1);

        // builds left tree
        buildTree(preLeft, inLeft);
        // builds right tree
        buildTree(preRight, inRight);

        System.out.print(root);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (in.hasNext()) {
            String preOrder = in.next();
            String inOrder = in.next();

            buildTree(preOrder, inOrder);
            System.out.println();
        }
    }

}
