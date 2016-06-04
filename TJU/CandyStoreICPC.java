import java.util.Arrays;
import java.util.Scanner;

// Problem A 2012 ICPC Southeast regional
// Uses making change algorithm
public class CandyStoreICPC {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cases = scan.nextInt();
        double budget = scan.nextDouble();
        
        
        while(cases > 0){
            int budgetInPennies = (int)(budget*100);
            int[] calories = new int[budgetInPennies+1];
            Arrays.fill(calories, Integer.MIN_VALUE);
            calories[0] = 0;
            
            for (int i = 0; i < cases; i++){
                int cal = scan.nextInt();
                double price = scan.nextDouble();
                int priceInPennies = (int)(price * 100);
                
                for (int x = priceInPennies; x <= budgetInPennies; x++){
                    if (calories[x - priceInPennies] + cal > calories[x]){
                        calories[x] = calories[x - priceInPennies] + cal;
                    }
                    if (x + priceInPennies > budgetInPennies && calories[x] > calories[budgetInPennies]){
                        calories[budgetInPennies] = calories[x];
                    }
                }
            }
            System.out.println(calories[budgetInPennies]);
            
            cases = scan.nextInt();
            budget = scan.nextDouble();
        }
    }

}
