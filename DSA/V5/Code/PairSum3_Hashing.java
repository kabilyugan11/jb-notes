import java.util.HashMap;

public class PairSum3_Hashing {
    public static void main(String[] args) {
        int[] arr = {5, 2, 7, 4, 3, 8};
        int target = 10;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int current = arr[i];
            int ntf = target - current; //ntf -> Number To Find

            if (map.containsKey(ntf)) {
                System.out.println("Pair: (" + ntf + ", " + current + ")" + " = " + target);
            }

            // Store current element in map
            map.put(current, i);
        }
    }
}

/*  Example Walkthrough:
    First number is 5:
        ntf = 10 - 5 = 5
        Map is empty, so no pair yet.
        Add 5 to map.
    Second number is 2:
        ntf = 10 - 2 = 8
        Map has only 5, no 8, so no pair yet.
        Add 2 to map.
    Third number is 7:
        ntf = 10 - 7 = 3
        Map has 5, 2, no 3, no pair yet.
        Add 7 to map.
    Fourth number is 4:
        ntf = 10 - 4 = 6
        Map has 5, 2, 7, no 6, no pair.
        Add 4 to map.
    Fifth number is 3:
        ntf = 10 - 3 = 7
        Map has 7! So, print (7, 3).
        Add 3 to map.
    Sixth number is 8:
        ntf = 10 - 8 = 2
        Map has 2! So, print (2, 8).
        Add 8 to map.
 */

/*  Output:
    $ java PairSum3_Hashing 
    Pair: (7, 3) = 10
    Pair: (2, 8) = 10
 */
