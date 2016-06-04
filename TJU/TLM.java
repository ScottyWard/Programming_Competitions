import java.util.Scanner;


public class TLM {

	public static void main(String[] args) {
		int count = 0;
		Scanner ip = new Scanner(System.in);
		int numNumbers = ip.nextInt();
		int templates = ip.nextInt();
		
		while (ip.hasNext()){
			int current = ip.nextInt();
		    if (current > templates){
		        count++;
		    }
		}

	}

}
