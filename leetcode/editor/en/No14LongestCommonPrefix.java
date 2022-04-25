//Write a function to find the longest common prefix string amongst an array of 
//strings. 
//
// If there is no common prefix, return an empty string "". 
//
// 
// Example 1: 
//
// 
//Input: strs = ["flower","flow","flight"]
//Output: "fl"
// 
//
// Example 2: 
//
// 
//Input: strs = ["dog","racecar","car"]
//Output: ""
//Explanation: There is no common prefix among the input strings.
// 
//
// 
// Constraints: 
//
// 
// 1 <= strs.length <= 200 
// 0 <= strs[i].length <= 200 
// strs[i] consists of only lower-case English letters. 
// 
// Related Topics String 👍 7729 👎 2943


package leetcode.editor.en;

public class No14LongestCommonPrefix {
    public static void main(String[] args) {
        Solution solution = new No14LongestCommonPrefix().new Solution();
        String[] a = new String[]{"ab", "a"};
        System.out.println(solution.longestCommonPrefix(a));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String longestCommonPrefix(String[] strs) {
            int min = strs[0].length();
            int i = 0;
            int end = 0;
            boolean flag = true;
            for (String s : strs) {
                min = Math.min(min, s.length());
            }
            if (min == 0) {
                return "";
            }
            while (flag && i < min) {
                char c = strs[0].charAt(i);
                for (String s : strs) {
                    if (c != s.charAt(i)) {
                        end = i;
                        flag = false;
                        break;
                    }
                }
                i++;
            }
            if (flag) {
                end = min;
            }
            return strs[0].substring(0, end);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}