class Solution {
    public int[] parent;
    public int find(int p) {
        while (parent[p] != p) {
            parent[p] = parent[parent[p]];
            p = parent[p];
        }
        return p;
    }

    public void union(int p, int q) {
        int rootP = find(p);
        int rootQ = find(q);
        if (rootP != rootQ) {
            parent[rootP] = rootQ;
        }
		
    }

    public int findCircleNum(int[][] M) {
        if (M == null || M.length == 0) {
            return 0;
        }
        int n = M.length;
        parent = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;
        }
        for (int i = 0; i < n; i++) {
            // j = i + 1 妙哉
            for(int j = i + 1; j < n; j++) {
                if (M[i][j] == 1) {
                    union(i, j);
                }
            }
        }

        int res = 0;
        for (int i = 0; i < parent.length; i++) {
            if (i == parent[i]) {
                res++;
            }
        }
        return res;
    }
}
