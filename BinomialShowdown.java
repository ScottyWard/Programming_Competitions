// Problem set 1138
// Scotty Ward

import java.math.BigInteger;
import java.util.Scanner;

public class BinomialShowdown {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        int k = in.nextInt();
        BigInteger answer;
        
        while (n != 0 && k != 0){
            
            answer = factorial(n).divide(factorial(k).multiply(factorial(n-k)) );
            System.out.println(answer.intValue());
            n = in.nextInt();
            k = in.nextInt();
        }
    }
    
    public static BigInteger factorial(int fact){
        BigInteger result = BigInteger.valueOf(1);
        
        for (int i = fact; i > 0; i--){
            result = result.multiply(BigInteger.valueOf(i));
        }
        
        return result;
    }

}
