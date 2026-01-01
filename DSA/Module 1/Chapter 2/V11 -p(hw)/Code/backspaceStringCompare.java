public class backspaceStringCompare {

    public String getFinalString(String s) {
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);

            if (current != '#') {
                // Push character
                ans.append(current);
            } else if (ans.length() > 0) {
                // Pop character (simulate backspace)
                ans.deleteCharAt(ans.length() - 1);
            }
        }

        return ans.toString();  // Convert StringBuilder to String
    }

    public boolean backspaceCompare(String s, String t) {
        String finalS1 = getFinalString(s);
        String finalS2 = getFinalString(t);
        return finalS1.equals(finalS2);
    }

    public static void main(String[] args) {
        backspaceStringCompare obj = new backspaceStringCompare();
        System.out.println(obj.backspaceCompare("ab#c", "ad#c")); // true
        System.out.println(obj.backspaceCompare("ab##", "c#d#")); // true
        System.out.println(obj.backspaceCompare("a#c", "b"));     // false
    }
}

/*  Output
$ java backspaceStringCompare
    true
    true
    false
 */