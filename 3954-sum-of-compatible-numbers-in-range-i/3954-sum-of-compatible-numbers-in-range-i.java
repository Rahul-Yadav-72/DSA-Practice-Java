class Solution {
    public int sumOfGoodIntegers(int n, int k) {
        int sum = 0;

        for (int x = Math.max(1, n - k); x <= n + k; x++) {
            if ((n & x) == 0) {
                sum += x;
            }
        }

        return sum;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna