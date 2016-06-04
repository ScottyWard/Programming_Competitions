import java.util.Scanner;

// Problem set 1516

public class ClimbingWorm {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        
        int depth = in.nextInt();
        int climbs = in.nextInt();
        int falls = in.nextInt();
        
        while (depth != 0 && climbs != 0 && falls != 0){
            int minutes = 0;
            int distance = 0;
            
            while (distance < depth){
                distance = distance + climbs;
                minutes++;
                
                if (distance >= depth){
                    break;
                }
                distance -= falls;
                minutes++;
            }
            System.out.println(minutes);
            
            depth = in.nextInt();
            climbs = in.nextInt();
            falls = in.nextInt();
        }

    }

}
