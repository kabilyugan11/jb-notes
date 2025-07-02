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