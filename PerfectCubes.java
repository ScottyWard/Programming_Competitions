// Problem set: 1945
public class PerfectCubes {

    public static void main(String[] args) {
        int[] pows = new int[201];
        for (int i = 0; i <= 200; i++){
            pows[i] = (int)Math.pow(i, 3);
        }
        for (int a = 6; a <= 201; a++){
            int aPow = pows[a-1];
            for (int b = 3; b <= 200; b++){
            	int bPow = pows[b-1];
        	    for (int c = b; c <= 200; c++){
        	    	int cPow = pows[c-1];
        		    for (int d = c; d <= 200; d++){
        		    	int dPow = pows[d-1];
        		        if (aPow == bPow + cPow + dPow && (b <= c) && (c <= d)){
        		            System.out.printf("Cube = %d, Triple = (%d,%d,%d)%n", a-1, b-1, c-1, d-1);
        		        }
        	        }   
                }
            }
        }
    }
 
}
