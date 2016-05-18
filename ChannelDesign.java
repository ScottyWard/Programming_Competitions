import java.util.Scanner;

// Problem set 2248

public class ChannelDesign {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nodes = in.nextInt();
        int cases = in.nextInt();
        
        while (nodes != 0 && cases != 0){
            int[][] array = new int[nodes+1][nodes+1];
            for (int i = 0; i < cases; i++){
                int start = in.nextInt();
                int end = in.nextInt();
                int distance = in.nextInt();
                
                array[start][end] = distance;
                
            }
            
            nodes = in.nextInt();
            cases = in.nextInt();
        }
        
        System.out.println("done");

    }

}
