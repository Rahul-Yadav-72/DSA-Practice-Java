class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums);

        boolean[] used = new boolean[nums.length];

        backtrack(nums, used, new ArrayList<>(), result);

        return result;
    }

    public void backtrack(int[] nums, boolean[] used,
                          List<Integer> current,
                          List<List<Integer>> result) {

        // permutation complete
        if (current.size() == nums.length) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = 0; i < nums.length; i++) {

            // already used
            if (used[i]) {
                continue;
            }

            // duplicate avoid
            if (i > 0 && nums[i] == nums[i - 1] && !used[i - 1]) {
                continue;
            }

            // choose
            used[i] = true;
            current.add(nums[i]);

            // recursive call
            backtrack(nums, used, current, result);

            // backtrack
            current.remove(current.size() - 1);
            used[i] = false;
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna