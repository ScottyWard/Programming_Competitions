import java.util.Scanner;


// Problem set 2814
public class BitwiseReverse {

    
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int input = in.nextInt();
        int[] bits = new int[20];
        
        while (input != 0){
            bits = numBits(input);
            System.out.println(flipBits(bits));
            input = in.nextInt();
        }
    }
    
    public static int flipBits(int[] array){
        int size = 0;
        int[] flippedArray;
        int index;
        int total = 0;
        
        for (int i=19; i<=20; i--){
            if (array[i] == 1){
                size = i+1;
                break;
            }
        }
        flippedArray = new int[size];

        index = 0;
        for (int i=size-1; i>=0; i--){
            flippedArray[index] = array[i];
            index++;
        }
        
        for (int i=0; i<=size-1; i++){
            if (flippedArray[i] == 1){
                total = total + (int)Math.pow(2,i);
            }
        }
        return total;
    }
    
    public static int[] numBits (int x){
        int number = x;
        int[] bits = new int[20];
        
        for (int i=19; i>=0; i--){
            int power = (int)Math.pow(2,i);
            if (number >= power && number > 0){
                bits[i] = 1;
                number = number - power;
            }
        }
        return bits;
    }

}
