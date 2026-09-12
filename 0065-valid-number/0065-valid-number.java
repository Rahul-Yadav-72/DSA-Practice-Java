class Solution {
    public boolean isNumber(String s) {
        boolean digitSeen = false;
        boolean dotSeen = false;
        boolean eSeen = false;
        boolean digitAfterE = true;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            // Digit
            if (ch >= '0' && ch <= '9') {
                digitSeen = true;
                if (eSeen) {
                    digitAfterE = true;
                }
            }
            // Dot
            else if (ch == '.') {
                if (dotSeen || eSeen) {
                    return false;
                }
                dotSeen = true;
            }

            // e or E
            else if (ch == 'e' || ch == 'E') {
                if (eSeen || !digitSeen) {
                    return false;
                }
                eSeen = true;
                digitAfterE = false;
            }

            // + or -
            else if (ch == '+' || ch == '-') {
                if (i != 0 && s.charAt(i - 1) != 'e'
                        && s.charAt(i - 1) != 'E') {
                    return false;
                }
            }

            // Anything else
            else {
                return false;
            }
        }
        return digitSeen && digitAfterE;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna