class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        // 一维数组二分法: O(log m * n)
        int m = matrix.length, n = matrix[0].length;
        int privotIdx = 0, privotValue = 0;
        int l = 0, r = m * n - 1;
        while (l <= r) {
            privotIdx = (l + r) >>> 1;
            // privotIdx = (l + r) / 2;
            // privotIdx = l + (r - l) / 2;
            privotValue = matrix[privotIdx / n][privotIdx % n];
            if (privotValue == target) {
                return true;
            } else if (target < privotValue) {
                r = privotIdx - 1;
            } else {
                l = privotIdx + 1;
            }
        }
        return false;
    }
}
