class Solution {
    public boolean isPower(int x, int y) {
        // code here
        if( x == 1){
            return y == 1;
        }
        long m = 1;
        while(m<=y){
            if(y == m){
                return true;
            }
            m *= x;
        }
        return false;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna