import java.util.HashMap;
import java.util.Map;

public class frequencyCount {
    //Algorith 1
    public int[] freqCount1 (int[] array, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            int ce = array[i]; // ce -> Current Element
            if (map.containsKey(ce)){
                int ceCount = map.get(ce);
                ceCount++;
                map.put(ce,ceCount);
            }
            else {
                map.put(ce,1);
            }
        }
        int freq = 0;
        int exits = 0;
        if (map.containsKey(target)){
            exits = 1;
            freq = map.get(target); 
        }
        return new int[]{exits, freq};
    }

    //Algorith 2
    public int[] freqCount2 (int[] array, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            int ce = array[i];
            int c = map.getOrDefault(ce, 0);
            c++;
            map.put(ce, c);
        }
        int exists = map.containsKey(target) ? 1 : 0;
        int freq = exists == 1 ? map.get(target) : 0;
        return new int[]{exists, freq};
    }

     public int[] freqCountBrutefore(int[] array, int target) {
        int freq = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                freq++;
            }
        }
        int exists = freq > 0 ? 1 : 0;
        return new int[]{exists, freq};
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 5, 1, 6, 5, 3};
        int find = 2;
        frequencyCount objFC = new frequencyCount();

        // By Algorith 1
        int[] output = objFC.freqCount1(arr, find);
        System.out.println("Target element "+ find + " is exits? : " + output[0] + " & Frequency is " + output[1]);
         
        // By Algorith 2
        int[] output2 = objFC.freqCount2(arr, find);
        System.out.println("Target element "+ find + " is exits? : " + output2[0] + " & Frequency is " + output2[1]);

         // By Algorith 3
        int[] output3 = objFC.freqCountBrutefore(arr, find);
        System.out.println("Target element "+ find + " is exits? : " + output3[0] + " & Frequency is " + output3[1]);
    }
}

/*  Output:
    $ java frequencyCount
    Target element 2 is exits? : 1 & Frequency is 2
    Target element 2 is exits? : 1 & Frequency is 2
    Target element 2 is exits? : 1 & Frequency is 2
 */