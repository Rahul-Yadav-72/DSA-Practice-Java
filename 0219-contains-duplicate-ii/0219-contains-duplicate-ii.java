class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer,Integer> hm = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            if(hm.containsKey(nums[i])){
               int idx = hm.get(nums[i]);
               if(Math.abs(idx - i) <= k){
                return true;
               }
            }
            hm.put(nums[i],i);
        }
        return false;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna