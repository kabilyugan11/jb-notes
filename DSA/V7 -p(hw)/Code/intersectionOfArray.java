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