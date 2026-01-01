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