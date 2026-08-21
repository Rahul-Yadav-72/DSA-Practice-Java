class Solution {
    public static String reverseString(String s) {
        // code here
        StringBuilder sb = new StringBuilder("");
        for(int i=s.length()-1; i>=0; i--){
            char ch = s.charAt(i);
            sb.append(ch);
        }
        return sb.toString();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna