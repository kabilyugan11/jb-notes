public class MaxSumSubarray_SlidingWindow {

    public static int findMaxSumSubArray(int[] inp, int k) {
        int windowSum = 0, maxWindowSum = 0;
        int wStart = 0;

        for (int wEnd = 0; wEnd < inp.length; wEnd++) {
            windowSum = windowSum + inp[wEnd];

            // Check if window has reached size k
            if (wEnd - wStart + 1 == k) {
                maxWindowSum = Math.max(maxWindowSum, windowSum);
                windowSum = windowSum - inp[wStart];
                wStart++;
            }
        }

        return maxWindowSum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 9, 5, 2, 1};
        int k = 3;
        int result = findMaxSumSubArray(arr, k);
        System.out.println("Maximum sum of subarray of size " + k + " is: " + result);
    }
}

/*  Output:
    $ java MaxSumSubarray_SlidingWindow 
    Maximum sum of subarray of size 3 is: 18
 */