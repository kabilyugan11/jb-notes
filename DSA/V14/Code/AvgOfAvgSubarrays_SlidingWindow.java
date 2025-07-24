public class AvgOfAvgSubarrays_SlidingWindow {
    public static double findAverageOfAverages(int[] arr, int k) {
        if (k > arr.length) return 0;

        double windowSum = 0;
        int wStart = 0;
        double totalAvgSum = 0;
        int count = 0;

        for (int wEnd = 0; wEnd < arr.length; wEnd++) {
            windowSum += arr[wEnd];

            if ((wEnd - wStart + 1) == k) {
                double windowAvg = windowSum / k;
                totalAvgSum += windowAvg;
                windowSum -= arr[wStart];
                wStart++;
                count++;
            }
        }

        return totalAvgSum / count;
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 8, 5, 2, 1};
        int k = 3;
        double result = findAverageOfAverages(arr, k);
        System.out.printf("Average of averages of subarrays of size %d is: %.4f\n", k, result);
    }
}

/*  Outpu:
    $ java AvgOfAvgSubarrays_SlidingWindow 
    Average of averages of subarrays of size 3 is: 4.4167
 */