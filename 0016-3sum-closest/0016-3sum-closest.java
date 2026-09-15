class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int diff = Integer.MAX_VALUE;
        int closest = 0;
        Arrays.sort(nums);
        for(int i=0; i<nums.length; i++){
            int j = i+1;
            int k = nums.length-1;
            while(j<k){
                int sum = nums[i] + nums[j] + nums[k];
                if(sum == target){
                    return sum;
                }else if(Math.abs(sum - target) < diff){
                    diff = Math.abs(sum - target);
                    closest = sum;
                }
                if(sum > target){
                    k--;
                }else{
                    j++;
                }
            }
        }
        return closest;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna