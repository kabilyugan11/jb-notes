# Video 7 - Hashing Part 1

## My_Notes:
```
* About Hashing
    Hash set - To find just index is avialble
    Hash Map - After finded index and store value for each index

    Check -> frequencyCount.java,
             intersectionOfArray.java

    HW:
        Pending

```

## Images:
``` Images Folder - Available ```
![Image of V7](Images/(V7)%201.png)
![Image of V7](Images/(V7)%202.png)
![Image of V7](Images/(V7)%203.png)
![Image of V7](Images/(V7)%204.png)
![Image of V7](Images/(V7)%205.png)
![Image of V7](Images/(V7)%206.png)
![Image of V7](Images/(V7)%207.png)
![Image of V7](Images/(V7)%208.png)
![Image of V7](Images/(V7)%209.png)
![Image of V7](Images/(V7)%2010.png)
![Image of V7](Images/(V7)%2011.png)
![Image of V7](Images/(V7)%2012.png)
![Image of V7](Images/(V7)%2013.png)
![Image of V7](Images/(V7)%2014.png)
![Image of V7](Images/(V7)%2015.png)
![Image of V7](Images/(V7)%2016.png)

## Code:

### frequencyCount.java
``` java
import java.util.HashMap;
import java.util.Map;

public class frequencyCount {
    //Algorith 1
    public int[] freqCount1 (int[] array, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            int ce = array[i]; // ce -> Current Element
            if (map.containsKey(ce)){
                int ceCount = map.get(ce);
                ceCount++;
                map.put(ce,ceCount);
            }
            else {
                map.put(ce,1);
            }
        }
        int freq = 0;
        int exits = 0;
        if (map.containsKey(target)){
            exits = 1;
            freq = map.get(target); 
        }
        return new int[]{exits, freq};
    }

    //Algorith 2
    public int[] freqCount2 (int[] array, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            int ce = array[i];
            int c = map.getOrDefault(ce, 0);
            c++;
            map.put(ce, c);
        }
        int exists = map.containsKey(target) ? 1 : 0;
        int freq = exists == 1 ? map.get(target) : 0;
        return new int[]{exists, freq};
    }

     public int[] freqCountBrutefore(int[] array, int target) {
        int freq = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                freq++;
            }
        }
        int exists = freq > 0 ? 1 : 0;
        return new int[]{exists, freq};
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 5, 1, 6, 5, 3};
        int find = 2;
        frequencyCount objFC = new frequencyCount();

        // By Algorith 1
        int[] output = objFC.freqCount1(arr, find);
        System.out.println("Target element "+ find + " is exits? : " + output[0] + " & Frequency is " + output[1]);
         
        // By Algorith 2
        int[] output2 = objFC.freqCount2(arr, find);
        System.out.println("Target element "+ find + " is exits? : " + output2[0] + " & Frequency is " + output2[1]);

         // By Algorith 3
        int[] output3 = objFC.freqCountBrutefore(arr, find);
        System.out.println("Target element "+ find + " is exits? : " + output3[0] + " & Frequency is " + output3[1]);
    }
}

/*  Output:
    $ java frequencyCount
    Target element 2 is exits? : 1 & Frequency is 2
    Target element 2 is exits? : 1 & Frequency is 2
    Target element 2 is exits? : 1 & Frequency is 2
 */
```

### intersectionOfArray.java
``` java
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class intersectionOfArray {
    public int[] intersectionOfArr(int[] arr1, int[] arr2) {
        // Use the smaller array for HashSet
        int[] small = arr1.length <= arr2.length ? arr1 : arr2;
        int[] large = arr1.length > arr2.length ? arr1 : arr2;

        Set<Integer> set = new HashSet<>();
        for (int num : small) {
            set.add(num);
        }

        Set<Integer> ans = new HashSet<>();
        for (int num : large) {
            if (set.contains(num)) {
                ans.add(num);
            }
        }

        // Convert Set to int[]
        int[] result = new int[ans.size()];
        int i = 0;
        for (int num : ans) {
            result[i++] = num;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 5, 5, 4, 3, 2};
        int[] arr2 = {4, 5, 9};
        System.out.println(Arrays.toString(arr1) + Arrays.toString(arr2));

        intersectionOfArray objIOA = new intersectionOfArray();
        int[] output = objIOA.intersectionOfArr(arr1, arr2);
        System.out.println(Arrays.toString(output));
    }
}

/*  Output:
    $ java intersectionOfArray
    [1, 5, 5, 4, 3, 2][4, 5, 9]
    [4, 5]
 */
`

## Description Of V7 - Hashing Part 1

Unlock the power of hashing in this comprehensive guide! We’ll start with the basics, dive into how hashing works behind the scenes, and tackle some key problems in hashing. Whether you're new to Data Structures and Algorithms or looking to deepen your understanding, this video will give you the insights you need to master hashing. Get ready to simplify complex concepts and apply hashing like a pro!

### **Chapters**

-   **5:18** - How Hashing works?
    
-   **12:10** - Time Complexity Analysis
    
-   **17:03** - Real Time Hashing Examples
    
-   **20:42** - Question 1 (Frequency Count)
    
-   **25:12** - Improving Code Quality
    
-   **28:53** - Question 2 (Intersection of Array)
    
-   **35:54** - Question 3 (Replicating Substring)
    
-   **46:04** - Improving Code Quality
    
-   **47:39** - Question 4 Intro and updates
    
### **Hashing Part 1 - Doubt Submission Form**

Please use the following link to access the form and submit your queries related to the "Hashing Part 1" topic:

[**Hashing Part 1 Doubt Form**](https://forms.gle/gXNtWop2oJiYxo7Q6 "https://forms.gle/gXNtWop2oJiYxo7Q6")

We will review your submissions and provide clarifications as soon as possible. Ensure you provide accurate and detailed information for us to assist you effectively.

LeetCode Questions Covered in the Video

This video explores hashing fundamentals and introduces problem-solving techniques. Understanding how to efficiently count frequencies of elements using hash maps. Here are the problems discussed:

**Basic Hashing Operations**

1.  **Frequency Count**
    
    -   **Name:** Count Elements with Maximum Frequency
        
    -   **Objective:** Find the element that appears most frequently in an array.
        
    -   **Approach:**
        
        -   Use a hash map to store the frequency of each element and determine which element has the maximum frequency.
            
    -   **Link:** [https://leetcode.com/problems/count-elements-with-maximum-frequency/description/](https://leetcode.com/problems/count-elements-with-maximum-frequency/description/ "https://leetcode.com/problems/count-elements-with-maximum-frequency/description/")
        
2.  **Intersection of Two Arrays**
    
    -   **Name:** Intersection of Two Arrays II
        
    -   **Objective:** Find the intersection of two arrays, considering duplicates based on the frequency of each element.
        
    -   **Approach:**
        
        -   Use hash maps to count the frequency of each element in both arrays and identify common elements based on the frequency.
            
    -   **Link:** [https://leetcode.com/problems/intersection-of-two-arrays-ii/description/](https://leetcode.com/problems/intersection-of-two-arrays-ii/description/ "https://leetcode.com/problems/intersection-of-two-arrays-ii/description/")
        

3.  **Replicating Substring**
    
    -   **Name :** Repeated Substring Pattern
        
        -   **Objective:** Check if a string can be formed by repeating a substring.
            
        -   **Approach:**
            
            -   Use hashing or string manipulation techniques to verify if the string is composed of repeated substrings.
                
        -   **Link:** [https://leetcode.com/problems/repeated-substring-pattern/description/](https://leetcode.com/problems/repeated-substring-pattern/description/ "https://leetcode.com/problems/repeated-substring-pattern/description/")
            
    -   **Name :** Longest Substring with At Least K Repeating Characters
        
        -   **Objective:** Find the longest substring where each character appears at least K times.
            
        -   **Approach:**
            
            -   Use a frequency counter (hash map) to track character counts and ensure that the substring has characters repeating at least K times.
                
        -   **Link:** [https://leetcode.com/problems/longest-substring-with-at-least-k-repeating-characters/description/](https://leetcode.com/problems/longest-substring-with-at-least-k-repeating-characters/description/ "https://leetcode.com/problems/longest-substring-with-at-least-k-repeating-characters/description/")
     


___
---
***
