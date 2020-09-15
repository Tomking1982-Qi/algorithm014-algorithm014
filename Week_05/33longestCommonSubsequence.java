class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        //解法1：动态规划表格
        int[][] table = new int[text1.length() + 1][text2.length() + 1];
        for(int col = 0; col < table[0].length; col++) {
            table[0][col] = 0;
        }
        for (int row = 0; row < table.length; row++) {
            table[row][0] = 0;
        }
        for (int row = 1; row < table.length; row++) {
            char rowChar = text1.charAt(row - 1);
            for (int col = 1; col < table[row].length; col++) {
                char colChar = text2.charAt(col - 1);
                if (rowChar == colChar) {
                    table[row][col] = table[row - 1][col -1] + 1;
                } else {
                    table[row][col] = Math.max(table[row][col -1], table[row-1][col]);
                }
            }
        }
        int[] lastRow = table[table.length -1];
        return lastRow[lastRow.length - 1];
    }
}
