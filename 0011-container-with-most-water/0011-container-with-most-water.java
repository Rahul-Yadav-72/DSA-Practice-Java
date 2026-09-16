class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        int lp = 0;
        int rp = height.length-1;
        while(lp < rp){
            int ht = Math.min(height[lp], height[rp]);
            int width = rp - lp;
            int currWater = ht * width;
            max = Math.max(currWater,max);
            if(height[lp] < height[rp]){
                lp++;
            }else{
                rp--;
            }
        }
        return max;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna