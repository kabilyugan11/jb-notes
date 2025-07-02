public class TrappingRainWater {
    public int trap(int[] height) {
        if (height == null || height.length == 0) return 0;

        int left = 0, right = height.length - 1;
        int leftMax = 0, rightMax = 0;
        int water = 0;

        while (left < right) {
            if (height[left] < height[right]) {
                if (height[left] >= leftMax) {
                    leftMax = height[left];
                } else {
                    water += leftMax - height[left];
                }
                left++;
            } else {
                if (height[right] >= rightMax) {
                    rightMax = height[right];
                } else {
                    water += rightMax - height[right];
                }
                right--;
            }
        }

        return water;
    }

    public static void main(String[] args) {
        TrappingRainWater sol = new TrappingRainWater();
        int[] height = {0, 1, 2, 0, 5, 3, 0, 4};
        System.out.println("Water trapped: " + sol.trap(height));
    }
}

/*  Output:
    $ java TrappingRainWater 
    Water trapped: 7
 */