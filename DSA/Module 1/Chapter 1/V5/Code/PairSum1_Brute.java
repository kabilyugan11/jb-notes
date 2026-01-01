public class PairSum1_Brute {
    public static void main(String[] args) {
        int[] arr = {5, 2, 7, 4, 3, 8};
        int target = 10;

        System.out.println("Bruteforeces Pairs :");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println(arr[i] + " + " + arr[j] + " = " + target);
                }
            }
        }
    }
}

/*  Output:
    $ java PairSum1_Brute 
    Bruteforeces Pairs :
    2 + 8 = 10
    7 + 3 = 10
 */