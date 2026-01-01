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