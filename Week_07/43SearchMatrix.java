class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
 
        if (matrix == null || matrix.length ==0) {
            return false;
        }
        int row = matrix.length-1;
        int col = 0;  
        while (row >= 0 && col < matrix[0].length) {
            int var = matrix[row][col];
            if (var == target) {
                return true;
            }
            if (var > target) {
                row--;
            } else {
                col++;
            }
        }
        return false;

        // for (int i = 0; i < matrix.length; i++) {
        //     for (int j = 0; j < matrix[0].length; j++) {
        //         if (matrix[i][j] == target) {
        //             return true;
        //         }
        //     }
        // }

        // return false;      
    }
}
