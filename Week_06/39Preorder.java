/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<Integer> preorder(Node root) {
        List<Integer> preorderList = new ArrayList<Integer>();
        if (root == null ) {
            return preorderList;
        }
        
        helper(root, preorderList);
        return preorderList;
    }
    private void helper(Node root, List<Integer> res) {
        //if (root == null) return;
        res.add(root.val);
        for (Node node : root.children) {
            helper(node, res);
        }
    }


    // private void getPreorder(Node root, List<Integer> preorderList) {
    //     Stack<Node> nodeStack = new Stack<Node>();
    //     nodeStack.push(root);
    //     while(!nodeStack.isEmpty()) {
    //         Node node = nodeStack.pop();
    //         preorderList.add(node.val);
    //         List<Node> children = root.children;
    //         if ( children!= null && children.size() > 0) {
    //             for (int i = 0; i < children.size(); i ++) {
    //                 getPreorder(children.get(i), preorderList);  
    //             }    
    //         }
    //     }
    // }
}
