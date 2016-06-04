import java.awt.Point;
import java.util.Scanner;

// Problem set 2955: CETVRTA
public class CETVRTA {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int x1, y1, x2, y2, x3, y3, x4 = 0, y4 = 0;
		
			x1 = input.nextInt();
			y1 = input.nextInt();
			Point p1 = new Point(x1, y1);
			x2 = input.nextInt();
			y2 = input.nextInt();
			Point p2 = new Point(x2, y2);
			x3 = input.nextInt();
			y3 = input.nextInt();
			Point p3 = new Point(x3, y3);
			
			// calculate x
			if (x1 == x2){
			    x4 = x3;
			} else if ( x1 == x3){
			    x4 = x2;
			} else if (x2 == x3){
			    x4 = x1;
			}
			// calculate y
			if (y1 == y2){
			    y4 = y3;
			} else if ( y1 == y3){
			    y4 = y2;
			} else if (y2 == y3){
			    y4 = y1;
			}
			System.out.println(x4 + " " + y4);
	}

}
