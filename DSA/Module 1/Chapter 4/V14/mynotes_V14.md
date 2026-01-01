# Video 14 - Sliding window ( Fixed size)
## My_Notes:
```
* Use Codeing Templates for Brain to Tune
    * Sliding Window means Use Start End 
    * 2 Pointers means Left Right 

* Find Max Window Size of Sub Array
    Array = [1,4,8,5,2,1], K = 3 
    Algorithm:
        findMaxSumSubArray(int[] inp, int k) {
            int windowSum,maxWindowSum = 0;
            for(int wEnd = 0; wEnd < l.input; wEnd++) {
                windowSum = windowSum + inp[wEnd];
                if((wEnd - wStart + 1) == k) {
                    maxWindowSum = Math.max(maxWindowSum, windowSum);
                    windowSum = windowSum - inp[wStart];
                    wStart++;
                }
            }
            return maxWindowSum;
        }

    Check - MaxSumSubarray_SlidingWindow.java

* Find Avg of Avg of Sub Array - AvgOfAvgSubarrays_SlidingWindow.java

* Find Count of Anagrams - AnagramCounter_SlidingWindow.java 
```

## Images:
``` Images Folder - Available ```
![Image of V14](Images/(V14)%201.png)
![Image of V14](Images/(V14)%202.png)
![Image of V14](Images/(V14)%203.png)
![Image of V14](Images/(V14)%204.png)
![Image of V14](Images/(V14)%205.png)
![Image of V14](Images/(V14)%206.png)
![Image of V14](Images/(V14)%207.png)
![Image of V14](Images/(V14)%208.png)
![Image of V14](Images/(V14)%209.png)
![Image of V14](Images/(V14)%2010.png)

## Code:
### MaxSumSubarray_SlidingWindow.java
```java
public class MaxSumSubarray_SlidingWindow {

    public static int findMaxSumSubArray(int[] inp, int k) {
        int windowSum = 0, maxWindowSum = 0;
        int wStart = 0;

        for (int wEnd = 0; wEnd < inp.length; wEnd++) {
            windowSum = windowSum + inp[wEnd];

            // Check if window has reached size k
            if (wEnd - wStart + 1 == k) {
                maxWindowSum = Math.max(maxWindowSum, windowSum);
                windowSum = windowSum - inp[wStart];
                wStart++;
            }
        }

        return maxWindowSum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 9, 5, 2, 1};
        int k = 3;
        int result = findMaxSumSubArray(arr, k);
        System.out.println("Maximum sum of subarray of size " + k + " is: " + result);
    }
}

/*  Output:
    $ java MaxSumSubarray_SlidingWindow 
    Maximum sum of subarray of size 3 is: 18
 */
```

### AvgOfAvgSubarrays_SlidingWindow.java
```java
public class AvgOfAvgSubarrays_SlidingWindow {
    public static double findAverageOfAverages(int[] arr, int k) {
        if (k > arr.length) return 0;

        double windowSum = 0;
        int wStart = 0;
        double totalAvgSum = 0;
        int count = 0;

        for (int wEnd = 0; wEnd < arr.length; wEnd++) {
            windowSum += arr[wEnd];

            if ((wEnd - wStart + 1) == k) {
                double windowAvg = windowSum / k;
                totalAvgSum += windowAvg;
                windowSum -= arr[wStart];
                wStart++;
                count++;
            }
        }

        return totalAvgSum / count;
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 8, 5, 2, 1};
        int k = 3;
        double result = findAverageOfAverages(arr, k);
        System.out.printf("Average of averages of subarrays of size %d is: %.4f\n", k, result);
    }
}

/*  Outpu:
    $ java AvgOfAvgSubarrays_SlidingWindow 
    Average of averages of subarrays of size 3 is: 4.4167
 */
```

### AnagramCounter_SlidingWindow.java
```java
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
```
## Description Of V14 - Sliding window ( Fixed size)
``` No Description ```



___
---
***
