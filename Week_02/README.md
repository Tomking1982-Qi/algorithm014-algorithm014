# 解题步骤 (覃超老师)
1、Clarificaiton（了解清楚题目意思及必要的交流）
2、Possible solution -> Optimal (Time & Space)
3、Code （写出最佳解答）
4、Test (多case 测试)

## 心得体会：
参加训练营两个礼拜了快（加上之前一个礼拜的网课），感觉自己还是进步蛮大的。虽然还不能独立完成一些生疏的题目。不过对已有的题目理解和记忆还是比以前好多了。这里非常感谢覃超老师给我们分享的解题思路（方法论），特别是五毒神掌，真得非常神奇。在这周的学习中，特别感觉到每道题的解题思路非常重要，掌握了解题思路等于掌握了解题的命脉；其次对于自己会做题目中出现的关键代码语句的深刻理解（期间有比较、优化、画图），也非常有助于深刻记忆和掌握理解相关提醒。加油！！！
总之，五毒神掌 + 脑图 + 示图分析（自己推敲或者画出来，或者优秀题解分析的示例）是自己刷题是否有成效的关键

## Tips:
 哈希表，映射，集合（实现与特性）
哈希表：也叫散列表，根据关键码值直接进行访问的数据结构。通过把关键码值映射到表中一个位置来访问记录。这个映射函数叫散列函数（Hash Function），存放记录的数组叫做哈希表（散列表）。

具体来讲，hash(key) = value在内存中的地址，直接访问该地址即可得到value。

※ 哈希碰撞：当不同key得到的hash值相同时，同一个内存地址对应多个value，就产生了哈希碰撞。

※ 哈希碰撞的解决方法：拉链式解决冲突法，将value在内存中储存的值改成一个链表，第一个值存在链表第1级，第二个碰撞的值存在链表第2级。

哈希表的查找/插入/删除时间复杂度皆为O(1)

2. 树，二叉树，二叉搜索树
加速数据结构的关键在于升维（比如链表->跳表）

树：就相当于是一个二维的链表，每个节点除了自己，都指向另外的两个元素。

※ 树和图的区别：如果有环，按照定义就不称为树，但可以是图。

※ 可以说，链表是特殊的树，树是特殊的图。

二叉树：每个节点有至多2个分叉的树。

满二叉树（Full Binary Tree）：A binary tree T is full if each node is either a leaf or possesses exactly two child nodes.

完全二叉树（Complete Binary Tree）：A binary tree T with n levels is complete if all levels except possibly the last are completely full,and the last level has all its nodes to the left side. 深度为K的完全二叉树，每个叶节点的深度只能为K或K-1，且要么只缺失右孩子或者左右孩子都缺失

（把一颗二叉树按照从上到下，从左到右的顺序构建，就是一个完全二叉树）

完美二叉树（Perfect Binary Tree）：A binary tree with all leaf nodes at the same depth. All internal nodes have degree 2.

二叉搜索树：又叫二叉排序树、二叉查找树、有序二叉树（Ordered Binary Tree）、排序二叉树（Sorted Binary Tree），是指一颗空树或者具有下列性质的二叉树：

左子树上所有节点的值均小于它的根节点的值；
右子树上所有节点的值均大于它的根节点的值；
以此类推：左右子树也分别是二叉搜索树
※ 二叉搜索树特性：中序遍历为升序排列；访问、查找、插入、删除都是 $O(\log{n})$ 的复杂度

※ 二叉搜索树Demo：https://visualgo.net/zh/bst

其它树结构：

AVL树（平衡二叉树）：最先发明的自平衡的二叉搜索树。

红黑树：许多“平衡“搜索树中的一种， 可以保证在最坏情况下基本动态集合操作的时间复杂度为O(lgN)。

B树：B树与红黑树的不同之处在于B 树的结点可以有很多孩子，从数个到数于个。

B+树：一个常见的B树变种，它把所有的卫星数据都存储在叶结点中，内部结点只存放关键字和孩子指针，因此最大化了内部结点的分支因子。

B*树：B+树一种变形，它是在B+树的基础上，将索引层以指针连接起来，使搜索取值更加快捷。

二叉树的遍历
前序（Pre-order）：根-左-右
中序（In-order）：左-根-右
后序（Post-order）：左-右-根
（区别在于根的位置）

# 前序遍历

# 中序遍历

# 后序遍历

3. 堆，二叉堆
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

代码：堆的实现

4. 图
图：Graph(V, E)。顶点的属性：度（入度/出度）；边的属性：有向/无向、权重。

※ 图的表示：邻接矩阵；邻接表。

图的DFS递归：

visited = set()

def dfs(node, visited):
    # Terminator
    if node in visited: 
        # already visited
        return
   	visited.add(node)
    
    # Process current node
    ...
    for next_node in node.children():
        if not next_node in visited:
            dfs(next_node, visited)
图的BFS递归：

def bfs(graph, start, end):
    
    queue = []				# 借助队列来实现BFS递归
    queue.append([start])	# 初始情况，把start节点加入队列
    
    visited = set()			
    
    while queue:
        node = queue.pop()
        visited.add(node)
        
        process(node)
        nodes = generate_related_nodes(node)
        queue.push(nodes)
注意：图在dfs/bfs遍历时，一定要存visited矩阵（因为不像树，图可能存在环路）

图的高级算法：

连通图个数：200. 岛屿数量

拓扑排序：拓扑排序的实现方法以及环路检测，207. 课程表

最短路径：Dijkstra

最小生成树：Minimum Spanning Tree

## 题型记录：
Week01-Day01
爬楼梯：leetcode-70
https://leetcode-cn.com/problems/climbing-stairs/

Week01-Day02
加一：leetcode-66
https://leetcode-cn.com/problems/plus-one/

Week01-Day03
两数之和：leetcode-1
https://leetcode-cn.com/problems/two-sum/

Week01-Day04
两两交换链表中的节点：leetcode-24
https://leetcode-cn.com/problems/swap-nodes-in-pairs

Week01-Day05
合并两个有序链表：leetcode-21
https://leetcode-cn.com/problems/merge-two-sorted-lists/

Week01-Day06
猜数字游戏：leetcode-299
https://leetcode-cn.com/problems/bulls-and-cows/





