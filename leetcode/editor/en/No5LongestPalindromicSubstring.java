//////Given a string s, return the longest palindromic substring in s.
//////
//////
////// Example 1:
//////
//////
//////Input: s = "babad"
//////Output: "bab"
//////Explanation: "aba" is also a valid answer.
//////
//////
////// Example 2:
//////
//////
//////Input: s = "cbbd"
//////Output: "bb"
//////
//////
//////
////// Constraints:
//////
//////
////// 1 <= s.length <= 1000
////// s consist of only digits and English letters.
//////
////// Related Topics String Dynamic Programming 👍 17208 👎 1020
////
//


package leetcode.editor.en;

public class No5LongestPalindromicSubstring {
    public static void main(String[] args) {
        Solution solution = new No5LongestPalindromicSubstring().new Solution();
        System.out.println(solution.longestPalindrome("abbba"));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String longestPalindrome(String s) {
            char[] array = s.toCharArray();
            int length = 0;
            int start = 0;
            for (int i = 1; i < array.length; i++) {
                int left = i, right = i;
                while (true) {
                    if (right + 1 < array.length && array[right + 1] == array[left]) {
                        right++;
                    } else if (left - 1 >= 0 && array[left - 1] == array[right]) {
                        left--;
                    } else {
                        break;
                    }
                }
                while (true) {
                    if (left <= 0 || right >= array.length - 1 || array[left - 1] != array[right + 1]) {
                        if (right - left > length) {
                            length = right - left;
                            start = left;
                        }
                        break;
                    }
                    left--;
                    right++;
                }
            }
            return s.substring(start, start + length + 1);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}