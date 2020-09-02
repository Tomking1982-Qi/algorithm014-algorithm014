class Solution {
    public int fib(int N) {
        if (N == 0) {
            return 0;
        }
        return dfs(N, 0, 1);
    }

    private int dfs(int n, int a, int b) {
        if (n < 2) {
            return b;
        }
        return dfs(n-1, b, a + b);
    }
}
