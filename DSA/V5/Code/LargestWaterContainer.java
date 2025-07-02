public class LargestWaterContainer {

    public static void main(String[] args) {
        int[] height = {1, 5, 7, 3, 2};

        int result = maxAreaBruteForce(height);
        System.out.println("Maximum water (Brute Force): " + result);

        int result2 = maxAreaTwoPointer(height);
        System.out.println("Maximum water (Two Pointer): " + result2);
    }

    // Brute Force Method (Try all pairs)
    public static int maxAreaBruteForce(int[] height) {
        int max = 0;
        for (int i = 0; i < height.length; i++) {
            for (int j = i + 1; j < height.length; j++) {
                int minHeight = Math.min(height[i], height[j]);
                int width = j - i;
                int currentWater = minHeight * width;
                max = Math.max(max, currentWater);
            }
        }
        return max;
    }

    // Optimized Two-Pointer Method
    public static int maxAreaTwoPointer(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxWater = 0;

        while (left < right) {
            int width = right - left;
            int minHeight = Math.min(height[left], height[right]);
            int currentWater = minHeight * width;

            // update max water
            maxWater = Math.max(maxWater, currentWater);

            // move the pointer pointing to smaller height
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxWater;
    }
}

/*  Output:
    $ java LargestWaterContainer 
    Maximum water (Brute Force): 6
    Maximum water (Two Pointer): 6
 */