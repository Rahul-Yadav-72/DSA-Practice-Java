class Solution {
    public int maxWater(int arr[]) {
        // code here
        int n = arr.length;
        //left 
        int[] left = new int[n];
        left[0] = arr[0];
        for(int i=1; i<n ; i++){
            left[i] = Math.max(left[i-1],arr[i]);
        }
        //Right 
        int[] right = new int[n];
        right[n-1] = arr[n-1];
        for(int i=n-2; i>=0 ; i--){
            right[i] = Math.max(right[i+1],arr[i]);
        }
        //loop
        int trapWater = 0;
        for(int i=0; i<n; i++){
            int waterLevel = Math.min(left[i],right[i]);
            trapWater += waterLevel-arr[i];
        }
        return trapWater;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna