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