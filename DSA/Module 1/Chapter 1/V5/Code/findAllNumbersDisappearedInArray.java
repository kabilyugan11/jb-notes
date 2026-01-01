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