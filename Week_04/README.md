# 解题步骤 (覃超老师)
1、Clarificaiton（了解清楚题目意思及必要的交流）

2、Possible solution -> Optimal (Time & Space)

3、Code （写出最佳解答）

4、Test (多case 测试)

## 心得体会：

```
本周更新
1、

加油吧！！！

Free Note:
A、层次遍历-水波纹
B、牛顿定律
    long i = num / 2;
    while (i * i > num) {
        i = ( i + num / i) / 2;
    }
    return i * i == num;
C、摩尔投票法
   摩尔投票法思路 O(n)
    int candidateNum = nums[0], count = 0;
    for(int num : nums) {
        if (candidateNum == num) {
            count++;
        } else if (--count == 0) {
            candidateNum = num;
            count = 1;
        }
    }
    return candidateNum;
D、贪心算法 & 回溯 & 动态规划 简单区分
贪心算法：当下做局部最优判断，且不会回退
（贪心算法主要解决一些最优化的问题，一般选择最优、最近、最好等问题一般用贪心算法，如求最小生成树 或 哈夫曼编码等。
  还有工程上一般用贪心法不能得到想要的结果，但由于贪心算法的高效性和接近最优解，一般会用贪心算法作为一些辅助算法）
回溯：能够回退
动态规划：最优判断 + 回退

二分法：    
   
```

## Tips:
Recursion Or Iterator（while / for / Loop）:
a、每个节点都要访问一次
b、每个节点仅仅访问一次
c、对于节点访问顺序不不同，分为 DFS(depth first search) & BFS(Breadth first search) & 优先级优先（启发式搜索）

### 1、DFS 代码模板
  一个问题可以分解为相同性质的子问题就可以用递归实现。就拿DFS来说，问题本身和左子树，右子树这就是问题与子问题的关系。
  
```
//Java
public List<List<Integer>> levelOrder(TreeNode root) {
    List<List<Integer>> allResults = new ArrayList<>();
    if(root==null){
        return allResults;
    }
    travel(root,0,allResults);
    return allResults;
}

private void travel(TreeNode root,int level,List<List<Integer>> results){
    // terminator
    if(results.size()==level){
        results.add(new ArrayList<>());
    }
    // process current node here
    results.get(level).add(root.val);
    
    // drill down
    if(root.left!=null){
        travel(root.left,level+1,results);
    }
    if(root.right!=null){
        travel(root.right,level+1,results);
    }
}
```

### 2、BFS 代码模板
```
//Java
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public List<List<Integer>> levelOrder(TreeNode root) {
    List<List<Integer>> allResults = new ArrayList<>();
    if (root == null) {
        return allResults;
    }
    Queue<TreeNode> nodes = new LinkedList<>();
    nodes.add(root);
    while (!nodes.isEmpty()) {
        int size = nodes.size();
        List<Integer> results = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            TreeNode node = nodes.poll();
            results.add(node.val);
            if (node.left != null) {
                nodes.add(node.left);
            }
            if (node.right != null) {
                nodes.add(node.right);
            }
        }
        allResults.add(results);
    }
    return allResults;
}
```

### 3、贪心算法（Greedy）
```
定义：
贪心算法是一种在每一步选择中都采取在当前状态下最好或最优（即最有利）的选择，从而希望导致是全局最好或最优的算法。
贪心算法与动态规划的不同在它对每个子问题的解决方案都做出选择，不能回退。动态规划则会保存以前的运算结果，并根据以前的结果对当前进行选择，有回退功能。

场景：
简单地说，问题能够分解成子问题来解决，子问题的最优解能递推到最终问题的最优解。这种子问题最优解称为最优子结构。（可以从前往后贪心，也可以从后往前贪心）

```

### 4、二分法
```


```

## 题型记录：
Week01-Day22
全排列: leetcode-46
https://leetcode-cn.com/problems/permutations/submissions/

Week01-Day23
斐波那契数: leetcode-509
https://leetcode-cn.com/problems/fibonacci-number/

Week01-Day24
买卖股票的最佳时机: leetcode-122
https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock-ii/description/

Week01-Day25
柠檬水找零: leetcode-860
https://leetcode-cn.com/problems/lemonade-change/description/

Week01-Day26
岛屿数量: leetcode-200
https://leetcode-cn.com/problems/number-of-islands/

Week01-Day27
有效的完全平方数: leetcode-367
https://leetcode-cn.com/problems/valid-perfect-square/

Week01-Day28
多数元素: leetcode-169
https://leetcode-cn.com/problems/majority-element/




