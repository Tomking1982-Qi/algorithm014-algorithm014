# 解题步骤 (覃超老师)
1、Clarificaiton（了解清楚题目意思及必要的交流）

2、Possible solution -> Optimal (Time & Space)

3、Code （写出最佳解答）

4、Test (多case 测试)

## 心得体会：

```
本周更新
1、

继续加油吧！！！

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
D、二分法：    
   
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




