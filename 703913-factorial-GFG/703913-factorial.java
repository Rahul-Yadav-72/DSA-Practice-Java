class Solution {
    int factorial(int n) {
        // code here
        int fact = 1;
        for(int i = 1; i<=n ; i++){
            fact *= i;
        }
        return fact;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna