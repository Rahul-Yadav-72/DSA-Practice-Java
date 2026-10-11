class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        getPermute(nums,0,ans);
        return ans;
        
    }
    public void getPermute(int[] nums, int idx, List<List<Integer>> ans){
        //Base case 
        if(idx == nums.length){
            List<Integer> list = new ArrayList<>();
            for(int num : nums){
                list.add(num);
            }
            ans.add(list);
            return ;
        }

        for(int i = idx; i<nums.length; i++){
            
            swap(nums,idx,i); // Swap

            getPermute(nums,idx+1,ans); // Recursive call

            swap(nums,idx,i); // Backtracking
        }
    }
    public void swap(int[] nums, int idx, int i) {
        int temp = nums[idx];
        nums[idx] = nums[i];
        nums[i] = temp;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna