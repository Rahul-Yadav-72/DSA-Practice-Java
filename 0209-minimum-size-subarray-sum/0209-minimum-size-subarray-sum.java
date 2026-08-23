class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i = 0;
        int j = 0;
        int minL = nums.length + 1;
        int sum = 0;
        while (j < nums.length) {
            sum += nums[j];
            while (sum >= target) {
                minL = Math.min(minL, j - i + 1);
                sum -= nums[i];
                i++;
            }
            j++;
        }
        return minL == nums.length + 1 ? 0 : minL;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna