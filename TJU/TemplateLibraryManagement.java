import java.io.BufferedInputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class TemplateLibraryManagement {
    private static int disToNearest(final List<Integer> possible,
            final int start) {
        int dis = Integer.MAX_VALUE;

        for (final Integer currPos : possible) {
            if (currPos >= start) {
                dis = currPos;
                break;
            }
        }
        return dis;
    }

    public static void main(final String[] args) {
        final Scanner scn = new Scanner(new BufferedInputStream(
                System.in));

        while (scn.hasNext()) {
            final int n = scn.nextInt();
            final int m = scn.nextInt();

            final SortedMap<Integer, Set<Integer>> inHand = new TreeMap<Integer, Set<Integer>>(
                    Collections.reverseOrder());
            final Map<Integer, Integer> position = new HashMap<Integer, Integer>();
            final Map<Integer, List<Integer>> avaPosition = new HashMap<Integer, List<Integer>>();

            final int[] problems = new int[n];

            for (int i = 0; i < n; i++) {
                problems[i] = scn.nextInt();
                final List<Integer> possiblePositions = (avaPosition
                        .containsKey(problems[i])) ? avaPosition
                        .get(problems[i]) : new LinkedList<Integer>();

                possiblePositions.add(i);

                avaPosition.put(problems[i], possiblePositions);
            }

            for (int i = 1; i <= m; i++) {
                int dis = Integer.MAX_VALUE;
                if (avaPosition.containsKey(i)) {
                    dis = disToNearest(avaPosition.get(i), 0);
                }

                final Set<Integer> sameDis = (inHand.containsKey(dis)) ? inHand
                        .get(dis) : new HashSet<Integer>();

                sameDis.add(i);
                inHand.put(dis, sameDis);
                position.put(i, dis);
            }

            int calls = 0;

            for (int i = 0; i < problems.length; i++) {
                if (position.containsKey(problems[i])) {
                    final int key = position.get(problems[i]);
                    final Set<Integer> cards = inHand.get(key);

                    final int dis = disToNearest(
                            avaPosition.get(problems[i]), i + 1);

                    if (dis != key) {
                        cards.remove(problems[i]);
                        if (cards.size() == 0) {
                            inHand.remove(key);
                        } else {
                            inHand.put(key, cards);
                        }
                        position.remove(problems[i]);

                        final Set<Integer> sameDis = (inHand
                                .containsKey(dis)) ? inHand.get(dis)
                                : new HashSet<Integer>();

                        position.put(problems[i], dis);
                        sameDis.add(problems[i]);
                        inHand.put(dis, sameDis);
                    }
                } else {
                    calls++;

                    final int dis = disToNearest(
                            avaPosition.get(problems[i]), i + 1);

                    if (dis < inHand.firstKey()) {

                        final int key = inHand.firstKey();
                        final Set<Integer> ava = inHand.get(key);

                        if (ava.size() == 1) {
                            for (final Integer value : ava) {
                                position.remove(value);
                            }
                            inHand.remove(key);
                        } else {
                            int value = 0;
                            for (final Integer itemToRemove : ava) {
                                value = itemToRemove;
                                break;
                            }
                            position.remove(value);
                            ava.remove(value);
                            inHand.put(key, ava);
                        }

                        final Set<Integer> sameDis = (inHand
                                .containsKey(dis)) ? inHand.get(dis)
                                : new HashSet<Integer>();

                        sameDis.add(problems[i]);
                        inHand.put(dis, sameDis);
                        position.put(problems[i], dis);
                    }
                }
            }
            System.out.println(calls);
        }
    }
}