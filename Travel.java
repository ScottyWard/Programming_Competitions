import java.util.Arrays;
import java.util.Scanner;

// Problem set 2819

public class Travel {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int numCases = in.nextInt();

        for (int a = 0; a < numCases; a++) {

            int numCities = in.nextInt();
            int numRoads = in.nextInt();
            int[][] cost = new int[numCities][numCities];

            for (int b = 0; b < numCities; b++) {
                Arrays.fill(cost[b], Integer.MAX_VALUE);
            }

            int start = in.nextInt() - 1;
            int end = in.nextInt() - 1;

            for (int i = 1; i <= numRoads; i++) {
                int sPoint = in.nextInt();
                int ePoint = in.nextInt();
                int distance = in.nextInt();

                cost[sPoint - 1][ePoint - 1] = distance;
                cost[ePoint - 1][sPoint - 1] = distance;
            }
            System.out.println(dijkstra(start, end, cost));
        }

    }

    private static int dijkstra(int start, int end, int[][] cost) {
        int[] dynamic = new int[cost.length];
        Arrays.fill(dynamic, Integer.MAX_VALUE);
        dynamic[start] = 0;

        boolean[] neighborhood = new boolean[cost.length];

        while (true) {

            int nextSpot = -1;
            int nextCost = Integer.MAX_VALUE;
            for (int a = 0; a < cost.length; a++) {
                if (dynamic[a] < nextCost && !neighborhood[a]) {
                    nextSpot = a;
                    nextCost = dynamic[a];
                }
            }
            if ((nextSpot == -1 || nextSpot == end)
                    && dynamic[end] == Integer.MAX_VALUE) {
                return -1;
            } else if (nextSpot == -1 || nextSpot == end) {
                break;
            }
            neighborhood[nextSpot] = true;
            for (int a = 0; a < cost.length; a++) {
                if (cost[nextSpot][a] != Integer.MAX_VALUE) {
                    dynamic[a] = Math.min(dynamic[a], dynamic[nextSpot]
                            + cost[nextSpot][a]);
                }
            }
        }

        return dynamic[end];
    }

}
