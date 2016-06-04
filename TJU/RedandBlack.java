import java.util.Scanner;

// Problem set 2637

public class RedandBlack {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int width = scan.nextInt();
        int height = scan.nextInt();
        scan.nextLine();
        
        while (width != 0 && height !=0){
            boolean[][] board = new boolean[height][width];
            boolean[][] visited = new boolean[height][width];
            int x=0,y=0;
            // Populates the board
            for (int i=0; i<height; i++){
                String line = scan.nextLine();
                for (int j=0; j<width; j++){
                    char b = line.charAt(j);
                    board[i][j] = (b=='.');
                    visited[i][j] = (b=='#');
                    if (b=='@'){
                        x=i;
                        y=j;
                    }
                }
            }
            
            System.out.println( floodfill(x,y, board, visited, width, height));
            
            
            width = scan.nextInt();
            height = scan.nextInt();
            scan.nextLine();
        }

    }
    
    public static int floodfill(int x, int y, boolean[][] board, boolean[][] visited, int w, int h){
        if (x < 0 || y < 0 || x >= h || y >= w) return 0;
        if (visited[x][y]) return 0;
        visited[x][y] = true;
        
        return 1 + floodfill(x+1,y, board, visited, w, h) +
            floodfill(x-1,y, board, visited, w, h) +
            floodfill(x,y+1, board, visited, w, h) +
            floodfill(x,y-1, board, visited, w, h);
    }

}
