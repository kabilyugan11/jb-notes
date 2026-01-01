/*  Description of Leetcode:
    Sum of Square Numbers
    Medium
    Given a non-negative integer c, decide whether there're two integers a and b such that a2 + b2 = c.

    Example 1:
    Input: c = 5
    Output: true
    Explanation: 1 * 1 + 2 * 2 = 5
    Example 2:

    Input: c = 3
    Output: false
    
    Constraints:
    0 <= c <= 231 - 1
 */

public class squareSum {
    public boolean judgeSquareSum(int c) {
        long left = 0;
        long right = (long)Math.sqrt(c);

        while (left <= right) {
            long sum = (left * left) + (right * right);

            if (sum == c) {
                return true;
            }
            else if (sum < c){
                left++;
            }
            else {
                right --;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int c1 = 5;
        int c2 = 3;
        squareSum sqrSumObj = new squareSum();

        System.out.println("c1 = 5 => " + sqrSumObj.judgeSquareSum(c1));
        System.out.println("c1 = 3 => " + sqrSumObj.judgeSquareSum(c2));
    }
}

/*  Output:
    $ java squareSum
    c1 = 5 => true
    c1 = 3 => false
 */
