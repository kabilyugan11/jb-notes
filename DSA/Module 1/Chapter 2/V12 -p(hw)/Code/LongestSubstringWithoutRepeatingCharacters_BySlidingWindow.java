import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters_BySlidingWindow {
    public int finalAns(String s) {
        if (s.length() <= 1) return s.length();

        int left = 0, right = 0;
        int maxLen = 0;

        Map<Character, Integer> hasSeen = new HashMap<>();

        while (right < s.length()) {
            char currentChar = s.charAt(right);
            int prevSeenIndex = hasSeen.getOrDefault(currentChar, -1);

            if (prevSeenIndex >= left) {
                left = prevSeenIndex + 1;
            }

            hasSeen.put(currentChar, right);
            maxLen = Math.max(maxLen, right - left + 1);
            right++;
        }

        return maxLen;
    }

    public static void main(String[] args) {
        LongestSubstringWithoutRepeatingCharacters_BySlidingWindow sol = new LongestSubstringWithoutRepeatingCharacters_BySlidingWindow();

        System.out.println("Example 1: " + sol.finalAns("abcabcbb")); // Output: 3 ("abc")
        System.out.println("Example 2: " + sol.finalAns("bbbbb"));    // Output: 1 ("b")
        System.out.println("Example 3: " + sol.finalAns("pwwkew"));   // Output: 3 ("wke")
        System.out.println("Example 4: " + sol.finalAns(""));         // Output: 0 (empty string)
        System.out.println("Example 5: " + sol.finalAns("dvdf"));     // Output: 3 ("vdf")
    }
}

/*  Output:
$ java LongestSubstringWithoutRepeatingCharacters_BySlidingWindow 
    Example 1: 3
    Example 2: 1
    Example 3: 3
    Example 4: 0
    Example 5: 3
 */