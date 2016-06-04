import java.util.Scanner;

// Problem sey 1818
public class SimpleQuestionChemistry {

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        double prev = scan.nextDouble();
        double current = scan.nextDouble(), diff;
        while (current != 999){
            diff = current - prev;
            System.out.printf("%.2f\n", diff);
            prev = current;
            current = scan.nextDouble();
        }
        System.out.println("End of Output");

    }

}
