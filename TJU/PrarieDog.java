// 10-6-12 Prarie Dog Problem set ID 2805
import java.util.Scanner;


public class PrarieDog {

    public static void middle (int order){
        int total = (int)Math.pow(3, order);
        for (int i = 1; i <= total; i++){
            System.out.print(" ");
        }
    }

    public static void dogs(int order, int low, int high){
        if (order == 0){
            System.out.print("@");
            
        } else {
        	int distance = high - low;
            int middleLow = low + (distance/3);
            int middleHigh = low + (2 * (distance / 3));
            dogs(order-1, low, middleLow);
            middle(order-1);
            dogs(order-1, middleHigh, high);
        }
    }

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    while(input.hasNext()){
        int order = input.nextInt();
        int totalDogs = (int)Math.pow(3, order);
        dogs(order, 0, totalDogs);
        System.out.println();
    }
    }

}
