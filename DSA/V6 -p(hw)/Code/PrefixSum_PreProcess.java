public class PrefixSum_PreProcess {
    public static void main(String[] args) {
        int[] arr = {3, 5, 1, 7, 8};

        // Build prefix sum array
        int[] prefixSum = new int[arr.length];
        prefixSum[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }

        System.out.println("Array: " + java.util.Arrays.toString(arr));
        System.out.println("Prefix sum: " + java.util.Arrays.toString(prefixSum));  // Print prefix sum

        // Query sum from i=1 to j=3
        int i = 1, j = 3;
        int sum = prefixSum[j] - prefixSum[i - 1]; //16-3=13
        System.out.println("Sum from index " + i + " to " + j + " = " + sum);
    }
}

/*  Output:
    $ java PrefixSum_PreProcess
    Array: [3, 5, 1, 7, 8]
    Prefix sum: [3, 8, 9, 16, 24]
    Sum from index 1 to 3 = 13
 */