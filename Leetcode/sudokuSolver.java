/*
 * Author: Scotty Ward
 * Email: sward2011@my.fit.edu
 * 
 */
public class sudokuSolver {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        char[][] board = {
                {'.','.','9','7','4','8','.','.','.'},
                {'7','.','.','.','.','.','.','.','.'},
                {'.','2','.','1','.','9','.','.','.'},
                {'.','.','7','.','.','.','2','4','.'},
                {'.','6','4','.','1','.','5','9','.'},
                {'.','9','8','.','.','.','3','.','.'},
                {'.','.','.','8','.','3','.','2','.'},
                {'.','.','.','.','.','.','.','.','6'},
                {'.','.','.','2','7','5','9','.','.'}
                };
        
        solveSudoku(board);
    }

    public static void solveSudoku(char[][] board) {
        printboard(board);
    }
    
    public static void printboard(char[][] board) {
        for (int i = 0; i < 9; i++){
            for(int j = 0; j< 9; j++){
                System.out.printf("%s ", board[i][j]);
            }
            System.out.println();
        }
    }
}
