# Video 12 - String Part 2

## My_Notes:
```
* About Sliding Window Algorithm 
    See Images

    Longest Substring Without Repeating Characters (Sliding Window Algorithm)
         int finalAns(String s) {
            if (s.length <= 1) return s.length;
            int l = r = 0;
            Map<Character,Integer> hasSeen = new Hashmap;
            while(r <= s.lenght) {
               char currentChar = s[r];
               int prevSeenIndex = hasSeen.getorDefault(currentChar, -1);
               if (prevSeenIndex >= left) {
                  left = prevSeenIndex + 1;
               }
               if(!hasSeen.Containkey(currentChar)) {
                  hasSeen.put(currentChar, right);
               }
               maxLen = math.max(maxLen, R-L+1);
            }
            return maxLen;
         }
         
         Ex: LongestSubstringWithoutRepeatingCharacters_BySlidingWindow.java

* Pattern Matching
   - K.M.P Algorithm (Medium - To learn What is What)
   - Z Algorithm (Easy to implement)
   - Robi Kop Algorithm

* In String 
    Period means, ababab here ab*3

* About Z-Algorithm - in String Its a Pattern matching Algorithm
    Z Array -  At any Z array index longest prefix lenght can be made (See Image 12 of V12)
    Z Algo - see images
```


## Images:
``` Images Folder - Available ```
![Image of V12](Images/(V12)%201.png)
![Image of V12](Images/(V12)%202.png)
![Image of V12](Images/(V12)%203.png)
![Image of V12](Images/(V12)%204.png)
![Image of V12](Images/(V12)%205.png)
![Image of V12](Images/(V12)%206.png)
![Image of V12](Images/(V12)%207.png)
![Image of V12](Images/(V12)%208.png)
![Image of V12](Images/(V12)%209.png)
![Image of V12](Images/(V12)%2010.png)
![Image of V12](Images/(V12)%2011.png)
![Image of V12](Images/(V12)%2012.png)
![Image of V12](Images/(V12)%2013.png)
![Image of V12](Images/(V12)%2014.png)
![Image of V12](Images/(V12)%2015.png)
![Image of V12](Images/(V12)%2016.png)
![Image of V12](Images/(V12)%2017.png)
![Image of V12](Images/(V12)%2018.png)
![Image of V12](Images/(V12)%2019.png)
![Image of V12](Images/(V12)%2020.png)
![Image of V12](Images/(V12)%2021.png)
![Image of V12](Images/(V12)%2022.png)

## Code:
### LongestSubstringWithoutRepeatingCharacters_BySlidingWindow.java
``` java
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
```


## Description Of V12 - String Part 2
**Doubt Submission Form**

Please use the following link to access the form and submit your queries.

[https://forms.gle/SCVudmcPMW7UH9Mh9](https://forms.gle/SCVudmcPMW7UH9Mh9 "https://forms.gle/SCVudmcPMW7UH9Mh9")

We will review your submissions and provide clarifications as soon as possible. Ensure you provide accurate and detailed information for us to assist you effectively.


CHAPTERS:

00:00 - Intro

13:51 - longer substring without repeating character

22:13 - Pattern Matching

25:56 - What is period of string?

27:18 - Brute force method

38:28 - Z-Algorithm

38:59 - Z-Array

40:36 - Prefix

50:02 - Minimum period of the string using Z-array.


## String Problems Sorted by Difficulty Level

## 🟢 **EASY**

### 1\. Longest Common Prefix

-   **InterviewBit:** [https://www.interviewbit.com/problems/longest-common-prefix/](https://www.interviewbit.com/problems/longest-common-prefix/ "https://www.interviewbit.com/problems/longest-common-prefix/")
    
-   **LeetCode:** [https://leetcode.com/problems/longest-common-prefix/](https://leetcode.com/problems/longest-common-prefix/ "https://leetcode.com/problems/longest-common-prefix/") (Problem 14)
    
-   **Difficulty:** Easy
    
-   **Concept:** Basic string comparison
    

### 2\. Period of a String (Repeated Substring Pattern)

-   **LeetCode:** [https://leetcode.com/problems/repeated-substring-pattern/](https://leetcode.com/problems/repeated-substring-pattern/ "https://leetcode.com/problems/repeated-substring-pattern/") (Problem 459)
    
-   **GeeksforGeeks:** [https://www.geeksforgeeks.org/period-of-a-string/](https://www.geeksforgeeks.org/period-of-a-string/ "https://www.geeksforgeeks.org/period-of-a-string/")
    
-   **Difficulty:** Easy
    
-   **Concept:** String periodicity, basic pattern matching
    


## 🟡 **MEDIUM**

### 3\. Make String Palindrome (Valid Palindrome II)

-   **LeetCode:** [https://leetcode.com/problems/valid-palindrome-ii/](https://leetcode.com/problems/valid-palindrome-ii/ "https://leetcode.com/problems/valid-palindrome-ii/") (Problem 680)
    
-   **GeeksforGeeks:** [https://www.geeksforgeeks.org/minimum-insertions-to-form-a-palindrome-dp-28/](https://www.geeksforgeeks.org/minimum-insertions-to-form-a-palindrome-dp-28/ "https://www.geeksforgeeks.org/minimum-insertions-to-form-a-palindrome-dp-28/")
    
-   **Difficulty:** Medium
    
-   **Concept:** Two pointers, greedy approach
    

### 4\. Repeated String Match (Z-Algorithm Problem)

-   **LeetCode:** [https://leetcode.com/problems/repeated-string-match/](https://leetcode.com/problems/repeated-string-match/ "https://leetcode.com/problems/repeated-string-match/") (Problem 686)
    
-   **Difficulty:** Medium
    
-   **Concept:** **Z-Algorithm for pattern matching**
    
-   **Why Z-Algorithm:** Efficiently finds if string A repeated k times contains string B as substring
    

### 5\. Boring Substring (Longest Substring Without Repeating Characters)

-   **LeetCode:** [https://leetcode.com/problems/longest-substring-without-repeating-characters/](https://leetcode.com/problems/longest-substring-without-repeating-characters/ "https://leetcode.com/problems/longest-substring-without-repeating-characters/") (Problem 3)
    
-   **Difficulty:** Medium
    
-   **Concept:** Sliding window, hash map
    

## 🔴 **HARD**

### 6\. Shortest Palindrome (Z-Algorithm Problem)

-   **LeetCode:** [https://leetcode.com/problems/shortest-palindrome/](https://leetcode.com/problems/shortest-palindrome/ "https://leetcode.com/problems/shortest-palindrome/") (Problem 214)
    
-   **Difficulty:** Hard
    
-   **Concept:** **Z-Algorithm for palindrome detection**
    
-   **Why Z-Algorithm:** Find longest palindromic prefix by constructing string s + "#" + reverse(s) and using Z-algorithm
    

### 7\. Closest Palindrome

-   **LeetCode:** [https://leetcode.com/problems/find-the-closest-palindrome/](https://leetcode.com/problems/find-the-closest-palindrome/ "https://leetcode.com/problems/find-the-closest-palindrome/") (Problem 564)
    
-   **Difficulty:** Hard
    
-   **Concept:** String manipulation, edge case handling, mathematical approach
    

## 📊 **Summary by Difficulty**

-   **Easy:** 2 problems
    
-   **Medium:** 3 problems (including 1 Z-algorithm)
    
-   **Hard:** 2 problems (including 1 Z-algorithm)
    

## 🔍 **Z-Algorithm Problems Highlighted:**

1.  **Repeated String Match** (Medium) - Pattern matching optimization
    
2.  **Shortest Palindrome** (Hard) - Palindrome prefix finding optimization
    

## 💡 **Study Order Recommendation:**

1.  Start with Easy problems to build foundation
    
2.  Practice Medium problems focusing on different techniques
    
3.  Master Z-algorithm through the two highlighted problems
    
4.  Tackle Hard problems for interview preparation



___
---
***
