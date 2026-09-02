class Solution {

    public void solveSudoku(char[][] board) {
        solve(board,0,0);

    }
    public boolean isSafe(char[][] board, int row, int col,int digit){
        //row
        for(int j=0; j<9; j++){
            if(board[row][j] == (char)(digit + '0')){
                return false;
            }
        }
        //col
        for(int i=0; i<9; i++){
            if(board[i][col]==(char)(digit + '0')){
                return false;
            }
        }
        //grid
        int sr = (row/3)*3;
        int sc = (col/3)*3;
        for(int i=sr; i<sr+3; i++){
            for(int j=sc; j<sc+3; j++){
                if(board[i][j] == (char)(digit + '0')){
                    return false;
                }
            }
        }

        return true;
    }
    public boolean solve(char[][] board, int row, int col){
        // Base case 
        if(row == 9){
            return true;
        }
        //recursion
        int nextRow = row , nextCol = col+1;
        if(col+1 == 9){
            nextRow = row+1;
            nextCol = 0;
        }
        if(board[row][col] != '.'){
           return solve(board,nextRow,nextCol);
        }
        for(int digit=1; digit<=9; digit++){
            if(isSafe(board,row,col,digit)){
                board[row][col] =(char)(digit + '0');
                if(solve(board,nextRow,nextCol)){
                    return true;
                }
                board[row][col]='.';
            }
        }
        return false;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna