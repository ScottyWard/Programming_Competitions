import java.util.Scanner;

// TJU ACM Problem set 1939

public class SpeedLimit {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int numberOfLogs = in.nextInt();

        while (numberOfLogs != -1) {
            int totalMiles = 0;
            int hour = 0;

            for (int i = 1; i <= numberOfLogs; i++) {
                int speed = in.nextInt();
                int timeHours = in.nextInt();

                totalMiles = totalMiles + (speed * (timeHours - hour));
                hour = timeHours;
            }

            System.out.println(totalMiles + " miles");

            numberOfLogs = in.nextInt();
        }
    }

}
