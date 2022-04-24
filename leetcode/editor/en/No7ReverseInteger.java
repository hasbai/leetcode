//////Given a signed 32-bit integer x, return x with its digits reversed. If 
//////reversing x causes the value to go outside the signed 32-bit integer 
//range [
////-2³¹, 2³¹ -
////// 1], then return 0. 
//////
////// Assume the environment does not allow you to store 64-bit integers (
//signed 
////
//////or unsigned). 
//////
////// 
////// Example 1: 
//////
////// 
//////Input: x = 123
//////Output: 321
////// 
//////
////// Example 2: 
//////
////// 
//////Input: x = -123
//////Output: -321
////// 
//////
////// Example 3: 
//////
////// 
//////Input: x = 120
//////Output: 21
////// 
//////
////// 
////// Constraints: 
//////
////// 
////// -2³¹ <= x <= 2³¹ - 1 
////// 
////// Related Topics Math 👍 7026 👎 9641
////
//


package leetcode.editor.en;

public class No7ReverseInteger {
    public static void main(String[] args) {
        Solution solution = new No7ReverseInteger().new Solution();
        System.out.println(solution.reverse(1534236469));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int reverse(int x) {
            int temp, y = 0;
            while (x != 0) {
                temp = x % 10;
                x = x / 10;
                if (y > Integer.MAX_VALUE / 10 || (y == Integer.MAX_VALUE / 10 && temp > 7)) return 0;
                if (y < Integer.MIN_VALUE / 10 || (y == Integer.MIN_VALUE / 10 && temp < -8)) return 0;
                y = 10 * y + temp;
            }
            return y;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}