class findMaximumInArray {
    public static int largest(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) { 
            max = arr[i]; 
        }
        return max; 
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 8, 7, 56, 90};
        int[] arr2 = {5, 5, 5, 5};
        int[] arr3 = {10};

        System.out.println("Max Of arr1 = {1, 8, 7, 56, 90} = " + findMaximumInArray.largest(arr1));
        System.out.println("Max Of arr2 = {5, 5, 5, 5}; = " + findMaximumInArray.largest(arr2));
        System.out.println("Max Of arr3 = {10}; = " + findMaximumInArray.largest(arr3));
    }
}

/*  Output:
    $ java findMaximumInArray 
    Max Of arr1 = {1, 8, 7, 56, 90} = 90
    Max Of arr2 = {5, 5, 5, 5}; = 5
    Max Of arr3 = {10}; = 10
 */
