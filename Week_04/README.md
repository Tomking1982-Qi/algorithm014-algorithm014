# 解题步骤 (覃超老师)
1、Clarificaiton（了解清楚题目意思及必要的交流）

2、Possible solution -> Optimal (Time & Space)

3、Code （写出最佳解答）

4、Test (多case 测试)

## 心得体会：

```
上周更新
1、利用零碎的时间学习视频教程，争强对这周学习内容的掌握。（Done）
2、每周1、3、5 重点学习视频内容（切记周末不能花时间，再去理解知识点）（Done）
3、在每天完成每日一题的基础上，在周五之前完成所有课后作业及视频中出现的题目（完成度：80%）
4、给周末的复习和预先，留足时间。（周末应该是去加强之前习题的变数和题型总结，以及预先下周内容和补充类似题型练习。）（完成度：80%）
5、充分利用群里的讨论和其它同学好的学习经验，加快 自己 理解和掌握个别知识的时间。（Done）

本周更新
1、对于本周涉及到回溯的题目没有非常的理解透彻，下周还需要继续花点时间练习和巩固。
2、对递归、分治和回溯的概念和实现模板（如下）及相关题型，已经有所掌握，后期可以再巩固加强。
3、高频题目汇集册 和 脑图 更新的进度，还需要同步完善，本周这块有点薄弱。

继续加油吧！！！

Free Note:
A、看老外的题解，感觉，老外在玩 各种尝试，他们是在思考  怎么精辟 怎么多解题思路
B、二叉树的 层续遍历 最重要的，就是对每次的循环，如果是BSF的话，就是对当前 栈Size的遍历（二叉树层序遍历，优先考虑BFS）
C、logn复杂度，通常可以用二叉堆 或者 排序 SBT(二叉搜索树) 或者 二分查找 或者 排序 e.g. Arrays.sort();
D、频次问题：有下标或者范围的，可以用数组 group by(某个值一样)统计频次 如 Leetcode-347 桶排序；否则用Map group by(Key一样) 统计频次。
E、不管是递归、分治 、回溯， 本质上都是找重新性及分解问题和最后组合每个子问题的结果
```

## Tips:
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




