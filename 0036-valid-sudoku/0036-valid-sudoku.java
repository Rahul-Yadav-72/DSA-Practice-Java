class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                if (board[row][col] != '.') {
                    char digit = board[row][col];
                    // temporarily remove current digit
                    board[row][col] = '.';
                    if (!isSafe(board, row, col, digit)) {
                        return false;
                    }
                    // restore digit
                    board[row][col] = digit;
                }
            }
        }
        return true;
    }

    public boolean isSafe(char[][] board, int row, int col, char digit) {
        // row
        for (int j = 0; j < 9; j++) {
            if (board[row][j] == digit) {
                return false;
            }
        }
        // col
        for (int i = 0; i < 9; i++) {
            if (board[i][col] == digit) {
                return false;
            }
        }
        // grid
        int sr = (row / 3) * 3;
        int sc = (col / 3) * 3;
        for (int i = sr; i < sr + 3; i++) {
            for (int j = sc; j < sc + 3; j++) {
                if (board[i][j] == digit) {
                    return false;
                }
            }
        }
        return true;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna