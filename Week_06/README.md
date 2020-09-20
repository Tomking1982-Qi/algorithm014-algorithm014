# 解题步骤 (覃超老师)
1、Clarificaiton（了解清楚题目意思及必要的交流）

2、Possible solution -> Optimal (Time & Space)

3、Code （写出最佳解答）

4、Test (多case 测试)

## 心得体会：

```
本周更新
1、主要复习了最近一周已做题目
2、DP问题思路：就是找最优子结构（分治得到子问题，）。
3、DP问题实现：最优子结构对应的动态方程 或是 递推方程。



Free Note:
感触：
a、人肉递归低效、很累
b、找到最近最简方法，将其拆解成可重复解决的问题
c、数学归纳法思维（抵制人肉递归）
d、本质：寻找重复性 -> 计算机指令集（if else, while、 for loop、 recursion等）

1、题型-最小路径和
时间复杂度：O(m * n)
状态存储：二维数组 
递推方程：
grid[i][j] += Math.min(grid[i][j-1], grid[i -1][j]);

2、题型-零钱转换：动态规划：自下而上
时间复杂度：O(Sn）
状态存储：一维数组 
递推方程：
dp[i] = Math.min(dp[i], dp[i - coin] + 1);

3、题型- 最长公共子序列
时间复杂度：O(m* n）
状态存储：二维数组 
递推方程：
if (rowChar == colChar) {
    table[row][col] = table[row - 1][col -1] + 1;
} else {
   table[row][col] = Math.max(table[row][col -1], table[row-1][col]);
}

4、题型- 不同路径
时间复杂度：O(m* n）
状态存储：一维数组 
递推方程：
path[i][j] = path[i-1][j] + path[i][j-1];
Or
cur[j] += cur[j-1];

5、题型- 不同路径 II
时间复杂度：O(m* n）
状态存储：一维数组 
递推方程：
path[i][j] = path[i-1][j] + path[i][j-1];
Or
cur[j] += cur[j-1];

6、打家劫舍- LC62
时间复杂度：O(n）
状态存储：不需要独立创建数组
递推方程：
nums[i] = Math.max(nums[i -1], (nums[i] + nums[i - 2]));


分治模板：
https://shimo.im/docs/zvlDqLLMFvcAF79A/read

递归模板：
https://shimo.im/docs/EICAr9lRPUIPHxsH/read

## 题型记录：
Week06-Day36

最小路径和: leetcode-64
https://leetcode-cn.com/problems/minimum-path-sum/

Week06-Day37

零钱兑换: leetcode-322
https://leetcode-cn.com/problems/coin-change/

Week06-Day38

打家劫舍: leetcode-213
https://leetcode-cn.com/problems/house-robber-ii/description/

Week06-Day39

N叉树的前序遍历: leetcode-589
https://leetcode-cn.com/problems/n-ary-tree-preorder-traversal/description/

Week06-Day40

矩形区域不超过 K 的最大数值和: leetcode-363
https://leetcode-cn.com/problems/max-sum-of-rectangle-no-larger-than-k/

Week06-Day41

搜索旋转排序数组: leetcode-33
https://leetcode-cn.com/problems/search-in-rotated-sorted-array/

Week06-Day42

单词搜索 II: leetcode-212
https://leetcode-cn.com/problems/word-search-ii/





