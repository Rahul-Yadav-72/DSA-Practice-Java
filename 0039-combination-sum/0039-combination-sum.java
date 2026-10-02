class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> combination = new ArrayList<>();
        getAllCombinations(candidates, 0, combination, ans, target);
        return ans;
    }
    public void getAllCombinations(int[] candidates, int i,List<Integer> combination,List<List<Integer>> ans,
        int target) {
        if (target == 0) {
            ans.add(new ArrayList<>(combination));
            return;
        }
        if (i == candidates.length || target < 0) {
            return;
        }
        // Take current element
        combination.add(candidates[i]);
        getAllCombinations(candidates, i, combination, ans,target - candidates[i]);
        // Backtrack
        combination.remove(combination.size() - 1);
        // Don't take current element
        getAllCombinations(candidates, i + 1, combination, ans, target);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna