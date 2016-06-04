import java.util.Scanner;

// Problem set: 1551
public class DigitRoots {
	
	public static int getRoot(String num){
	    int total = 0;
	    
	    for (int i = 0; i < num.length(); i++){
	        total = total + (num.charAt(i) - '0');
	    }
	    
	    return total;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String next = scan.nextLine();
		
		while(!next.equals("0")){
		    int total = getRoot(next);
		    while (total > 9){
		        total = getRoot(Integer.toString(total));
		    }
			
			System.out.println(total);
			next = scan.nextLine();
		}

	}

}
