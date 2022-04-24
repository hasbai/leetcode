//Given an integer x, return true if x is palindrome integer. 
//
// An integer is a palindrome when it reads the same backward as forward. 
//
// 
// For example, 121 is a palindrome while 123 is not. 
// 
//
// 
// Example 1: 
//
// 
//Input: x = 121
//Output: true
//Explanation: 121 reads as 121 from left to right and from right to left.
// 
//
// Example 2: 
//
// 
//Input: x = -121
//Output: false
//Explanation: From left to right, it reads -121. From right to left, it 
//becomes 121-. Therefore it is not a palindrome.
// 
//
// Example 3: 
//
// 
//Input: x = 10
//Output: false
//Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
// 
//
// 
// Constraints: 
//
// 
// -2³¹ <= x <= 2³¹ - 1 
// 
//
// 
//Follow up: Could you solve it without converting the integer to a string? 
//Related Topics Math 👍 5640 👎 2103


package leetcode.editor.en;

public class No9PalindromeNumber {
    public static void main(String[] args) {
        Solution solution = new No9PalindromeNumber().new Solution();
        System.out.println(solution.isPalindrome(-12321));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean isPalindrome(int x) {
            if (x < 0) {
                return false;
            }
//            char[] array = Integer.toString(x).toCharArray();
//            int left = 0;
//            int right = array.length - 1;
//            while (left < right) {
//                if (array[left] != array[right]) {
//                    return false;
//                }
//                left++;
//                right--;
//            }
            int left = (int) (Math.log10(x));
            int right = 0;
            while (left > right) {
                int a = (int) (x % Math.pow(10, left + 1) / Math.pow(10, left));
                int b = (int) (x % Math.pow(10, right + 1) / Math.pow(10, right));
                if (a != b) {
                    return false;
                }
                left--;
                right++;
            }
            return true;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}