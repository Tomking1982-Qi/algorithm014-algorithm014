# 解题步骤 (覃超老师)
1、Clarificaiton（了解清楚题目意思及必要的交流）

2、Possible solution -> Optimal (Time & Space)

3、Code （写出最佳解答）

4、Test (多case 测试)

## 心得体会：

```
1、利用零碎的时间学习视频教程，争强对这周学习内容的掌握。
2、每周1、3、5 重点学习视频内容（切记周末不能花时间，再去理解知识点）
3、在每天完成每日一题的基础上，在周五之前完成所有课后作业及视频中出现的题目
4、给周末的复习和预先，留足时间。（周末应该是去加强之前习题的变数和题型总结，以及预先下周内容和补充类似题型练习。）
5、充分利用群里的讨论和其它同学好的学习经验，加快 自己 理解和掌握个别知识的时间。

Free Note:
A、看老外的题解，感觉，老外在玩 各种尝试，他们是在思考  怎么精辟 怎么多解题思路
B、二叉树的 层续遍历 最重要的，就是对每次的循环，如果是BSF的话，就是对当前 栈Size的遍历（二叉树层序遍历，优先考虑BFS）
C、logn复杂度，通常可以用二叉堆 或者 排序 SBT(二叉搜索树) 或者 二分查找 或者 排序 e.g. Arrays.sort();
D、频次问题：有下标或者范围的，可以用数组 group by(某个值一样)统计频次；否则用Map group by(Key一样) 统计频次。
E、不管是递归、分治 、回溯， 本质上都是找重新性及分解问题和最后组合每个子问题的结果
```

## Tips:
1、递归
  一个问题可以分解为相同性质的子问题就可以用递归实现。就拿DFS来说，问题本身和左子树，右子树这就是问题与子问题的关系。
  递归求解独立重复子问题时是最有效的，若是重叠子问题一般用迭代（循环）来写,避免重复计算。
a. 递归实现：
```
递归本质上就是循环，通过循环体调用自己来进行循环（称为：通过函数体来进行的循环）。
```
b. 递归特性
```
* 向下进入到不同梦境中；向下又回到原来一层（不能跨层跳跃，一层一层下，一层一层回来，有对称性）
* 通过声音（函数参数）同步回到上一层。
* 每一层的环境和周围的人都是一份拷贝，主角等几个人穿越不同层级的梦境（发生和携带变化）
```
c、递归思维要素
```
1、不要人肉进行递归, 抛弃递归状态树，可以基于函数直接写代码。（最大误区）
2、找到 最近最简 方法，将其拆解成 可重复 解决的问题。（即：找 最近重复子 问题）
3、数学归纳法思维
```
d、递归常见适用模板
```
// Java
public void recur(int level, int param) { 
  // recursion terminator 递归终结条件
  if (level > MAX_LEVEL) { 
    // process result 
    return; 
  }
  // process logic in current level 处理当前层逻辑
  process(level, param); 
  // drill down 下探到下一层
  recur( level: level + 1, newParam); 
  // reverse/restore the current level status, if needed 清理当前层(全局变量)
}
个人觉得：第二和第三步骤有时会颠倒的，比如求树的最小深度问题。
if (root == null) {
    return 0;
}
int minLeft = minDepth(root.left);
int minRight = minDepth(root.right);
return (minLeft == 0 || minRight == 0) ? (minLeft + minRight + 1) : Math.min(minLeft, minRight) + 1;
```
2、分治（divide(split) & conquer） 、 回溯
a、分治和回溯（一种递归的细分类）本质上就是递归（特殊的递归或复杂的递归）。还是去找重复性（最近的重复性（怎么构造怎么分解-分治 & 回溯），最优的重复性-动态规划）
b、分治 常见适用模板
```
// Java
private static int divide_conquer(Problem problem, ) {
  // recursion terminator 比如到达叶子节点
  if (problem == NULL) {
    int res = process_last_result();
    return res;     
  }
  
  // process current problem
      // prepare data 
      data = prepare_data(problem) 
      subProblems = split_problem(problem)

      // conquer subproblems
      res0 = divide_conquer(subProblems[0])
      res1 = divide_conquer(subProblems[1])

      // process and generate the final result (merge)
      result = process_result(res0, res1);
  
  // revert the current level status
  return result;
}
```
[递归状态树](split-conquer.png "split")

## 题型记录：
Week01-Day15
二叉树的中序遍历: leetcode-94
https://leetcode-cn.com/problems/binary-tree-inorder-traversal/

Week01-Day16
剑指 Offer 05: 替换空格 
https://leetcode-cn.com/problems/ti-huan-kong-ge-lcof/

Week01-Day17
剑指 Offer 06: 从尾到头打印链表
https://leetcode-cn.com/problems/cong-wei-dao-tou-da-yin-lian-biao-lcof

Week01-Day18
面试题68 - II：二叉树的最近公共祖先 
https://leetcode-cn.com/problems/er-cha-shu-de-zui-jin-gong-gong-zu-xian-lcof/

Week01-Day19

Week01-Day20
二叉树的最大深度：leetcode-104
https://leetcode-cn.com/problems/maximum-depth-of-binary-tree/

Week01-Day21



