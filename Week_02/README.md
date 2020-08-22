# 解题步骤 (覃超老师)
1、Clarificaiton（了解清楚题目意思及必要的交流）

2、Possible solution -> Optimal (Time & Space)

3、Code （写出最佳解答）

4、Test (多case 测试)

## 心得体会：
TODO

## Tips:
## 1、哈希表，映射，集合（实现与特性）
```
哈希表（Hash table）: 也叫散列表，是根据关键码值（key value）而直接进行访问的数据结构。它通过把关键码值映射到表中的一个位置来访问记录，以加快查找的速度。这个映射函数叫作散列函数（Hash Function）,存放记录的数组叫做哈希表（或散列表）
#具体来讲，hash(key) = value在内存中的地址，直接访问该地址即可得到value。 HashMap 散列表元素下标：(length - 1) & hash
```
**※ 哈希碰撞**：当不同key得到的hash值相同时， 就产生了哈希碰撞。(同一个内存地址对应多个value)

**※ 哈希碰撞的解决方法**：拉链式解决冲突法，将value在内存中储存的值改成一个链表，第一个值存在链表第1级，第二个碰撞的值存在链表第2级。

哈希表的查找/插入/删除时间复杂度皆为O(1)

## 1、树，二叉树，二叉搜索树
```
加速数据结构的关键在于升维（比如链表->跳表）

树：就相当于是一个二维的链表，每个节点除了自己，都指向另外的两个元素。
※ 树和图的区别：如果有环，按照定义就不称为树，但可以是图。
※ 可以说，链表是特殊的树，树是特殊的图。

二叉树：每个节点有至多2个分叉的树。
满二叉树（Full Binary Tree）：A binary tree T is full if each node is either a leaf or possesses exactly two child nodes.
完全二叉树（Complete Binary Tree）：A binary tree T with n levels is complete if all levels except possibly the last are completely full,
and the last level has all its nodes to the left side. 深度为K的完全二叉树，每个叶节点的深度只能为K或K-1，且要么只缺失右孩子或者左右孩子都缺失
（把一颗二叉树按照从上到下，从左到右的顺序构建，就是一个完全二叉树）
完美二叉树（Perfect Binary Tree）：A binary tree with all leaf nodes at the same depth. All internal nodes have degree 2.
二叉搜索树：又叫二叉排序树、二叉查找树、有序二叉树（Ordered Binary Tree）、排序二叉树（Sorted Binary Tree），是指一颗空树或者具有下列性质的二叉树：

左子树上所有节点的值均小于它的根节点的值；
右子树上所有节点的值均大于它的根节点的值；
以此类推：左右子树也分别是二叉搜索树
※二叉搜索树特性：中序遍历为升序排列；访问、查找、插入、删除都是 O(logn) 的复杂度

※ 二叉搜索树Demo：https://visualgo.net/zh/bst

### 其它树结构：

AVL树（平衡二叉树）：最先发明的自平衡的二叉搜索树。

红黑树：许多“平衡“搜索树中的一种， 可以保证在最坏情况下基本动态集合操作的时间复杂度为O(lgN)。

B树：B树与红黑树的不同之处在于B 树的结点可以有很多孩子，从数个到数于个。

B+树：一个常见的B树变种，它把所有的卫星数据都存储在叶结点中，内部结点只存放关键字和孩子指针，因此最大化了内部结点的分支因子。

B*树：B+树一种变形，它是在B+树的基础上，将索引层以指针连接起来，使搜索取值更加快捷。

二叉树的遍历
前序（Pre-order）：根-左-右 （树及其所有子树适用）
中序（In-order）：左-根-右  （树及其所有子树适用）
后序（Post-order）：左-右-根（树及其所有子树适用）
（区别在于根的位置）

# 前序遍历
public static void preOrderRecur(TreeNode head) {
    if (head == null) {
        return;
    }
    System.out.print(head.value + " ");
    preOrderRecur(head.left);
    preOrderRecur(head.right);
}
# 中序遍历
public static void preOrderRecur(TreeNode head) {
    if (head == null) {
        return;
    }
    preOrderRecur(head.left);
    System.out.print(head.value + " ");
    preOrderRecur(head.right);
}
# 后序遍历
public static void postOrderRecur(TreeNode head) {
    if (head == null) {
        return;
    }
    postOrderRecur(head.left);
    postOrderRecur(head.right);
    System.out.print(head.value + " ");
}
```
## 3. 堆，二叉堆
```
堆（Heap）：可以迅速找到一堆数中最大或者最小值的数据结构。(Wikepedia: Heap)

根节点最大的堆叫做大顶堆，根节点最小的堆叫做小顶堆。常见的堆有二叉堆，斐波那契堆等。

（大顶）堆的常见API有：

find-max: O(1)
delete-max: O(logN)
insert (create): O(logN) or O(1)
※ 二叉堆性质：1. 是一颗完全树。2. 树中任意系节点值总是 >= 其子节点的值。

二叉堆左右子节点索引计算方法：

根节点（顶堆元素）是：a[0]
对于任意一个节点 i，它的：
左子节点索引为 2i+1
右子节点索引为 2i+2
索引为 i 的父节点索引是 floor((i-1)/2)
堆的插入和删除
插入元素 O(logN)：将新元素放进最后一个空位的叶子节点，然后和它的父节点进行比较，如果大于/小于父节点，则将它与父节点进行交换。继续进行该操作直到不满足条件。（Sift Up）

删除堆顶元素 O(logN)：删除堆顶元素后，将堆尾元素替换到顶部，然后以此从根部下调整个堆的结构。（注意，若同时小于左右儿子，则需要和左右儿子中更大的一个进行交换）（Sift Down）

代码：[堆的实现](https://shimo.im/docs/Lw86vJzOGOMpWZz2/read)
```
## 4. 图
图：Graph(V, E)。顶点的属性：度（入度/出度）；边的属性：有向/无向、权重。

※ 图的表示：邻接矩阵；邻接表。

图的DFS递归：
图的BFS递归：
注意：图在dfs/bfs遍历时，一定要存visited矩阵（因为不像树，图可能存在环路）

图的高级算法：

连通图个数：[200. 岛屿数量](https://leetcode-cn.com/problems/number-of-islands/)

拓扑排序：[拓扑排序的实现方法以及环路检测](https://zhuanlan.zhihu.com/p/34871092)，[207 课程表](https://leetcode-cn.com/problems/course-schedule/)

最短路径：[Dijkstra](https://www.bilibili.com/video/av25829980?from=search&seid=13391343514095937158)

最小生成树：[Minimum Spanning Tree](https://www.bilibili.com/video/av84820276?from=search&seid=17476598104352152051)

## 题型记录：
Week01-Day08
两个数组的交集 II ：leetcode-350
https://leetcode-cn.com/problems/intersection-of-two-arrays-ii/

Week01-Day09
删除最外层的括号：leetcode-1021
https://leetcode-cn.com/problems/remove-outermost-parentheses/

Week01-Day10
TODO
滑动窗口的最大值：leetcode- 剑指 Offer 59 - I
https://leetcode-cn.com/problems/hua-dong-chuang-kou-de-zui-da-zhi-lcof/

Week01-Day11
Fizz Buzz：leetcode-412
https://leetcode-cn.com/problems/fizz-buzz/

Week01-Day12
各位相加：leetcode-258
https://leetcode-cn.com/problems/add-digits/

Week01-Day13


Week01-Day13






