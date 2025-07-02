public class SubarraySum_Bruteforce {
    public static void main(String[] args) {
        int[] arr = {3, 5, 1, 1, 7, 8};  // Input array
        int start = 1;  // Starting index
        int end = 5;  // Ending index

        int ans = 0;

        // Array Printing
        System.out.print("Array = ");
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.print("\n");

        // Loop from index i to j and add values
        for (int i = start; i <= end; i++) {
            ans += arr[i];
        }
        System.out.println("Sum from index " + start + " to " + end + " is: " + ans);
    }
}

/*  Output:
    $ java SubarraySum_Bruteforce
    Array = 3 5 1 1 7 8 
    Sum from index 1 to 5 is: 22
 */