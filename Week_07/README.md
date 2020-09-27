# 解题步骤 (覃超老师)
1、Clarificaiton（了解清楚题目意思及必要的交流）

2、Possible solution -> Optimal (Time & Space)

3、Code （写出最佳解答）

4、Test (多case 测试)

## 心得体会：

```
本周更新
1、主要复习了最近一周已做题目
2、DP问题思路：就是找最优子结构（在分治得到子问题基础之上寻找最优子问题后，归纳为DP方程（比传统递归和分治，时间和空间复杂度都大大降低））
3、DP问题实现：最优子结构 到 对应的动态方程 或是 递推方程。
4、DP问题还是比较难的，特别是对dp方程的推敲和论证过程。这就需要大量的练习和思维导图配合，多练习多记忆。加油吧！

```

## Tips:

```

```

### 字典树:

```
1、字典树的数据结构：
字典树，即Trie树，又称单词查找树或键树，是一种树形结构。典型应用是用户统计和排序大量的字符串（但不仅限于字符串），所以经常被搜索引擎系统用于文本词频统计
它的优点是：最大限度地减少无谓的字符串比较，查询效率比哈希表高。

2、字典树的核心思想
a、Trie树的核心思想是空间换时间
b、利用字符串的公共前缀来降低查询时间的开销以达到提高效率的目的

3、字典树的基本性质
a、结点本身不存完整单词；
b、从根结点到某一结点，路径上经过的字符连接起来，为该结点对应的字符串；
c、每个结点的所有子结点路径代表的字符都不相同

4、字典树模板: https://shimo.im/docs/DP53Y6rOwN8MTCQH/read

    private boolean isEnd;
    private Trie[] next;
    /** Initialize your data structure here. */
    public Trie() {
        next = new Trie[26];
        isEnd = false;
    }
    
    /** Inserts a word into the trie. */
    public void insert(String word) {
        if (word == null || word.length() ==0) {
            return;
        }
        Trie curr = this;
        char[] words = word.toCharArray();
        for (int i = 0; i < words.length; i++) {
            int n = words[i] - 'a';
            if (curr.next[n] == null) {
                curr.next[n] = new Trie();
            }
            curr = curr.next[n];
        }
        curr.isEnd = true;
    }
    
    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        Trie node = searchPrefix(word);
        return node != null && node.isEnd;
    }
    
    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        Trie node = searchPrefix(prefix);
        return node != null;
    }

    private Trie searchPrefix(String word) {
        Trie node = this;
        char[] words = word.toCharArray();
        for (int i = 0;i < words.length;i++) {
            node = node.next[words[i] - 'a'];
            if (node == null) {
                return null;
            }
        }
        return node;
    }
```

### 并查集:(Disjoint Set)

```
1、场景？
a、组团配对问题
b、Group or not?

2、基本操作：
a、makeSet(s): 建立一个新的并查集，其中包含s个单元素集合。
b、unionSet(x, y):把元素x和元素y所在的集合合并，要求x和y所在的集合不相交，如果相交则不合并。
c、find(x): 找到元素x所在的集合的代表，该操作也可以用于判断两个元素是否位于同一个集合，只要将它们各自的代表比较一下就可以了。

3、并查集模板：https://shimo.im/docs/VtcxL0kyp04OBHak/read
class UnionFind { 
	private int count = 0; 
	private int[] parent; 
	public UnionFind(int n) { 
		count = n; 
		parent = new int[n]; 
		for (int i = 0; i < n; i++) { 
			parent[i] = i;
		}
	} 
	public int find(int p) { 
		while (p != parent[p]) { 
			parent[p] = parent[parent[p]]; 
			p = parent[p]; 
		}
		return p; 
	}
	public void union(int p, int q) { 
		int rootP = find(p); 
		int rootQ = find(q); 
		if (rootP == rootQ) return; 
		parent[rootP] = rootQ; 
		count--;
	}
}


Free Note:
感触：
a、人肉递归低效、很累
b、找到最近最简方法，将其拆解成可重复解决的问题
c、数学归纳法思维（抵制人肉递归）
d、本质：寻找重复性 -> 计算机指令集（if else, while、 for loop、 recursion等）

```


## 题型列表：
```

```

分治模板：
https://shimo.im/docs/zvlDqLLMFvcAF79A/read

递归模板：
https://shimo.im/docs/EICAr9lRPUIPHxsH/read

Tire 树代码模板:
https://leetcode-cn.com/problems/implement-trie-prefix-tree/


## 题型记录：
Week06-Day43
搜索二维矩阵 II : leetcode-240
https://leetcode-cn.com/problems/implement-trie-prefix-tree/


Week06-Day44
实现 Trie (前缀树): leetcode-208
https://leetcode-cn.com/problems/implement-trie-prefix-tree/


Week06-Day45
被围绕的区域: leetcode-130
https://leetcode-cn.com/problems/surrounded-regions/


Week06-Day46
乘积最大子数组: leetcode-152
https://leetcode-cn.com/problems/maximum-product-subarray/


Week06-Day47
单词接龙 II: leetcode-126
https://leetcode-cn.com/problems/word-ladder-ii/

Week06-Day48
最接近的三数之和: leetcode-16
https://leetcode-cn.com/problems/3sum-closest/

Week06-Day49
括号生成: leetcode-22
https://leetcode-cn.com/problems/generate-parentheses/






