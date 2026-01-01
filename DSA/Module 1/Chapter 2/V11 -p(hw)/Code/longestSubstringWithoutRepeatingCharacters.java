import java.util.HashSet;
import java.util.Set;

public class longestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() <= 1) return s.length();

        int longest = 0;

        for (int L = 0; L < s.length(); L++) {
            Set<Character> hasSeen = new HashSet<>();
            int tempLen = 0;

            for (int R = L; R < s.length(); R++) {
                char currentChar = s.charAt(R);

                if (hasSeen.contains(currentChar)) break;

                hasSeen.add(currentChar);
                tempLen++;
                longest = Math.max(longest, tempLen);
            }
        }

        return longest;
    }

    public static void main(String[] args) {
        longestSubstringWithoutRepeatingCharacters sol = new longestSubstringWithoutRepeatingCharacters();

        System.out.println(sol.lengthOfLongestSubstring("abcabcbb")); // Output: 3
        System.out.println(sol.lengthOfLongestSubstring("bbbbb"));    // Output: 1
        System.out.println(sol.lengthOfLongestSubstring("pwwkew"));   // Output: 3
    }
}

/*  Output:
$ java longestSubstringWithoutRepeatingCharacters 
    3
    1
    3
 */