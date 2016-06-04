import java.awt.Point;
import java.util.Scanner;

// Problem set 3013

public class AlfredosPizzaRestaurant {

	public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int radius = ip.nextInt();
        int pizza = 1;

        while (!(radius == 0)){
        	String table = "";
            int width = ip.nextInt();
            int length = ip.nextInt();
            double diam = Math.sqrt(Math.pow(width,2) + Math.pow(length, 2));
            
            if (diam <= (radius * 2)) {
                table = "fits on the table.";
            } else {
                table = "does not fit on the table.";
            }
            
            System.out.printf("Pizza %d %s%n",pizza, table);
            pizza++;
            radius = ip.nextInt();
        }
	}
}
