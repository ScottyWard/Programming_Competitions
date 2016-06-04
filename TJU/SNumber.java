import java.util.Scanner;

// Problem set 2859

public class SNumber {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        while (in.hasNext()){
            int sizeOfSet = in.nextInt();
            if (sizeOfSet == 0) break;
            int max = in.nextInt();
            int sNumber = 0;
            
            
            for (int i = 2; i <= sizeOfSet; i++){
                int next = in.nextInt();

                if (next > sNumber && next != max) sNumber = next; // gives the s number
                if (next > max) {
                    sNumber = max;
                    max = next;
                }
            }
            System.out.println(sNumber);
        }
        

    }

}
