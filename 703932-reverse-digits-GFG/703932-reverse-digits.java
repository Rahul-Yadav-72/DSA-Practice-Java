class Solution {
    public int reverseDigits(int n) {
        // Code here
        int revers = 0;
        while(n>0){
            int d = n % 10;
            revers = (revers * 10) + d;
            n /= 10;
        }
        return revers;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna