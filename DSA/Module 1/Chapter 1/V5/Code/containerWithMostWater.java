import java.util.Arrays;

class containerWithMostWater {
    public int maxArea(int[] height) {
        int l = 0;
        int r = height.length-1;
        int maxW = 0; //maxW -> Maximum Water
        while(l<r) {
            int area = Math.min(height[l], height[r]) * (r-l); // Area = Height * Width
            maxW = Math.max(maxW, area);
            if(height[l]<height[r]) {
                l++;
            } else {
                r--;
            }
        }
        return maxW;
    }

    public static void main(String[] args) {
        containerWithMostWater objCWMW = new containerWithMostWater();

        int[] arr = {1,8,6,2,5,4,8,3,7};
        System.out.println(Arrays.toString(arr));
        System.out.println("Max : " + objCWMW.maxArea(arr));

        int[] arr2 = {1,1};
        System.out.println(Arrays.toString(arr2));
        System.out.println("Max : " + objCWMW.maxArea(arr2));
    }
}

/*  Output:
    $ java containerWithMostWater
    [1, 8, 6, 2, 5, 4, 8, 3, 7]
    Max : 49
    [1, 1]
    Max : 1
 */