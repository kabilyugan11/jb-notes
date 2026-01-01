public class backspaceStringCompareUsing2Pointer {

    public static void main(String[] args) {
        backspaceStringCompareUsing2Pointer sol = new backspaceStringCompareUsing2Pointer();

        // Example 1
        System.out.println(sol.backspaceCompare("ab#c", "ad#c"));  // true

        // Example 2
        System.out.println(sol.backspaceCompare("ab##", "c#d#"));  // true

        // Example 3
        System.out.println(sol.backspaceCompare("a#c", "b"));      // false
    }

    public boolean backspaceCompare(String s, String t) {
        int i = s.length() - 1;
        int j = t.length() - 1;

        while (i >= 0 || j >= 0) {
            i = getNextValidCharIndex(s, i);
            j = getNextValidCharIndex(t, j);

            char c1 = (i >= 0) ? s.charAt(i) : '\0';
            char c2 = (j >= 0) ? t.charAt(j) : '\0';

            if (c1 != c2) return false;

            i--;
            j--;
        }

        return true;
    }

    private int getNextValidCharIndex(String str, int index) {
        int backCount = 0;

        while (index >= 0) {
            if (str.charAt(index) == '#') {
                backCount++;
                index--;
            } else if (backCount > 0) {
                backCount--;
                index--;
            } else {
                break;
            }
        }

        return index;
    }
}

/*  Output:
$ java backspaceStringCompareUsing2Pointer 
    true
    true
    false
 */