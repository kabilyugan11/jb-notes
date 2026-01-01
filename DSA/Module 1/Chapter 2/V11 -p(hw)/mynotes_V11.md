# Video 11 - String Part 1

## My_Notes:
```
* About String
    In String S1 and S1
        .equals -> It checks content
        == -> It checks Reference

        String s1 = "hi";
        String s2 = "hi";
        In here s1 and s2 has Same Memory Address

        String s1 = new("hello");
        String s2 = new("hello");
        In here s1 and s2 has Different Memory Address

* Basic Pre Requisties Problems:
    Reverse:
        abc -> cba
        Algo - Use 2 pointers (a & c swap)

    Palindrome:
        aba
     Algo - Use 2 pointers (a & c are equal?)

    Anagram:
        aab == baa
        Algo - Use Frequency Array (or) HashMap

* BackSpace String Compare: 
    String 1 = a#b#cd# | output : c | # -> Backspace(Clear)
    String 2 = d#c  | output : c
    String 1 & 2 are Equal

    Algorithm: Brutefore
       String getFinalString(String s) {
        char[s.length] ans;
        int index = 0;
        int end = 0;

        for (int i=0; i<s.length; i++) {
            char current = s[i];
            if (s.charAt(i) != "#") {
                //Push element
                ans[index] = s[i];
                index++;
            }
            else {
                //Pop element
                //end--; //use this also
                ans[index] = '-1';
            }
        }
        }

        boolean backspaceCompare(String s, String t) {
            String finalS1 = getFinalString(String s);
            String finalS2 = getFinalString(String t);
            return finalS1.equals(S2);
        }
    
        Ex: backspaceStringCompare.java

    Algorithm: 2 Pointer (Optimized)
        Ex: backspaceStringCompareUsing2Pointer.java

* About Sliding Window Algorithm Approach

* About Substring & Subarray
    String : abacde
    Substring - a | ba | cd
    Subarray - abcd -> here a is missing no issue but it shoud left to right

* Longest Substring Without Repeating Characters:
    Ex: longestSubstringWithoutRepeatingCharacters.java
```

## Images:
``` Images Folder - Available ```
![Image of V11](Images/(V11)%201.png)
![Image of V11](Images/(V11)%202.png)
![Image of V11](Images/(V11)%203.png)
![Image of V11](Images/(V11)%204.png)
![Image of V11](Images/(V11)%205.png)
![Image of V11](Images/(V11)%206.png)
![Image of V11](Images/(V11)%207.png)
![Image of V11](Images/(V11)%208.png)
![Image of V11](Images/(V11)%209.png)
![Image of V11](Images/(V11)%2010.png)
![Image of V11](Images/(V11)%2011.png)
![Image of V11](Images/(V11)%2012.png)
![Image of V11](Images/(V11)%2013.png)
![Image of V11](Images/(V11)%2014.png)
![Image of V11](Images/(V11)%2015.png)
![Image of V11](Images/(V11)%2016.png)
![Image of V11](Images/(V11)%2017.png)
![Image of V11](Images/(V11)%2018.png)
![Image of V11](Images/(V11)%2019.png)
![Image of V11](Images/(V11)%2020.png)

## Code:
### backspaceStringCompare.java
``` java
public class backspaceStringCompare {

    public String getFinalString(String s) {
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);

            if (current != '#') {
                // Push character
                ans.append(current);
            } else if (ans.length() > 0) {
                // Pop character (simulate backspace)
                ans.deleteCharAt(ans.length() - 1);
            }
        }

        return ans.toString();  // Convert StringBuilder to String
    }

    public boolean backspaceCompare(String s, String t) {
        String finalS1 = getFinalString(s);
        String finalS2 = getFinalString(t);
        return finalS1.equals(finalS2);
    }

    public static void main(String[] args) {
        backspaceStringCompare obj = new backspaceStringCompare();
        System.out.println(obj.backspaceCompare("ab#c", "ad#c")); // true
        System.out.println(obj.backspaceCompare("ab##", "c#d#")); // true
        System.out.println(obj.backspaceCompare("a#c", "b"));     // false
    }
}

/*  Output:
$ java backspaceStringCompare
    true
    true
    false
 */
```

### backspaceStringCompareUsing2Pointer.java
```java
public class backspaceStringCompareUsing2Pointer {

    public static void main(String[] args) {
        backspaceStringCompareUsing2Pointer sol = new backspaceStringCompareUsing2Pointer();

        // Example 1
        System.out.println(sol.backspaceCompare("ab#c", "ad#c"));  // true

        // Example 2
        System.out.println(sol.backspaceCompare("ab##", "c#d#"));  // true

        // Example 3
        System.out.println(sol.backspaceCompare("a#c", "b"));      // false
    }

    public boolean backspaceCompare(String s, String t) {
        int i = s.length() - 1;
        int j = t.length() - 1;

        while (i >= 0 || j >= 0) {
            i = getNextValidCharIndex(s, i);
            j = getNextValidCharIndex(t, j);

            char c1 = (i >= 0) ? s.charAt(i) : '\0';
            char c2 = (j >= 0) ? t.charAt(j) : '\0';

            if (c1 != c2) return false;

            i--;
            j--;
        }

        return true;
    }

    private int getNextValidCharIndex(String str, int index) {
        int backCount = 0;

        while (index >= 0) {
            if (str.charAt(index) == '#') {
                backCount++;
                index--;
            } else if (backCount > 0) {
                backCount--;
                index--;
            } else {
                break;
            }
        }

        return index;
    }
}

/*  Output:
$ java backspaceStringCompareUsing2Pointer 
    true
    true
    false
 */
```

### longestSubstringWithoutRepeatingCharacters.java
``` java
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
```


## Description Of V11 - String Part 1:
This video provides a comprehensive overview of string manipulation techniques, covering fundamental operations and advanced problem-solving strategies. It is designed for learners who want to enhance their understanding of strings, optimize their code, and prepare for coding interviews effectively.


**String Part 1 - Doubt Submission Form**

Please use the following link to access the form and submit your queries related to the "String Part 1" topic: [https://forms.gle/tcZW9cP27Z4rpjcYA](https://forms.gle/tcZW9cP27Z4rpjcYA "https://forms.gle/tcZW9cP27Z4rpjcYA")

We will review your submissions and provide clarifications as soon as possible. Ensure you provide accurate and detailed information for us to assist you effectively.


## **Chapters**

0:00 Basic Pre-requsites for string

3:23 Basic String questions

6:12 Steps to solve a problem

8:04 BackSpace problem

23:37 Optimizing BackSpace Question

53:30 Sliding window technique

56:57 Substring vs Subsequence

58:41 Longest unique substring problem


### **Topics Covered:**

1.  **String Pool & Comparisons**
    
    -   Understanding Java’s **String Pool** and memory optimization.
        
    -   Differences between `==` (reference comparison) and `.equals()` (content comparison).
        
2.  **Efficient String Manipulation**
    
    -   Performance issues with naive string concatenation.
        
    -   Using efficient alternatives to minimize memory reallocation.
        
3.  **Time Complexity Analysis**
    
    -   Evaluating operations like concatenation, substring extraction, and comparison.
        
    -   Best and worst-case performance scenarios.
        
4.  **Prefix & Suffix Processing**
    
    -   **Prefix Sum Arrays** for quick substring sum calculations.
        
    -   **Suffix Arrays** for efficient pattern matching and searching.
        
5.  **Sliding Window Technique**
    
    -   **Fixed-size window:** Longest unique substring problem.
        
    -   **Variable-size window:** Minimum window substring and anagram detection.
        
6.  **Handling Backspace in Strings**
    
    -   **Stack-based approach:** Reconstructing final strings.
        
    -   **Two-pointer approach:** Optimizing memory for text processing applications.
        

This session provides a structured approach to mastering string manipulation and algorithmic techniques.


**Pattern Matching Algorithms**

1.  **Rabin-Karp:** Hashing-based substring search.
    
2.  **KMP Algorithm:** Optimized pattern matching using preprocessing.
    
3.  **Z-Algorithm:** Efficient substring search used in DNA sequencing.
    


## **Questions Covered in This Video:**

-   **BackSpace String Compare**  
    Link:[https://leetcode.com/problems/backspace-string-compare/description/](https://leetcode.com/problems/backspace-string-compare/description/ "https://leetcode.com/problems/backspace-string-compare/description/")
    
-   **Longest Substring Without Repeating Characters**  
    Link:[https://leetcode.com/problems/longest-substring-without-repeating-characters/description/](https://leetcode.com/problems/longest-substring-without-repeating-characters/description/ "https://leetcode.com/problems/longest-substring-without-repeating-characters/description/")
    

### **Homework & Practice Problems:**

1.  **Reverse Words in a String** - [https://leetcode.com/problems/reverse-words-in-a-string/description/](https://leetcode.com/problems/reverse-words-in-a-string/description/ "https://leetcode.com/problems/reverse-words-in-a-string/description/")
    
2.  **Find All Anagrams in a String** - [https://leetcode.com/problems/find-all-anagrams-in-a-string/description/](https://leetcode.com/problems/find-all-anagrams-in-a-string/description/ "https://leetcode.com/problems/find-all-anagrams-in-a-string/description/")
    
3.  **Sliding Window for Minimum Window Substring** - [https://leetcode.com/problems/minimum-window-substring/description/](https://leetcode.com/problems/minimum-window-substring/description/ "https://leetcode.com/problems/minimum-window-substring/description/")
    

These problems will help reinforce the concepts discussed in the video.



___
---
***
