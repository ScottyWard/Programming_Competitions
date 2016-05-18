import java.util.Scanner;

// Problem set 2800

public class Cube {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int testCases = in.nextInt();
        
        for (int i = 1; i <= testCases; i++){
            int number = in.nextInt();
            int square = number * number;
            int cube = number * number * number;
            int squareX2 = square * 2;
            int deviations = ( cube - square + 1 ) / squareX2;
            int below = square - (deviations * 2);
            int above = square + (deviations * 2);

            if (number % 2 == 0){
                below -= 1;
                above += 1;
            }
            
            System.out.println(below + " " + above);
        }

    }

}
