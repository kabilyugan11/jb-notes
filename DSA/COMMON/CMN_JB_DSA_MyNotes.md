# Video 1 - DSA Intro Lecture

## My_Notes:
```
* About Data Structures:
    - Organizing the data effeicinetly and Doing the execution of Program in Main Memeory (Temporary Memeory OR RAM) 
    - Main Memory has Program File and Data File

* Database:
    - Large amount of data stored in Permanent Storage
    - In table wise and Relationally Stored

* Database Warehouse:
    - Google generate millions of data everyday and that grows
    - It stores array of Multiple DBs
    - Leagcy Data (History of data) and Operational data

* Big Data:
    - It mines data from millions of data
    - Big data refers to extremely large and complex datasets that require advanced tools and techniques to store, process, and analyze for insights.

* DS Topics:
    Array, Matrics, Linked lists -> Physical DS (Determine how to store in physically in memeory) 

    Stack, Queue, Trees, Graphs, Hasing -> Logical DS (Apply logics on Top of physical)

    Recursion:
        Using it in small only in Coding/Programming
        Its used in Problem Solving
        It's a Mathematicl approch to solve problem
        In Interview -> Its Shows you a Unique for Your Problem Solving 

    Sorting:
         Arranging data in a specific order
```

## Images:
``` Images Folder - Available ```
![Image V1](Images/(V1)%201.png)
![Image V1](Images/(V1)%202.png)
![Image V1](Images/(V1)%203.png)
![Image V1](Images/(V1)%204.png)

## Code:
``` No Code Folder ```



___
---
***



# Video 2 - Static Vs Dynamic Memory - 1

## My_Notes:
```
* DSA - Data Stored Efficiently during the Execution of a Program in Main Memory

* Main memory Structure:
    Logical Representaion
        1 Register = 1 Byte
        Starts from 0 to 65535 | 65536 Bytes = 64 * 1024 Bytes | 1024 Bytes is 1KB ,So 64 * 1KB = 64KB 
        1 Segment = 64 KB
        Ram has 6GB Memory but Not fully to Use and Splits Into Multiple Segments for Use

* About Static Memory:
    Refer Images

    Main Memory
        Heap
        Stack --> Stack Frame (SF) or Activation Record (SF1) (Main variables load) -> (SF2) f1 (f1 variables load) -> (SF3) f2 (f2 variables load)
        Code Section

    Stack means Last in First Out

    It is based on Complier Time 
    So its called as Compiler Time Memory or Static Memory or Stack Memory
```

## Images:
``` Images Folder - Available ```
![Image V2](Images/(V2)%201.png)
![Image V2](Images/(V2)%202.png)
![Image V2](Images/(V2)%203.png)

## Code:
``` No Code Folder ```



___
---
***



# Video 2 - Static Vs Dynamic Memory - 1

## My_Notes:
```
* DSA - Data Stored Efficiently during the Execution of a Program in Main Memory

* Main memory Structure:
    Logical Representaion
        1 Register = 1 Byte
        Starts from 0 to 65535 | 65536 Bytes = 64 * 1024 Bytes | 1024 Bytes is 1KB ,So 64 * 1KB = 64KB 
        1 Segment = 64 KB
        Ram has 6GB Memory but Not fully to Use and Splits Into Multiple Segments for Use

* About Static Memory:
    Refer Images

    Main Memory
        Heap
        Stack --> Stack Frame (SF) or Activation Record (SF1) (Main variables load) -> (SF2) f1 (f1 variables load) -> (SF3) f2 (f2 variables load)
        Code Section

    Stack means Last in First Out

    It is based on Complier Time 
    So its called as Compiler Time Memory or Static Memory or Stack Memory
```

## Images:
``` Images Folder - Available ```
![Image V2](Images/(V2)%201.png)
![Image V2](Images/(V2)%202.png)
![Image V2](Images/(V2)%203.png)

## Code:
``` No Code Folder ```



___
---
***



# Video 3 - Static Vs Dynamic Memory - 2

## My_Notes:
```
* Heap Memory - Developers Given Resourse is Heap Memory | If need Memory take from Heap Memory

* Dynamic Memory - It Gets Memory when Program is in Running State
    In Pointer in C, *P has 2 bytes |2bytes are Fixed ans Static and size is based on complier
    Pointer store Only Address
    16 bit complier's *P Pointer size = 2 Bytes
    32 bit complier's *P Pointer size = 4 Bytes
    64 bit complier's *P Pointer size = 8 Bytes

    Refer Image

    malloc - Mememory Allocation
    free(p) - Deallocates Mememory of Pointer P
```

## Images:
``` Images Folder - Available ```
![Image of V3](Images/(V3)%201.png)
![Image of V3](Images/(V3)%202.png)

## Code:
``` No Code Folder ```



___
---
***



# Video 4 - Master DSA & Coding Fundamentals

## My_Notes:
```
* About Pointers:
    Value -> It has Variable and Address | 10 -> Int L and Address(&L)

    int *P; // *P - Stores Address only
    int L = 10;
    P = &L; // &L - Return address of L = P

    print (L); // = 10
    print (&L); // = 51 (address of L)
    print (&P); // = 40 (address Of P)
    print (P); // = 51 (address of L)
    print (*P); // = 10 (Value of L)

* Why Pointer?
    - Heap Access
    - Using Single Pointer Variable to easyly access next next elements
    - Parameter Passing

    Pass By Value - Passing Value
    Pass By Reference - Passing Address

    Swap (a,b) by Pass By Reference -> swap_by_PassByReference.c 

* Array - Store only Same datatype
    //Charcter
    char c = 'a';   

    //Array
    char c[10] = "01Hello789"  //'0' and '1' look like numbers, they're stored as characters, like '1' = 49 in ASCII

* Structure - Creating an Our Own Datatypes
    //Example
        Struct Rectangle {
            float l;
            float b;
        }

        int main() {
            Struct Rectangle r1,r2; // Here Initialize Rectangle l and b
            r1.l = 10.0;
            r1.b = 21.6;
        }

        // Or 
            r1 = {10.0, 21.6};
        
    Card Example -> Refer Images

* By Static:
    // In Stack Memeory
    struct Rectangle {
            float l;
            float b;
        };

        int main() {
            struct Rectangle r = {10, 5}; // Here Initialize Rectangle l and b
            struct Rectangle *P;
            P = &r;
            (*P).l=20; //here *P.l = 20 gets error because .(dot) operator gets preference first
            P->l = 15;
        }

* By Dynamic:
    - malloc -> Allocate Memory and Give 

    // In Dynamic Memeory
    struct Rectangle {
            float l;
            float b;
        };

        int main() {
            struct Rectangle *P;
            P = (struct Rectangle *)malloc(sizeof(struct Rectangle)); // Typescast of Return Void * of Allocated Heap Memeory
            P -> l = 10;
            P -> b = 20;
        }

        - malloc(sizeof(struct Rectangle)); --> It returns void * (void pointer - It is genral pointer and It is easy for type cast to int or struct *) 
        - Type cast By P = (struct Rectangle *)malloc(sizeof(struct Rectangle));

* About Function:
    Array Pointer in Function - Pointer_in_function.c & Pointer_Heap_inFunction.c

    In C, SetRArray = (struct Rect r) -> in here it creates copy of struct Rect r
          SetRArray = (int *arr) -> it sends First address and Not copy or duplicatesstruct Rect r


```

## Images:
``` Images Folder - Available ```
![Image of V4](Images/(V4)%201.png)
![Image of V4](Images/(V4)%202.png)
![Image of V4](Images/(V4)%203.png)
![Image of V4](Images/(V4)%204.png)
![Image of V4](Images/(V4)%205.png)
![Image of V4](Images/(V4)%206.png)
![Image of V4](Images/(V4)%207.png)
![Image of V4](Images/(V4)%208.png)
![Image of V4](Images/(V4)%209.png)
![Image of V4](Images/(V4)%2010.png)
![Image of V4](Images/(V4)%2011.png)
![Image of V4](Images/(V4)%2012.png)
![Image of V4](Images/(V4)%2013.png)
![Image of V4](Images/(V4)%2014.png)
![Image of V4](Images/(V4)%2015.png)
![Image of V4](Images/(V4)%2016.png)
![Image of V4](Images/(V4)%2017.png)
![Image of V4](Images/(V4)%2018.png)
![Image of V4](Images/(V4)%2019.png)
![Image of V4](Images/(V4)%2020.png)
![Image of V4](Images/(V4)%2021.png)
![Image of V4](Images/(V4)%2022.png)
![Image of V4](Images/(V4)%2023.png)

## Code:
### Pointer.c
``` C
#include <stdio.h>

int main() {
    int *P;       // P is a pointer to int
    int L = 10;   // L is an int variable with value 10

    P = &L;       // P now stores the address of L

    // Now let’s print the values
    printf("%d\n", L);      // Prints 10 — the value of L
    printf("%p\n", (void *)&L);  // Prints address of L
    printf("%p\n", (void *)&P);  // Prints address of pointer P
    printf("%p\n", (void *)P);   // Prints what P holds: address of L
    printf("%d\n", *P);     // Prints 10 — value at the address stored in P (i.e., L)
    
    return 0;
}

/*  Output:
    10
    0x7ffcc6b6b514
    0x7ffcc6b6b518
    0x7ffcc6b6b514
    10
*/

/*
    int *P; // *P - Stores Address only
    int L = 10;
    P = &L; // &L - Return address of L = P

    print (L); // = 10
    print (&L); // = 51 (address of L)
    print (&P); // = 40 (address Of P)
    print (P); // = 51 (address of L)
    print (*P); // = 10 (Value of L)
*/
```

### swap_by_PassByReference.c 
``` C
#include <stdio.h>

void swap(int *L, int *P) { // it recives address of x and y & it stores address in L and P
    int temp;
    temp = *L;  // *L is Value stored in L, L has address of x So x's Value 
    *L = *P;
    *P = temp;
}

void main() {
    int x = 40;
    int y = 51;

    printf("x = %d \n",x);
    printf("y = %d \n",y);

    swap(&x,&y); // it send address of x and y

    printf("After Swap \n");
    printf("x = %d \n",x);
    printf("y = %d",y);
}

/* Output:
    $ ./swap_by_PassByReference 
    x = 40 
    y = 51 
    After Swap 
    x = 51 
    y = 40
*/
```

### Struct_Static.c
```c
// Using Pointers in Structures
// In Stack Memeory

#include <stdio.h>
struct Rectangle {
    int l;
    int b;
};

int main() {
    struct Rectangle r = {10, 5}; // Here Initialize Rectangle l and b
    printf("r = %d, %d \n",r.l, r.b);
    struct Rectangle *P;
    P = &r;
    (*P).l=20; //here *P.l = 20 gets error because .(dot) operator gets preference first
    printf("(*P).l = 20 ==> %d,%d \n",r.l,r.b);
    P->l = 15;
    printf("P->l = 15 ==> %d, %d \n",r.l,r.b);

     return 0;
}

/*  Output:
    $ ./Struct_Static
    r = 10, 5 
    (*P).l = 20 ==> 20,5 
    P->l = 15 ==> 15, 5 
*/
```

### Struct_Dynamic.c
``` c
// Using Pointers in Structures
// In Dynamic Memeory

#include <stdio.h>
#include <stdlib.h> //required for malloc
struct Rectangle {
    int l;
    int b;
};

int main() {
    struct Rectangle *P;
    P = (struct Rectangle *)malloc(sizeof(struct Rectangle)); // Typescast of Return Void * of Allocated Heap Memeory
    printf("l & b : %d, %d \n",P -> l, P -> b);
    P -> l = 10;
    P -> b = 20;
    printf("l & b : %d, %d \n",(*P).l, (*P).b);

    free(P);    // Free the dynamically allocated memory

    return 0;
}

/*  Output:
     $ ./Struct_Dynamic 
    l & b : 0, 0 
    l & b : 10, 20  
*/
```

### Pointer_in_function.c
``` C
#include <stdio.h>

// Function to calculate the sum of an array using pointers
int getSum(int *arr, int size) { // or int getSum(int[] arr, int size) {
    int sum = 0;

    for (int i = 0; i < size; i++) {
        int arrElement = *arr;  // Get the value at the current pointer
        sum = sum + arrElement; // Add it to the sum
        arr++;                  // Move the pointer to the next element
    }

    return sum;
}

int main() {
    // Example array
    int numbers[] = {1, 2, 3, 4, 5};
    int size = sizeof(numbers) / sizeof(numbers[0]); //Size of total elements (20 bytes) / Size of one element (4 bytes) = 5

    // Call the getSum function
    int result = getSum(numbers, size);

    // Print the result
    printf("Sum: %d\n", result);

    return 0;
}

/*  Output:
    $ ./Pointer_in_function 
    Sum: 15
*/
```

### Pointer_Heap_inFunction.c
``` c
// Allocated memory in heap then heap memory --> stack P 

#include <stdio.h>
#include <stdlib.h>

int* getArray(int size) {
    int* p = (int*) malloc(size * sizeof(int));
    int* temp = p;

    for (int i = 0; i < size; i++) {
        scanf("%d", temp);
        temp++;
    }

    return p;
}

int getSum(int *arr, int size) {
    int sum = 0;

    for (int i = 0; i < size; i++) {
        int arrElement = *arr;
        sum = sum + arrElement;
        arr++;
    }

    return sum;
}

int main() {
    int size;
    printf("Enter size: ");
    scanf("%d", &size);
    printf("Enter %d Integers by Space seprated : ",size);

    int* p = getArray(size);
    printf("p = %d\n", p);
    printf("*p = %d\n", *p);
    printf("&p = %d\n", &p);

    int sum = getSum(p, size);
    printf("Sum = %d\n", sum);

    free(p);
    return 0;
}

/*  Output:
$ ./Pointer_Heap_inFunction 
    Enter size: 4
    Enter 4 Integers by Space seprated : 10 10 10 10
    p = -490112320
    *p = 10
    &p = -1854870944
    Sum = 40
*/
```


___
---
***



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
        //int max = 0;  //it cannot find Negative numbers for findMax
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

        System.out.println("Number of Elements : ");
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
    Number of Elements : 
    5
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

            // Store current element in map (5, 0)
            map.put(current, i);
            //System.out.println(map); //just print entire map

        }
    }
}

/*  Explaination:
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

### LargestWaterContainer.java
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
                int width = j - i;
                int currentWater = minHeight * width;
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
            int width = right - left;
            int minHeight = Math.min(height[left], height[right]);
            int currentWater = minHeight * width;

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

### TrappingRainWater.java
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

### containerWithMostWater.java
```java
import java.util.Arrays;

class containerWithMostWater {
    public int maxArea(int[] height) {
        int l = 0;
        int r = height.length-1;
        int maxW = 0; //maxW -> Maximum Water
        while(l<r) {
            int area = Math.min(height[l], height[r]) * (r-l); // Area = Height * Width
            maxW = Math.max(maxW, area);
            if(height[l]<height[r]) {
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

### trappingRainWater.java
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



.