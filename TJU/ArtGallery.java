// 10-6-12 Art Gallery Problem set ID 2804
import java.math.BigInteger;
import java.util.Scanner;


public class ArtGallery {

	public static void main(String[] args) {
    
    Scanner input = new Scanner (System.in);
    String str = "3";
    BigInteger three = new BigInteger(str);

    while (input.hasNext()){
    	BigInteger big = input.nextBigInteger();
    	big = big.divide(three);
    	System.out.println(big);
    }
    }
}
