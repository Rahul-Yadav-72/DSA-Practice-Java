class Solution {
    public int maxProfit(int[] prices) {
        int max_profit = 0;
        for(int i=0; i<prices.length-1; i++){
            if(prices[i] < prices[i+1]){
                max_profit += prices[i+1] - prices[i];
            }
        }
        return max_profit;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna