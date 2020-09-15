class Solution {
    public int coinChange(int[] coins, int amount) {
        // if (amount < 0) {
        //     return -1;
        // }
        // if (amount == 0) {
        //     return 0;
        // }
        // int max = amount + 1;
        // int[] dp = new int[amount + 1];
        // Arrays.fill(dp, max);
        // dp[0] = 0;
        // for (int i = 1; i <= amount; i++) {
        //     for (int coin : coins) {
        //         if (coin <= i) {
        //             // coin 金额面值大小不定，所以取最小值时也要参考bp[i]的值
        //             dp[i] = Math.min(dp[i], dp[i - coin] + 1);
        //         }
        //     }
        // }
        // return dp[amount] < amount ? dp[amount] : -1; 

        // 解法二：动态规划-自上而下(记忆化搜索)
        if (amount < 1) {
            return 0;
        }
        return coinChange(coins, amount, new int[amount]);
    }

    private int coinChange(int[] coins, int remain, int[] count) {
        if (remain < 0) {
            return -1;
        }
        if (remain == 0) {
            return 0;
        }
        if (count[remain -1] != 0) {
            return count[remain -1];
        }
        int min = Integer.MAX_VALUE;
        for (int coin : coins) {
            int result = coinChange(coins, remain - coin, count);
            if (result >= 0 && result < min ) {
                min = 1 + result;
            }
        }
        count[remain - 1] = (min == Integer.MAX_VALUE) ? -1 : min;
        return count[remain - 1];
    }
}
