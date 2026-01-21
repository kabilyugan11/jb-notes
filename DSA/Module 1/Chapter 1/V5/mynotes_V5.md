# Video 5 - Arrays Part 1

## My_Notes:
```
* About Find Maximum Element in Array Problem:
    Refer Image 1
    Find_Max_Element_inArray.java

* Brutefore - Trying All Combinations and which matches then return it

* About Pair Sum Problem:
    Array = {5, 7, 6, 4, 3, 3}
    Array = {5, 2, 7, 4, 3, 8}
    Pair Sum = 10

    Serious of Steps To Follow:
        1. Verify Constraints:
            -ve ? --> -3
            max ? --> for int or long or double
            2 answers ? --> 7+3 = 10,6+4 = 10
        
        2.Interesting Test Cases:
            [] ? --> If array is empty then what return (null or empty array)
            [5] ? --> Single element
            [3, 4] ? --> No ans
            null ? --> Given array is null 

        3.Brutefore

        4.Observations -> What we try to make code efficient
            3 Scenarios:
                Brute Force (for-for loop) ---> PairSum1_Brute.java
                Two Pointer (after sorting) ---> PairSum2_Sorted.java
                Hashing (HashMap approach) ---> PairSum3_Hashing.java

* About Largest Water Container Problem:
    LargestWaterContainer.java | HW -> containerWithMostWater.java

* About Total Water In City Problem:
    TrappingRainWater.java (Not correct question's ans -> i think diff questions ans because not good explainnation by JB)
     
* HW:
    Basic Array Operations:
        1.Find Maximum in an Array ---> findMaximumInArray.java (https://www.geeksforgeeks.org/problems/largest-element-in-array4009/0)

        2.Sum of Square Numbers ---> squareSum.java (https://leetcode.com/problems/sum-of-square-numbers/)

    Intermediate Array Problems:
        1.Container With Most Water ---> containerWithMostWater.java |  LargestWaterContainer.java (JB)
        (https://leetcode.com/problems/container-with-most-water/description/)

    Advanced Array Challenges:
        1.Trapping Rain Water ---> trappingRainWater.java (https://leetcode.com/problems/trapping-rain-water/)

    Arrays Part 1: Homework Assignment:
    Easy Questions:
        1.Find All Numbers Disappeared in an Array ---> findAllNumbersDisappearedInArray.java (https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/)

        2.Set Operations on Arrays:
            2a.Intersection of Two Arrays ---> intersectionOfTwoArrays (https://leetcode.com/problems/intersection-of-two-arrays-ii/)

            2b.Find the Difference of Two Arrays ---> findTheDifferenceOfTwoArrays.java (https://leetcode.com/problems/find-the-difference-of-two-arrays/)

    Medium Questions:
        1.Find All Duplicates in an Array ---> findAllDuplicatesInArray.java (https://leetcode.com/problems/find-all-duplicates-in-an-array/)
```

## Images:
``` Images Folder - Available ```
![Image of V5](Images/(V5)%201.png)
![Image of V5](Images/(V5)%202.png)
![Image of V5](Images/(V5)%203.png)
![Image of V5](Images/(V5)%204.png)
![Image of V5](Images/(V5)%205.png)
![Image of V5](Images/(V5)%206.png)
![Image of V5](Images/(V5)%207.png)
![Image of V5](Images/(V5)%208.png)
![Image of V5](Images/(V5)%209.png)
![Image of V5](Images/(V5)%2010.png)
![Image of V5](Images/(V5)%2011.png)
![Image of V5](Images/(V5)%2012.png)
![Image of V5](Images/(V5)%2013.png)
![Image of V5](Images/(V5)%2014.png)
![Image of V5](Images/(V5)%2015.png)
![Image of V5](Images/(V5)%2016.png)
![Image of V5](Images/(V5)%2017.png)
![Image of V5](Images/(V5)%2018.png)
![Image of V5](Images/(V5)%2019.png)
![Image of V5](Images/(V5)%2020.png)
![Image of V5](Images/(V5)%2021.png)
![Image of V5](Images/(V5)%2022.png)
![Image of V5](Images/(V5)%2023.png)
![Image of V5](Images/(V5)%2024.png)
![Image of V5](Images/(V5)%2025.png)
![Image of V5](Images/(V5)%2026.png)
![Image of V5](Images/(V5)%2027.png)
![Image of V5](Images/(V5)%2028.png)
![Image of V5](Images/(V5)%2029.png)
![Image of V5](Images/(V5)%2030.png)
![Image of V5](Images/(V5)%2031.png)
![Image of V5](Images/(V5)%2032.png)
![Image of V5](Images/(V5)%2033.png)
![Image of V5](Images/(V5)%2034.png)
![Image of V5](Images/(V5)%2035.png)
![Image of V5](Images/(V5)%2036.png)
![Image of V5](Images/(V5)%2037.png)
![Image of V5](Images/(V5)%2038.png)
![Image of V5](Images/(V5)%2039.png)
![Image of V5](Images/(V5)%2040.png)
![Image of V5](Images/(V5)%2041.png)
![Image of V5](Images/(V5)%2042.png)
![Image of V5](Images/(V5)%2043.png)
![Image of V5](Images/(V5)%2044.png)
![Image of V5](Images/(V5)%2045.png)

## Code:
### Find_Max_Element_inArray.java
```java
import java.util.Scanner;
import java.util.Arrays;

class numArray{
    public int findMax(int[] array) {
        System.out.println("Array : " + Arrays.toString(array));
        //int max = 0;  //it cannot find Negative numbers for findMax (because 0 is larger than all negative numbers)
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            int currentElememt = array[i];
            if (currentElememt > max) {
                max = currentElememt;
            }
        }
        return max;
        
    }
}

public class Find_Max_Element_inArray {
    public static void main(String[] args) {
        //int[] array = {7,8,2,9,5,3};
        Scanner scanner = new Scanner(System.in);

        System.out.print("Number of Elements : ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        System.out.println("Enter " + size + " Elements: ");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        scanner.close();

        numArray numArrayObj = new numArray();
        int output = numArrayObj.findMax(array);
        System.out.println("Max Element is : " + output);
    }

}

/*  Output:
    $ java Find_Max_Element_inArray
    Number of Elements : 5
    Enter 5 Elements: 
    -1
    0
    1
    2
    3
    Array : [-1, 0, 1, 2, 3]
    Max Element is : 3
 */
```

### PairSum1_Brute.java
``` java
public class PairSum1_Brute {
    public static void main(String[] args) {
        int[] arr = {5, 2, 7, 4, 3, 8};
        int target = 10;

        System.out.println("Bruteforeces Pairs :");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println(arr[i] + " + " + arr[j] + " = " + target);
                }
            }
        }
    }
}

/*  Output:
    $ java PairSum1_Brute 
    Bruteforeces Pairs :
    2 + 8 = 10
    7 + 3 = 10
 */
```

### PairSum2_Sorted.java
``` java
import java.util.Arrays;

public class PairSum2_Sorted {
    public static void main(String[] args) {
        int[] arr = {5, 2, 7, 4, 3, 8};
        int target = 10;

        Arrays.sort(arr);   // Array becomes: [2, 3, 4, 5, 7, 8]
        int left = 0;
        int right = arr.length - 1;

        System.out.println("Two Pointer Pairs (Sorting):");
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) {
                System.out.println(arr[left] + " + " + arr[right] + " = " + target);
                left++;
                right--;
            }
            else if (sum < target) {
                left++;
            }
            else {
                right++; 
                // ex : 7+4 = 11 but target is 10 
                //when arr[left] + arr[right] > target
                //Because decreasing the right value brings the sum closer to the target.
            }
        }
    }
}

/*  Output
    $ java PairSum2_Sorted 
    Two Pointer Pairs (Sorting):
    2 + 8 = 10
    3 + 7 = 10
 */
```

### PairSum3_Hashing.java
``` java
import java.util.HashMap;

public class PairSum3_Hashing {
    public static void main(String[] args) {
        int[] arr = {5, 2, 7, 4, 3, 8};
        int target = 10;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int current = arr[i];
            int ntf = target - current; //ntf -> Number To Find

            if (map.containsKey(ntf)) {
                System.out.println("Pair: (" + ntf + ", " + current + ")" + " = " + target);
            }

            // Store current element in map (5, 0) -> (current, key)
            map.put(current, i);
            //System.out.println(map); //just print entire map

        }
    }
}

/*  Explaination: arr = {5, 2, 7, 4, 3, 8}
    First number is 5:
        ntf = 10 - 5 = 5
        Map is empty, so no pair yet.
        Add 5 to map.

    Second number is 2:
        ntf = 10 - 2 = 8
        Map has only 5, no 8, so no pair yet.
        Add 2 to map.

    Third number is 7:
        ntf = 10 - 7 = 3
        Map has 5, 2, no 3, no pair yet.
        Add 7 to map.

    Fourth number is 4:
        ntf = 10 - 4 = 6
        Map has 5, 2, 7, no 6, no pair.
        Add 4 to map.

    Fifth number is 3:
        ntf = 10 - 3 = 7
        Map has 7! So, print (7, 3).
        Add 3 to map.

    Sixth number is 8:
        ntf = 10 - 8 = 2
        Map has 2! So, print (2, 8).
        Add 8 to map.
 */

/*  Output:
    $ java PairSum3_Hashing 
    Pair: (7, 3) = 10
    Pair: (2, 8) = 10
 */
```

### LargestWaterContainer.java (Note : Between the Any Two walls | Note : Wall is negligible for calculation) //See Image
``` java
public class LargestWaterContainer {

    public static void main(String[] args) {
        int[] height = {1, 5, 7, 3, 2};

        int result = maxAreaBruteForce(height);
        System.out.println("Maximum water (Brute Force): " + result);

        int result2 = maxAreaTwoPointer(height);
        System.out.println("Maximum water (Two Pointer): " + result2);
    }

    // Brute Force Method (Try all pairs)
    public static int maxAreaBruteForce(int[] height) {
        int max = 0;
        for (int i = 0; i < height.length; i++) {
            for (int j = i + 1; j < height.length; j++) {
                int minHeight = Math.min(height[i], height[j]);
                int length = j - i;
                int currentWater = minHeight * length;
                max = Math.max(max, currentWater);
            }
        }
        return max;
    }

    // Optimized Two-Pointer Method
    public static int maxAreaTwoPointer(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxWater = 0;

        while (left < right) {
            int length = right - left;
            int minHeight = Math.min(height[left], height[right]);
            int currentWater = minHeight * length;

            // update max water
            maxWater = Math.max(maxWater, currentWater);

            // move the pointer pointing to smaller height
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxWater;
    }
}

/*  Output:
    $ java LargestWaterContainer 
    Maximum water (Brute Force): 6
    Maximum water (Two Pointer): 6
 */
```

### containerWithMostWater.java //HW Problem
```java
import java.util.Arrays;

class containerWithMostWater {
    public int maxArea(int[] height) {
        int l = 0;
        int r = height.length-1;
        int maxW = 0; //maxW -> Maximum Water
        while(l<r) {
            int area = Math.min(height[l], height[r]) * (r-l); // Area = Height * length
            maxW = Math.max(maxW, area);
            int minPointer = Math.min(height[l],height[r]);
            if(minPointer ==  height[l]) {
                l++;
            } else {
                r--;
            }
        }
        return maxW;
    }

    public static void main(String[] args) {
        containerWithMostWater objCWMW = new containerWithMostWater();

        int[] arr = {1,8,6,2,5,4,8,3,7};
        System.out.println(Arrays.toString(arr));
        System.out.println("Max : " + objCWMW.maxArea(arr));

        int[] arr2 = {1,1};
        System.out.println(Arrays.toString(arr2));
        System.out.println("Max : " + objCWMW.maxArea(arr2));
    }
}

/*  Output:
    $ java containerWithMostWater
    [1, 8, 6, 2, 5, 4, 8, 3, 7]
    Max : 49
    [1, 1]
    Max : 1
 */
```

### TrappingRainWater.java // Total Water in City
``` java
public class TrappingRainWater {
    public int trap(int[] height) {
        if (height == null || height.length == 0) return 0;

        int left = 0, right = height.length - 1;
        int leftMax = 0, rightMax = 0;
        int water = 0;

        while (left < right) {
            if (height[left] < height[right]) {
                if (height[left] >= leftMax) {
                    leftMax = height[left];
                } else {
                    water += leftMax - height[left];
                }
                left++;
            } else {
                if (height[right] >= rightMax) {
                    rightMax = height[right];
                } else {
                    water += rightMax - height[right];
                }
                right--;
            }
        }

        return water;
    }

    public static void main(String[] args) {
        TrappingRainWater sol = new TrappingRainWater();
        int[] height = {0, 1, 2, 0, 5, 3, 0, 4};
        System.out.println("Water trapped: " + sol.trap(height));
    }
}

/*  Output:
    $ java TrappingRainWater 
    Water trapped: 7
 */
```

### trappingRainWater.java //HW Problem 
``` java
public class trappingRainWater {

    // Prefix/Suffix Arrays (Lightly Optimized - O(N) Time, O(N) Space)
    public int trap(int[] height) {
        int[] left = new int[height.length];
        int[] right = new int[height.length];
        int max = -1;
        for(int i = 0; i < height.length; i++) {
           if(height[i] >= max ) {
              max = height[i]; 
           }
            left[i] = max;
        }
        
        max = -1;
        for(int i = height.length - 1;i>=0;i--) {
           if(height[i] >= max ) {
              max = height[i]; 
           }
            right[i] = max;
        }
        int total = 0;
        for(int i =0; i < height.length; i++) {
            total += Math.min(left[i],right[i]) - height[i];
        }
        return total;
    }

    // Two Pointers (Optimized - O(N) Time, O(1) Space)
    public int trapOptimized(int[] height) {
        if (height == null || height.length < 3) return 0; //Because trapping water requires at least three bars to form a container (left boundary, right boundary, and space in between)
        int left = 0;
        int right = height.length - 1;
        int leftMax = 0;
        int rightMax = 0;
        int totalWater = 0;

        while (left < right) {
            if (height[left] < height[right]) {
                if (height[left] >= leftMax) {
                    leftMax = height[left];
                } 
                else {
                    totalWater += leftMax - height[left];
                }
                left++;
            } 
            else {
                if (height[right] >= rightMax) {
                    rightMax = height[right];
                } 
                else {
                    totalWater += rightMax - height[right];
                }
                right--;
            }
        }

        return totalWater;
    }

    public static void main(String[] args) {
        trappingRainWater objTRW = new trappingRainWater();

        int[] array1 = {0,1,0,2,1,0,1,3,2,1,2,1}; // Expected: 6
        int[] array2 = {4,2,0,3,2,5};             // Expected: 9

        System.out.println("Using YT (Prefix/Suffix Arrays):");
        System.out.println("array 1 Output: " + objTRW.trap(array1));
        System.out.println("array 2 Output: " + objTRW.trap(array2));

        System.out.println("\nUsing Optimized Two-Pointer Approach:");
        System.out.println("array 1 Output: " + objTRW.trapOptimized(array1));
        System.out.println("array 2 Output: " + objTRW.trapOptimized(array2));
    }
}


/* Output:
$ java trappingRainWater 
    Using Extra Space Approach:
    array 1 Output: 6
    array 2 Output: 9

    Using Optimized Two-Pointer Approach:
    array 1 Output: 6
    array 2 Output: 9
 */
```

### findMaximumInArray.java
``` java
class findMaximumInArray {
    public static int largest(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) { 
            max = arr[i]; 
        }
        return max; 
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 8, 7, 56, 90};
        int[] arr2 = {5, 5, 5, 5};
        int[] arr3 = {10};

        System.out.println("Max Of arr1 = {1, 8, 7, 56, 90} = " + findMaximumInArray.largest(arr1));
        System.out.println("Max Of arr2 = {5, 5, 5, 5}; = " + findMaximumInArray.largest(arr2));
        System.out.println("Max Of arr3 = {10}; = " + findMaximumInArray.largest(arr3));
    }
}

/*  Output:
    $ java findMaximumInArray 
    Max Of arr1 = {1, 8, 7, 56, 90} = 90
    Max Of arr2 = {5, 5, 5, 5}; = 5
    Max Of arr3 = {10}; = 10
 */
```

### squareSum.java
``` java
/*  Description of Leetcode:
    Sum of Square Numbers
    Medium
    Given a non-negative integer c, decide whether there're two integers a and b such that a2 + b2 = c.

    Example 1:
    Input: c = 5
    Output: true
    Explanation: 1 * 1 + 2 * 2 = 5
    Example 2:

    Input: c = 3
    Output: false
    
    Constraints:
    0 <= c <= 231 - 1
 */

public class squareSum {
    public boolean judgeSquareSum(int c) {
        long left = 0;
        long right = (long)Math.sqrt(c);

        while (left <= right) {
            long sum = (left * left) + (right * right);

            if (sum == c) {
                return true;
            }
            else if (sum < c){
                left++;
            }
            else {
                right --;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int c1 = 5;
        int c2 = 3;
        squareSum sqrSumObj = new squareSum();

        System.out.println("c1 = 5 => " + sqrSumObj.judgeSquareSum(c1));
        System.out.println("c1 = 3 => " + sqrSumObj.judgeSquareSum(c2));
    }
}

/*  Output:
    $ java squareSum
    c1 = 5 => true
    c1 = 3 => false
 */
```

### findAllNumbersDisappearedInArray.java
``` java
import java.util.List;
import java.util.ArrayList;

class findAllNumbersDisappearedInArray {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int n = nums.length;

        for(int i = 0; i < n; i++) {
            int val = Math.abs(nums[i]) - 1; //abs->absolute value will returns the value's positive value
            if (nums[val] < 0) {
                continue;
            }
            nums[val] = -nums[val];
        }

        for(int i = 0; i < n; i++) {
            if (nums[i] > 0) {
                list.add(i + 1);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        findAllNumbersDisappearedInArray objFANDIA = new findAllNumbersDisappearedInArray();

        // Example 1
        int[] nums1 = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println("Example 1 Output: " + objFANDIA.findDisappearedNumbers(nums1)); // [5, 6]

        // Example 2
        int[] nums2 = {1, 1};
        System.out.println("Example 2 Output: " + objFANDIA.findDisappearedNumbers(nums2)); // [2]
    }
}

/*  Output:
    $ java findAllNumbersDisappearedInArray 
    Example 1 Output: [5, 6]
    Example 2 Output: [2]
 */
```

### intersectionOfTwoArrays.java
``` java
//import java.util.*;
import java.util.Arrays;

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int length1 = nums1.length;
        int length2 = nums2.length;

        int i = 0, j = 0, k = 0;

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        while (i < length1 && j < length2) {
            if (nums1[i] < nums2[j]) {
                i++;
            } 
            else if (nums1[i] > nums2[j]) {
                j++;
            } 
            else { // (nums1[i] == nums2[j])
                nums1[k] = nums1[i];
                k++;
                i++;
                j++;
            }
        }

        return Arrays.copyOfRange(nums1, 0, k); // In here Before k it stops
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        // Example 1
        int[] nums1a = {1, 2, 2, 1};
        int[] nums2a = {2, 2};
        int[] result1 = sol.intersect(nums1a, nums2a);
        System.out.println("Example 1:");
        System.out.println("Input: nums1 = [1,2,2,1], nums2 = [2,2]");
        System.out.println("Output: " + Arrays.toString(result1)); // Expected: [2, 2]

        System.out.println();

        // Example 2
        int[] nums1b = {4, 9, 5};
        int[] nums2b = {9, 4, 9, 8, 4};
        int[] result2 = sol.intersect(nums1b, nums2b);
        System.out.println("Example 2:");
        System.out.println("Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]");
        System.out.println("Output: " + Arrays.toString(result2)); // Expected: [4,9] or [9,4]
    }
}

/*  Output:
    $ java intersectionOfTwoArrays
    Example 1 Output: [2, 2]
    Example 2 Output: [9, 4]
 */
```

### findTheDifferenceOfTwoArrays.java
``` java
//import java.util.*;
import java.util.List;       // for List and List<List<Integer>>
import java.util.ArrayList;  // for new ArrayList<>()
import java.util.Set;        // for Set
import java.util.HashSet;    // for new HashSet<>()
import java.util.Arrays;     // for Arrays.asList()

class findTheDifferenceOfTwoArrays {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        // Store unique elements from both arrays
        for (int num : nums1) set1.add(num);
        for (int num : nums2) set2.add(num);

        // Find elements that exist in set1 but not in set2
        List<Integer> list1 = new ArrayList<>();
        for (int num : set1) {
            if (!set2.contains(num)) list1.add(num);
        }

        // Find elements that exist in set2 but not in set1
        List<Integer> list2 = new ArrayList<>();
        for (int num : set2) {
            if (!set1.contains(num)) list2.add(num);
        }

        return Arrays.asList(list1, list2);
    }

    public static void main(String[] args) {
        findTheDifferenceOfTwoArrays objFTDOTA = new findTheDifferenceOfTwoArrays();

        int[] nums1 = {1, 2, 3};
        int[] nums2 = {2, 4, 6};
        System.out.println(objFTDOTA.findDifference(nums1, nums2)); // [[1,3],[4,6]]

        int[] nums3 = {1, 2, 3, 3};
        int[] nums4 = {1, 1, 2, 2};
        System.out.println(objFTDOTA.findDifference(nums3, nums4)); // [[3],[]]
    }
}

/*  Output:
    $ java findTheDifferenceOfTwoArrays 
    [[1, 3], [4, 6]]
    [[3], []]
 */
```
### findAllDuplicatesInArray.java
``` java 
import java.util.*;

class findAllDuplicatesInArray {
    public List<Integer> findDuplicates(int[] nums) {
         List<Integer> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1; // Convert value to index

            if (nums[index] < 0) {
                // Already visited -> duplicate found
                result.add(Math.abs(nums[i]));
            } else {
                // Mark the number at this index as visited (negate it)
                nums[index] = -nums[index];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        findAllDuplicatesInArray solution = new findAllDuplicatesInArray();

        // Example 1
        int[] nums1 = {4, 3, 2, 7, 8, 2, 3, 1};
        List<Integer> output1 = solution.findDuplicates(Arrays.copyOf(nums1, nums1.length));
        System.out.println("Example 1:");
        System.out.println("Input:  " + Arrays.toString(nums1));
        System.out.println("Output: " + output1);
        System.out.println();

        // Example 2
        int[] nums2 = {1, 1, 2};
        List<Integer> output2 = solution.findDuplicates(Arrays.copyOf(nums2, nums2.length));
        System.out.println("Example 2:");
        System.out.println("Input:  " + Arrays.toString(nums2));
        System.out.println("Output: " + output2);
        System.out.println();

        // Example 3
        int[] nums3 = {1};
        List<Integer> output3 = solution.findDuplicates(Arrays.copyOf(nums3, nums3.length));
        System.out.println("Example 3:");
        System.out.println("Input:  " + Arrays.toString(nums3));
        System.out.println("Output: " + output3);
    }
}

/*  Output:
$ java findAllDuplicatesInArray 
    Example 1:
    Input:  [4, 3, 2, 7, 8, 2, 3, 1]
    Output: [2, 3]

    Example 2:
    Input:  [1, 1, 2]
    Output: [1]

    Example 3:
    Input:  [1]
    Output: []
 */
```

## Description Of V5 - Arrays Part 1
In this video, we kick off with Arrays-one of the most fundamental data structures in programming. Whether you're preparing for coding interviews or building a solid foundation in DSA, understanding arrays is a critical step.

**Chapters**

-   **0:00** - Introduction to Arrays and Key Techniques

-   **2:10** - Prerequisites for Understanding Lectures
    
-   **3:51** - Largest Number in an Array
    
-   **9:31** - Solving the Pair Sum Problem (Easy)
    
-   **15:39** - Brute Force Approach & Time Complexity Analysis
    
-   **23:31** - Writing Brute Force Pseudo Code
    
-   **28:41** - Observing Patterns and Optimizing Solutions
    
-   **34:12** - Final Optimization Strategy
    
-   **39:37** - Introduction to the Largest Water Container Problem (Medium)
    
-   **43:28** - Brute Force Solution for Largest Water Container
    
-   **46:06** - Key Observations for Optimization
    
-   **50:00** - Comparing Two Pointers vs. Hashmaps
    
-   **51:29** - Final Optimized Pseudo Code Solution
    
-   **55:50** - Rain Water Trapping Problem (Hard)
    
-   **58:01** - Brute Force Solution for Total Water in City
    
-   **Sync to video time** - Optimized Code and Homework Assignment
    
-   **1-29-23** - Conclusion
    

**LeetCode Questions Covered in the Video**

This video explores array fundamentals and introduces problem-solving techniques. Here are the problems discussed:

**Basic Array Operations**

**Maximum Element in an Array**

-   **Name:** Find Maximum in an Array
    
-   **Link:** [https://www.geeksforgeeks.org/problems/largest-element-in-array4009/0](https://www.geeksforgeeks.org/problems/largest-element-in-array4009/0 "https://www.geeksforgeeks.org/problems/largest-element-in-array4009/0")
    
-   **Objective:** Find the maximum element in an array.
    

**Sum of N Numbers**

-   **Name:** Sum of the First N Numbers
    
-   **Link:** [Sum of Square Numbers](https://leetcode.com/problems/sum-of-square-numbers/ "https://leetcode.com/problems/sum-of-square-numbers/")
    
-   **Objective:** Calculate the sum of the first N natural numbers.
    

**Intermediate Array Problems**

**Container With Most Water**

-   **Name:** Container With Most Water
    
-   **Link:** [Container With Most Water](https://leetcode.com/problems/container-with-most-water/ "https://leetcode.com/problems/container-with-most-water/")
    
-   **Objective:** Determine how much water can be contained between vertical lines of different heights.
    

**Advanced Array Challenges**

**Trapping Rain Water**

-   **Name:** Trapping Rain Water
    
-   **Link:** [Trapping Rain Water](https://leetcode.com/problems/trapping-rain-water/ "https://leetcode.com/problems/trapping-rain-water/")
    
-   **Objective:** Calculate how much water can be trapped on top of a histogram-like elevation map after it rains.
    


**Arrays Part 1: Homework Assignment**

This assignment is designed to help you practice and master array-related problems. Please solve the problems in the order provided and submit your solutions through LeetCode.

#### **Easy Questions**

1.  **Find All Numbers Disappeared in an Array**:  
    Link : [leetcode.com/problems/find-all-numbers-disappeared-in-an-array](http://leetcode.com/problems/find-all-numbers-disappeared-in-an-array "http://leetcode.com/problems/find-all-numbers-disappeared-in-an-array")  
    Objective: Find all numbers in the range `[1, n]` that do not appear in the array. The array has `n` elements with values from `1` to `n`.
    
2.  **Set Operations on Arrays :**  
    **Intersection of Two Arrays :**  
    Link : [leetcode.com/problems/intersection-of-two-arrays-ii](http://leetcode.com/problems/intersection-of-two-arrays-ii "http://leetcode.com/problems/intersection-of-two-arrays-ii")  
    Objective: Find the intersection of two arrays, but include duplicate elements as many times as they appear in both arrays
    
    **Find the Difference of Two Arrays :**  
    Link : [https://leetcode.com/problems/find-the-difference-of-two-arrays/](https://leetcode.com/problems/find-the-difference-of-two-arrays/ "https://leetcode.com/problems/find-the-difference-of-two-arrays/")  
    Objective: The goal is to compare two arrays and determine the unique elements in each array that are not present in the other.
    


#### **Medium Questions**

1. **Find All Duplicates in an Array:**
Link : [https://leetcode.com/problems/find-all-duplicates-in-an-array]
Objective: Find all elements that appear twice in an array of integers where each integer is in the range [1, n] and the array contains n elements.

2.  [https://www.interviewbit.com/problems/closest-pair-from-sorted-arrays/](https://www.interviewbit.com/problems/closest-pair-from-sorted-arrays/ "https://www.interviewbit.com/problems/closest-pair-from-sorted-arrays/")
    


#### **Hard Question**  
[https://www.interviewbit.com/courses/programming/two-pointers/](https://www.interviewbit.com/courses/programming/two-pointers/ "https://www.interviewbit.com/courses/programming/two-pointers/")

in the above link , you can try all google and amazon questions to master hard 2pointer problems.



### Instructions:

1.  Make sure to thoroughly read the problem descriptions and constraints.
    
2.  Write efficient and clean code to solve each problem.
    
3.  Submit your solutions on LeetCode and take note of your submission results (runtime, memory usage, etc.).
    
4.  Be prepared to discuss your approach and solution during the next session.



___
---
***
