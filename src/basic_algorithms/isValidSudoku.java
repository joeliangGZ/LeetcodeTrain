package basic_algorithms;

public class isValidSudoku {

    public boolean isValidSudoku(char[][] board) {
        
        // i row num exists?
        boolean[][] rows = new boolean[9][9];
        
        // j col num exists?
        boolean[][] cols = new boolean[9][9];

        // boxes num exists?
        boolean[][] boxes = new boolean[9][9];

        for(int r = 0; r<9; r++) {
            for(int c = 0; c<9; c++) {
                
                char val = board[r][c]; 
                
                if(val == '.') {
                    continue; 
                }

                int num = val - '1';

                int boxIndex = (r/3) * 3 + (c/3);
                
                if(rows[r][num] || cols[c][num] || boxes[boxIndex][num]) {
                    return false;
                }

                rows[r][num] = true; 
                cols[c][num] = true; 
                boxes[boxIndex][num] = true;

            }
        }

        return true;
    }
    
}
