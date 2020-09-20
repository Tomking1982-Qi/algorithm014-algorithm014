class Solution {
    public List<String> findWords(char[][] board, String[] words) {
        // 时间复杂度：一个非常宽松的上界为 O(MN \cdot 3^L)O(MN⋅3^L)，
        // 其中 M, NM,N 为网格的长度与宽度，LL 为字符串 \text{word}word 的长度
        if (board == null || board.length == 0 || words == null || words.length == 0) {
            return new ArrayList<String>();
        }
        int row = board.length;
        int col = board[0].length;
        boolean[][] visited = new boolean[row][col];
        Set<String> list = new HashSet<String>();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                // if (board[i][j] == word.charAt(0)) {
                    for (String word : words) {
                        helper(visited, board, i, j, word, 0, list);
                    }
                // }
            }
        }
        return new ArrayList<String>(list);
    }

    private boolean helper(boolean[][] visited , char[][] board, int i,
                        int j, String word, int path, Set<String> list) {
        if (board[i][j] != word.charAt(path)) {
            return false;
        } else if (path == word.length() - 1) {
            list.add(word);
            return true;
        }

        visited[i][j] = true;
        int[][] dicts = new int[][] {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
        boolean res = false;
        for (int[] dict : dicts) {
            int newi = i + dict[0], newj = j + dict[1];
            if (newi < 0 || newi >= board.length || newj < 0 || newj >= board[0].length) {
                continue;
            }
            if (!visited[newi][newj]) {
                if (helper(visited, board, newi, newj, word, path + 1, list)) {
                    res = false;
                    break;
                }
            }
        }
        visited[i][j] = false;
        return res;
    }
}
