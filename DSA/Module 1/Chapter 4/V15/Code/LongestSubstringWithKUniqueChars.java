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