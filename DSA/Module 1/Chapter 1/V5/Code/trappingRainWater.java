public class trappingRainWater {

    // Prefix/Suffix Arrays (Lightly Optimized - O(N) Time, O(N) Space)
    public int trap(int[] height) {
        int[] left = new int[height.length];
        int[] right = new int[height.length];
        int max = -1;
        for(int i = 0; i < height.length; i++) {
           if(height[i] >= max ) {
              max = height[i]; 
           }
            left[i] = max;
        }
        
        max = -1;
        for(int i = height.length - 1;i>=0;i--) {
           if(height[i] >= max ) {
              max = height[i]; 
           }
            right[i] = max;
        }
        int total = 0;
        for(int i =0; i < height.length; i++) {
            total += Math.min(left[i],right[i]) - height[i];
        }
        return total;
    }

    // Two Pointers (Optimized - O(N) Time, O(1) Space)
    public int trapOptimized(int[] height) {
        if (height == null || height.length < 3) return 0; //Because trapping water requires at least three bars to form a container (left boundary, right boundary, and space in between)
        int left = 0;
        int right = height.length - 1;
        int leftMax = 0;
        int rightMax = 0;
        int totalWater = 0;

        while (left < right) {
            if (height[left] < height[right]) {
                if (height[left] >= leftMax) {
                    leftMax = height[left];
                } 
                else {
                    totalWater += leftMax - height[left];
                }
                left++;
            } 
            else {
                if (height[right] >= rightMax) {
                    rightMax = height[right];
                } 
                else {
                    totalWater += rightMax - height[right];
                }
                right--;
            }
        }

        return totalWater;
    }

    public static void main(String[] args) {
        trappingRainWater objTRW = new trappingRainWater();

        int[] array1 = {0,1,0,2,1,0,1,3,2,1,2,1}; // Expected: 6
        int[] array2 = {4,2,0,3,2,5};             // Expected: 9

        System.out.println("Using YT (Prefix/Suffix Arrays):");
        System.out.println("array 1 Output: " + objTRW.trap(array1));
        System.out.println("array 2 Output: " + objTRW.trap(array2));

        System.out.println("\nUsing Optimized Two-Pointer Approach:");
        System.out.println("array 1 Output: " + objTRW.trapOptimized(array1));
        System.out.println("array 2 Output: " + objTRW.trapOptimized(array2));
    }
}


/* Output:
$ java trappingRainWater 
    Using Extra Space Approach:
    array 1 Output: 6
    array 2 Output: 9

    Using Optimized Two-Pointer Approach:
    array 1 Output: 6
    array 2 Output: 9
 */