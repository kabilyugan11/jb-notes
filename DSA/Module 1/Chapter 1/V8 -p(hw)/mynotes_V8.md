# Video 8 - Arrays Part 2

## My_Notes:
```
* Array is only limited
* Dynamic Arrays: (Arrary List)
    It is not limited 
        1.Initial Capacity, Load Factor
        2.Once threshold reached, Creates an 2X size array and Copy
            Array size 100, if it reaches 50 or 100 then it creates size 200 and copy

        Avg time complexity of list Dynamic array insertion is approx O(N)

* About Pre-Processing -> One Type of Pattern in Array
    SubarraySum_Bruteforce.java -> BruteForce
    PrefixSum_PreProcess.java -> PreProcess by PrefixSum

* 2D Prefix Sum - See images (i am not write code)
```

## Images:
``` Images Folder - Available ```
![Image of V8](Images/(V8)%201.png)
![Image of V8](Images/(V8)%202.png)
![Image of V8](Images/(V8)%203.png)
![Image of V8](Images/(V8)%204.png)
![Image of V8](Images/(V8)%205.png)
![Image of V8](Images/(V8)%206.png)
![Image of V8](Images/(V8)%207.png)
![Image of V8](Images/(V8)%208.png)

## Code:
### SubarraySum_Bruteforce.java
``` java
public class SubarraySum_Bruteforce {
    public static void main(String[] args) {
        int[] arr = {3, 5, 1, 1, 7, 8};  // Input array
        int start = 1;  // Starting index
        int end = 5;  // Ending index

        int ans = 0;

        // Array Printing
        System.out.print("Array = ");
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.print("\n");

        // Loop from index i to j and add values
        for (int i = start; i <= end; i++) {
            ans += arr[i];
        }
        System.out.println("Sum from index " + start + " to " + end + " is: " + ans);
    }
}

/*  Output:
    $ java SubarraySumSubarraySum_Bruteforce
    Array = 3 5 1 1 7 8 
    Sum from index 1 to 5 is: 22
 */
```

### PrefixSum_PreProcess.java
``` java
public class PrefixSum_PreProcess {
    public static void main(String[] args) {
        int[] arr = {3, 5, 1, 7, 8};

        // Build prefix sum array
        int[] prefixSum = new int[arr.length];
        prefixSum[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }

        System.out.println("Array: " + java.util.Arrays.toString(arr));
        System.out.println("Prefix sum: " + java.util.Arrays.toString(prefixSum));  // Print prefix sum

        // Query sum from i=1 to j=3
        int i = 1, j = 3;
        int sum = prefixSum[j] - prefixSum[i - 1]; //16-3=13
        System.out.println("Sum from index " + i + " to " + j + " = " + sum);
    }
}

/*  Output:
    $ java PrefixSum_PreProcess
    Array: [3, 5, 1, 7, 8]
    Prefix sum: [3, 8, 9, 16, 24]
    Sum from index 1 to 3 = 13
 */
```

## Description Of V8 - Arrays Part 2



___
---
***
