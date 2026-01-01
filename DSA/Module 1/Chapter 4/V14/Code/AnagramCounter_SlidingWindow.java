import java.util.Arrays;

public class AnagramCounter_SlidingWindow {

    public static int countOfAnagrams(String pattern, String input) {
        if (pattern.length() > input.length()) return 0;

        int[] patternFreq = new int[26];
        int[] windowFreq = new int[26];
        int k = pattern.length();
        int count = 0;

        // Step 1: Fill pattern frequency
        for (char c : pattern.toCharArray()) {
            patternFreq[c - 'a']++;
        }

        int wStart = 0;
        for (int wEnd = 0; wEnd < input.length(); wEnd++) {
            // Add current character to window
            char currChar = input.charAt(wEnd);
            windowFreq[currChar - 'a']++;

            // If window size == k
            if ((wEnd - wStart + 1) == k) {
                // Compare frequency arrays
                if (Arrays.equals(patternFreq, windowFreq)) {
                    count++;
                }

                // Slide the window: remove char at wStart
                char startChar = input.charAt(wStart);
                windowFreq[startChar - 'a']--;
                wStart++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String pattern = "abc";
        String input = "cbadabc";
        int result = countOfAnagrams(pattern, input);
        System.out.println("Count of anagrams: " + result);
    }
}

/* Output:
    $ java AnagramCounter_SlidingWindow 
    Count of anagrams: 2
 */