class Solution {
    public int minPathSum(int[][] grid) {
        if(grid.length == 0 || grid[0].length == 0) {
            return 0;
        }
        for (int row = 1; row < grid.length; row++) {
            grid[row][0] += grid[row - 1][0];
        }
        for (int col = 1; col < grid[0].length; col++) {
            grid[0][col] += grid[0][col -1];
        }
        for (int i = 1; i < grid.length; i++) {
            for (int j = 1; j < grid[i].length; j++) {
                grid[i][j] += Math.min(grid[i][j-1], grid[i -1][j]);
            }
        }
        int[] lastRow = grid[grid.length - 1];
        return lastRow[lastRow.length -1];
    }
}
