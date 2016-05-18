import java.util.Scanner;


public class NumberSequence {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        
        while (number != 0){
            int count = 1;
            int current = number;
            
            while (current != 1){
                if (current % 2 == 0){
                    current = current / 2;
                } else {
                    current = (current * 3) + 1;
                }
                count++;
            }
            System.out.println(count);
            number = in.nextInt();
        }
    }

}
