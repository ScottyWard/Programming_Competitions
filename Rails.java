import java.util.Scanner;
import java.util.Stack;

// TJU ACM Problem set 1036

public class Rails {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (in.hasNext()) {
            int cases = in.nextInt();

            if (cases == 0) {
                break;
            }
            while (in.hasNext()) {
                Stack<Integer> stack = new Stack<Integer>();
                int[] train = new int[cases];

                boolean superbreak = false;
                for (int i = 0; i < cases; i++) {
                    train[i] = in.nextInt();
                    if (i == 0 && train[i] == 0) {
                        superbreak = true;
                        break;
                    }
                }

                int index = 0;
                int counter = 1;
                boolean possible = true;
                if (superbreak) {
                    System.out.println();
                    break;
                }

                while (possible && index < cases) {
                    if (!stack.isEmpty() && stack.peek() == train[index]) {
                        stack.pop();
                        index++;
                    } else {
                        stack.push(counter);

                        if (counter > cases) {
                            possible = false;
                        }
                        counter++;
                    }
                }

                if (possible)
                    System.out.println("Yes");
                else
                    System.out.println("No");
            }
        }
    }

}
