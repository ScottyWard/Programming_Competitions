import java.util.Scanner;


public class Root {
	
	public static double yRootX (int b, int n){
	    double yrootx = Math.pow((double)b, 1/(double)n);
	    return yrootx;
	}

	public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        while (true){
            int y = input.nextInt ();
            int x = input.nextInt ();

            if (y == 0 && x == 0) break;
            
            double root = yRootX(y, x);
            int bestRoot;
            int high = (int) Math.ceil(root);
            int low = (int) Math.floor(root);
            if (y - Math.pow((double)low, (double)x) > Math.pow((double)high, (double)x) - y)
                bestRoot = high;
            else
            	bestRoot = low;
            System.out.printf ("%d%n",bestRoot);
        }
	}

}
