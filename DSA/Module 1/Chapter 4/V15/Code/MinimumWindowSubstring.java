//  Minimum Window Substring with Duplicate Characters
public class MinimumWindowSubstring {

    // Function to find the smallest window in 's' containing all characters of 'p'
    static String getSmallestWindow(String s, String p) {
        int PF[] = new int[256]; // Pattern frequency (for characters in p)
        int WF[] = new int[256]; // Window frequency (for current window in s)
        int start = 0, end = 0;  // Pointers for the sliding window
        int ans_start = 0, ans_end = 0; // To store final answer indices
        int mc = 0; // Match count (how many characters matched)
        int minL = Integer.MAX_VALUE; // Minimum window length

        // If pattern length > string length, no answer possible
        if (p.length() > s.length()) return "";

        // Count frequency of each character in pattern p
        for (int i = 0; i < p.length(); i++) {
            PF[p.charAt(i)]++;
        }

        // Slide the end pointer to expand the window
        for (end = 0; end < s.length(); end++) {
            WF[s.charAt(end)]++; // Add character to window frequency

            // If character is part of pattern and not over-counted
            if (WF[s.charAt(end)] <= PF[s.charAt(end)] && PF[s.charAt(end)] != 0) {
                mc++; // One useful character matched
            }

            // If all characters are matched (full pattern matched in window)
            if (mc == p.length()) {

                // Shrink the window from the start to remove extra/unwanted characters
                while (PF[s.charAt(start)] == 0 || WF[s.charAt(start)] > PF[s.charAt(start)]) {
                    if (WF[s.charAt(start)] > PF[s.charAt(start)]) {
                        WF[s.charAt(start)]--; // Reduce frequency as we move start forward
                    }
                    start++;
                }

                // Update answer if current window is smaller than previously recorded window
                int wl = end - start + 1;
                if (wl < minL) {
                    minL = wl;
                    ans_start = start;
                    ans_end = end;
                }
            }
        }

        // If no valid window was found
        return minL == Integer.MAX_VALUE ? "" : s.substring(ans_start, ans_end + 1);
    }

    public static void main(String[] args) {
        String s = "abcdabca";
        String p = "aabc";

        String result = getSmallestWindow(s, p);
        System.out.println("Minimum window substring: " + result);
    }
}

/*  Output:
    $ java MinimumWindowSubstring 
    Minimum window substring: abca
 */