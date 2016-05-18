import java.util.Scanner;


public class HeadOrTail {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int games = in.nextInt();
        
        while (games != 0){
            int maryC = 0, johnC = 0;
            
            for (int i = 0; i < games; i++){
                int game = in.nextInt();
                
                if (game == 0){
                    maryC++;
                } else {
                    johnC++;
                }
            }
            System.out.printf("Mary won %d times and John won %d times\n", maryC, johnC);
            
            games = in.nextInt();
        }

    }

}
