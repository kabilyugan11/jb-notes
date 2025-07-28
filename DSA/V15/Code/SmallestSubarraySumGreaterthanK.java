// Find the Length of the Smallest Subarray With Sum >= K (Sliding Window)
public class SmallestSubarraySumGreaterthanK {
    public static int minSubArrayLen(int k, int[] nums) {
        int ws = 0;
        int we = 0;
        int wSum = 0;
        int minLen = Integer.MAX_VALUE;

        while (we < nums.length) {
            wSum = wSum + nums[we]; // alternative to wSum += nums[we]

            // Shrink window while sum is >= k
            while (wSum >= k) {
                minLen = Math.min(minLen, we - ws + 1);
                wSum = wSum - nums[ws];
                ws++;
            }

            we++;
        }

        if (minLen == Integer.MAX_VALUE) {
            return 0;
        } else {
            return minLen;
        }
    }

    public static void main(String[] args) {
        int[] input = {3, 3, 4, 1, 2, 4, 1, 2, 5}; // updated input
        int k = 7;
        int result = minSubArrayLen(k, input);
        System.out.println("Smallest subarray length with sum >= " + k + " is: " + result);
    }
}


/*  Output:
    $ java SmallestSubarraySumGreaterthanK
    Smallest subarray length with sum >= 7 is: 2
 */