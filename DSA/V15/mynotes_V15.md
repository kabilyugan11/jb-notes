# Video 15 - Sliding window (Variable size)
## My_Notes:
```
* About Sliding window (Variable Size)
    Your answer is not Fixed Size

* Shrinking logic in Sliding window (Variable Size)
    
* Find the Length of the Smallest Subarray With Sum >= K (Sliding Window) -> SmallestSubarraySumGreaterthanK

* Longest Substring with Exactly K Unique Characters (Sliding Window) -> LongestSubstringWithKUniqueChars.java

* Minimum Window Substring with Duplicate Characters -> MinimumWindowSubstring.java
```

## Images:
``` Images Folder - Available ```
![Image of V15](Images/(V15)%201.png)
![Image of V15](Images/(V15)%202.png)
![Image of V15](Images/(V15)%203.png)
![Image of V15](Images/(V15)%204.png)
![Image of V15](Images/(V15)%205.png)
![Image of V15](Images/(V15)%206.png)
![Image of V15](Images/(V15)%207.png)
![Image of V15](Images/(V15)%208.png)
![Image of V15](Images/(V15)%209.png)
![Image of V15](Images/(V15)%2010.png)
![Image of V15](Images/(V15)%2011.png)
![Image of V15](Images/(V15)%2012.png)
![Image of V15](Images/(V15)%2013.png)
![Image of V15](Images/(V15)%2014.png)
![Image of V15](Images/(V15)%2015.png)
![Image of V15](Images/(V15)%2016.png)
![Image of V15](Images/(V15)%2017.png)

## Code:
### SmallestSubarraySumGreaterthanK.java
```java
// Find the Length of the Smallest Subarray With Sum >= K (Sliding Window)
public class SmallestSubarraySumGreaterthanK {
    public static int minSubArrayLen(int k, int[] nums) {
        int ws = 0;
        int we = 0;
        int wSum = 0;
        int minLen = Integer.MAX_VALUE;

        while (we < nums.length) {
            wSum = wSum + nums[we]; // alternative to wSum += nums[we]

            // Shrink window while sum is >= k
            while (wSum >= k) {
                minLen = Math.min(minLen, we - ws + 1);
                wSum = wSum - nums[ws];
                ws++;
            }

            we++;
        }

        if (minLen == Integer.MAX_VALUE) {
            return 0;
        } else {
            return minLen;
        }
    }

    public static void main(String[] args) {
        int[] input = {3, 3, 4, 1, 2, 4, 1, 2, 5}; // updated input
        int k = 7;
        int result = minSubArrayLen(k, input);
        System.out.println("Smallest subarray length with sum >= " + k + " is: " + result);
    }
}


/*  Output:
    $ java SmallestSubarraySumGreaterthanK
    Smallest subarray length with sum >= 7 is: 2
 */
```

### LongestSubstringWithKUniqueChars.java
```java
// Longest Substring with Exactly K Unique Characters (Sliding Window)
public class LongestSubstringWithKUniqueChars {
    public static int longestKSubstr(String s, int k) {
        int[] wf = new int[26]; // window frequency
        int uc = 0;             // unique character count
        int maxL = 0;           // max length
        int st = 0, e = 0;      // window start and end
        int l = s.length();

        while (e < l) {
            wf[s.charAt(e) - 'a']++;
            if (wf[s.charAt(e) - 'a'] == 1) {
                uc++;
            }

            if (uc == k) {
                maxL = Math.max(maxL, e - st + 1);
            }

            while (uc > k) {
                wf[s.charAt(st) - 'a']--;
                if (wf[s.charAt(st) - 'a'] == 0) {
                    uc--;
                }
                st++;
            }

            e++;
        }

        return maxL;
    }

    public static void main(String[] args) {
        String input = "aabacbebebe";
        int k = 3;
        int result = longestKSubstr(input, k);
        System.out.println("Longest substring with " + k + " unique characters is of length: " + result);
    }
}

/*  Output:
    $ java LongestSubstringWithKUniqueChars
    Longest substring with 3 unique characters is of length: 7
 */
```
### MinimumWindowSubstring.java
```java
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
```
## Description Of V15 - Sliding window (Variable size)
``` No Description ```



___
---
***
