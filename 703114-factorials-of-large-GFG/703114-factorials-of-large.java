class Solution {
    public ArrayList<Integer> factorial(int n) {

        ArrayList<Integer> anss = new ArrayList<>();
        anss.add(1);
        for (int i = 1; i <= n; i++) {
            int carry = 0;
            for (int j = 0; j < anss.size(); j++) {
                int value = anss.get(j) * i + carry;
                anss.set(j, value % 10);
                carry = value / 10;
            }
            while (carry > 0) {
                anss.add(carry % 10);
                carry /= 10;
            }
        }
        Collections.reverse(anss);
        return anss;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna