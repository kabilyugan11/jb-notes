# Video 6 - Time Complexity Analysis Part I

## My_Notes:
```
* About Time and Space Complexity

* We have Array [1,2,3,4,5,6,7,8,9,10] and Find target Element in array
    About Worst Case:
        Target = 10, we find the input value at End
        O(n) - BigO(n)

    About Best Case:
        Target = 1, we find the input value at Fist
        Ω(n) - Omega(n)

    About Average Case:
        Worst Case + Best case / 2 = Average Case
        Target = 6, we find the input value at Middle
        θ(n) - Theta(n)

* About Recursion
    Recursion is a programming technique where a method calls itself to solve a problem.
        Ex:
        public class SumExample {
            public static int sum(int n) {
                if (n == 1) {            // base case
                    return 1;
                }
                return n + sum(n - 1);   // recursive call
            }
            public static void main(String[] args) {
                System.out.println(sum(5));  // Output: 15
            }
        }
            Explanation:
            sum(5)
            = 5 + sum(4)
            = 5 + (4 + sum(3))
            = 5 + (4 + (3 + sum(2)))
            = 5 + (4 + (3 + (2 + sum(1))))
            = 5 + (4 + (3 + (2 + 1)))       ← base case returns 1
            = 5 + 4 + 3 + 2 + 1
            = 15

* find F(n)
    f(N) = 3N + 3 ---> O(n) -> how means, drop 3 and +3 it becomes N
        int sum = 0;          // 1 operation
        int i;                // 1 operation
        for (i = 0; i < N; i++) {   // runs N times
            sum += i;
        }
        for (i = 0; i < N; i++) {   // runs N times
            sum += i;
        }
        for (i = 0; i < N; i++) {   // runs N times
            sum += i;
        }
        return sum;           // 1 operation

* See Images
```

## Images:
``` Images Folder - Available ```
![Image of V6](Images/(V6)%201.png)
![Image of V6](Images/(V6)%202.png)
![Image of V6](Images/(V6)%203.png)
![Image of V6](Images/(V6)%204.png)
![Image of V6](Images/(V6)%205.png)
![Image of V6](Images/(V6)%206.png)
![Image of V6](Images/(V6)%207.png)
![Image of V6](Images/(V6)%208.png)
![Image of V6](Images/(V6)%209.png)
![Image of V6](Images/(V6)%2010.png)
![Image of V6](Images/(V6)%2011.png)
![Image of V6](Images/(V6)%2012.png)
![Image of V6](Images/(V6)%2013.png)
![Image of V6](Images/(V6)%2014.png)
![Image of V6](Images/(V6)%2015.png)
![Image of V6](Images/(V6)%2016.png)
![Image of V6](Images/(V6)%2017.png)
![Image of V6](Images/(V6)%2018.png)
![Image of V6](Images/(V6)%2019.png)
![Image of V6](Images/(V6)%2020.png)
![Image of V6](Images/(V6)%2021.png)
![Image of V6](Images/(V6)%2022.png)
![Image of V6](Images/(V6)%2023.png)
![Image of V6](Images/(V6)%2024.png)
![Image of V6](Images/(V6)%2025.png)
![Image of V6](Images/(V6)%2026.png)
![Image of V6](Images/(V6)%2027.png)

## Code:
``` No Code Folder ```

## Description Of V6 - Time Complexity Analysis Part I:
**Comprehensive Breakdown of a Technical Presentation: From Instructions to Advanced Mathematical Concepts**

**Cheat sheet -** [https://www.bigocheatsheet.com/?fbclid=PAY2xjawHNMcBleHRuA2FlbQIxMAABpuDzL5VuLANCTGkG3yLQvymPj589mHo8VZGwENA2YAHYgxv2LH9IvTXn5g\_aem\_j9BUXzTQy-9dNU9-UdKzwg](https://www.bigocheatsheet.com/?fbclid=PAY2xjawHNMcBleHRuA2FlbQIxMAABpuDzL5VuLANCTGkG3yLQvymPj589mHo8VZGwENA2YAHYgxv2LH9IvTXn5g_aem_j9BUXzTQy-9dNU9-UdKzwg "https://www.bigocheatsheet.com/?fbclid=PAY2xjawHNMcBleHRuA2FlbQIxMAABpuDzL5VuLANCTGkG3yLQvymPj589mHo8VZGwENA2YAHYgxv2LH9IvTXn5g_aem_j9BUXzTQy-9dNU9-UdKzwg")

Chapters

00:00 - Introduction to Time Complexity

01:38 - Importance of Time Complexity (Relevant in 90% of scenarios)

03:28 - Growth of Functions and Complexity Analysis

05:00 - How to Measure Time Complexity

06:41 - Finding f(n) of an Algorithm is a Real Skill

17:40 - Worst Case vs. Best Case vs. Average Case

20:31 - Why We Primarily Focus on Worst Case (With Examples)

23:22 - How to Compute Time Complexity?

35:45 - Breaking Point and Variable Rate of Growth

36:49 - Time Complexity Approaches for Iterative and Recursive Algorithms

37:36 - Coding Fundamentals and Time Complexity Questions (MCQs)

38:21 - How to Compare Large and Small Functions

44:49 - Overview of Time Complexity

47:40 - Mind Map

Home works :

Make sure you have understood logs and realising why O(10n) and O(n) are considered same complexity.

Make sure you have did time complexity analysis in all the problems we have worked so far.



___
---
***
