import java.util.Scanner;

// tju problem set 1818
public class SimpQuesChem {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        double first = in.nextDouble();
        double second = in.nextDouble();
        double nnn = 999;
        while ( second != nnn){
            
            System.out.printf("%.2f\n", second - first);
            
            first = second;
            second = in.nextDouble();
        }
        System.out.println("End of Output");
    }

}
