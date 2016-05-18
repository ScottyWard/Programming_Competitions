import java.util.Scanner;

// Problem set 1233

public class NumberSteps {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int cases = scan.nextInt();
        
        for (int i=0; i<cases; i++){
            int x = scan.nextInt();
            int y = scan.nextInt();
            
            if (x == y){
                if (x%2 == 0){
                    System.out.println(x*2);
                } else {
                    System.out.println((x*2)-1);
                }
                continue;
            } 
            if (x-y > 2 || (x%2 == 0 && y%2 == 1) || (y%2 == 0 && x%2 == 1)){
                System.out.println("No Number");
            } else {
                if (x%2 == 0){
                    System.out.println(x+y);
                } else {
                    System.out.println((x+y)-1);
                }
            }
        }

    }

}
