//The string "PAYPALISHIRING" is written in a zigzag pattern on a given number
//of rows like this: (you may want to display this pattern in a fixed font for
//better legibility)
//
//
//P   A   H   N
//A P L S I I G
//Y   I   R
//
//
// And then read line by line: "PAHNAPLSIIGYIR"
//
// Write the code that will take a string and make this conversion given a
//number of rows:
//
//
//string convert(string s, int numRows);
//
//
//
// Example 1:
//
//
//Input: s = "PAYPALISHIRING", numRows = 3
//Output: "PAHNAPLSIIGYIR"
//
//
// Example 2:
//
//
//Input: s = "PAYPALISHIRING", numRows = 4
//Output: "PINALSIGYAHRPI"
//Explanation:
//P     I    N
//A   L S  I G
//Y A   H R
//P     I
//
//
// Example 3:
//
//
//Input: s = "A", numRows = 1
//Output: "A"
//
//
//
// Constraints:
//
//
// 1 <= s.length <= 1000
// s consists of English letters (lower-case and upper-case), ',' and '.'.
// 1 <= numRows <= 1000
//
// Related Topics String 👍 3593 👎 8305


package leetcode.editor.en;

public class No6ZigzagConversion {
    public static void main(String[] args) {
        Solution solution = new No6ZigzagConversion().new Solution();
        System.out.println(solution.convert("PAYPALISHIRING", 3));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String convert(String s, int numRows) {
            if (numRows == 1) {
                return s;
            }
            int n = s.length();
            int width = (numRows - 1) * (n / (2 * numRows - 2)) + Math.max(n % (2 * numRows - 2) - numRows, 0) + 1;
            char[] array = s.toCharArray();
            char[][] matrix = new char[numRows][width];
            boolean down = false;
            int i = 0;
            int j = 0;
            for (char c : array) {
                matrix[i][j] = c;
                if (i == 0 || i == numRows - 1) {
                    down = !down;
                }
                if (down) {
                    i++;
                } else {
                    i--;
                    j++;
                }
            }
            char[] result = new char[n];
            i = 0;
            for (char[] row : matrix) {
                for (char c : row) {
                    if (c != 0) {
                        result[i] = c;
                        i++;
                    }
                }
            }
            return String.valueOf(result);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}