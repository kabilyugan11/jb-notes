import java.util.Scanner;
import java.util.Arrays;

class numArray{
    public int findMax(int[] array) {
        System.out.println("Array : " + Arrays.toString(array));
        //int max = 0;  //it cannot find Negative numbers for findMax
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            int currentElememt = array[i];
            if (currentElememt > max) {
                max = currentElememt;
            }
        }
        return max;
        
    }
}

public class Find_Max_Element_inArray {
    public static void main(String[] args) {
        //int[] array = {7,8,2,9,5,3};
        Scanner scanner = new Scanner(System.in);

        System.out.println("Number of Elements : ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        System.out.println("Enter " + size + " Elements: ");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        scanner.close();

        numArray numArrayObj = new numArray();
        int output = numArrayObj.findMax(array);
        System.out.println("Max Element is : " + output);
    }

}

/*  Output:
    $ java Find_Max_Element_inArray
    Number of Elements : 
    5
    Enter 5 Elements: 
    -1
    0
    1
    2
    3
    Array : [-1, 0, 1, 2, 3]
    Max Element is : 3
 */