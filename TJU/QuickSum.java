import java.util.Scanner;

// C. QuickSum Problem set ID 2520
public class QuickSum {

	public static void main (String[] args) {
        Scanner input = new Scanner (System.in);
        boolean cont = true;
        char[] charArr;
        
        while (true){
            String line = input.nextLine ();
            charArr = line.toCharArray();
            int sum = 0;
            if (charArr[0] == '#') break;
            int current;

            for (int i = 0; i < line.length(); i++){
                if (charArr[i] == ' ') current = 0;
                else {
                    current = (charArr[i] - 'A') + 1;
                }
                sum += (i+1) * current;       
            }
            System.out.printf ("%d%n", sum);
            
        }
	}

}
