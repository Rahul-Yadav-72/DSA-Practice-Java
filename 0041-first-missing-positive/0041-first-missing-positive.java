class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        int i = 0;
        while(i<n){
            int currIndex = nums[i] - 1;
            if(nums[i] > 0 && nums[i] <= n && nums[i] != nums[currIndex]){
                int temp = nums[i];
                nums[i] = nums[currIndex];
                nums[currIndex] = temp;
            }else{
                i++;
            }
        } 
        for(int j=0 ; j<n ; j++){
            if(nums[j] != j+1){
                return j+1;
            }
        }
        return n+1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna