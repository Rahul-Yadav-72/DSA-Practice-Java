class Solution {
    public int findNthDigit(int n) {
        long digits = 1;
        long start = 1;
        long count = 9;
        // Find the digit-length group
        while (n > digits * count) {
            n -= digits * count;
            digits++;
            start *= 10;
            count *= 10;
        }
        // Find the actual number
        long num = start + (n - 1) / digits;
        // Find the digit inside that number
        int index = (int) ((n - 1) % digits);
        return String.valueOf(num).charAt(index) - '0';
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna