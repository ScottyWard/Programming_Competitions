import java.util.Scanner;

public class TimeTravelKesann {
    public static class Cow {
        int id;
        Cow parent;

        public Cow(final int id, final Cow parent) {
            this.id = id;
            this.parent = parent;
        }

        public Cow() {
            id = -1;
            parent = null;
        }
    }

    public static void main(final String[] args) {

        final Scanner scn = new Scanner(System.in);
        final int cases = scn.nextInt();

        final Cow[] mostRec = new Cow[cases + 1];
        mostRec[0] = new Cow();
        Cow lastNewCow = mostRec[0];

        for (int i = 1; i <= cases; i++) {
            final char op = scn.next().toCharArray()[0];
            if (op != 's') {
                final int operand = scn.nextInt();
                if (op == 'a') {
                    final Cow newestCow = new Cow(operand, lastNewCow);
                    lastNewCow = newestCow;
                } else {
                    // for t
                    lastNewCow = mostRec[operand - 1];
                }
            } else {
                lastNewCow = lastNewCow.parent;
            }
            mostRec[i] = lastNewCow;
            System.out.println(lastNewCow.id);
        }
    }
}