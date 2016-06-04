import java.util.Scanner;

// Problem set 1257

public class F91 {

    public static int f91 (int x){
        if (x >= 101) return x - 10;
        else return f91(f91(x + 11));
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        while (in.hasNext()){
            int input = in.nextInt();
            
            if (input == 0) break;
            
            System.out.println(f91(input));
        }

    }

}
