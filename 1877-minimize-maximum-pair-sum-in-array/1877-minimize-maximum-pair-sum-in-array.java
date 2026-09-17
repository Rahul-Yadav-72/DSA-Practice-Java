class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int lp = 0;
        int rp = nums.length-1;
        int max = Integer.MIN_VALUE;
        while(lp < rp){
            int sum = nums[lp] + nums[rp];
            max = Math.max(max,sum);
            lp++;
            rp--;
        }
        return max;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna