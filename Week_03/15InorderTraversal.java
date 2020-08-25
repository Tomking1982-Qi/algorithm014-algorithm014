/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> inorderList = new  ArrayList<Integer>();
        helper(root, inorderList);
        return inorderList;

        // if (root == null) {
        //     return inorderList;
        // }
        // Stack<TreeNode> stack = new Stack<>();
        // while (!stack.isEmpty() || root != null) {
        //     if (root != null) {
        //         stack.push(root);
        //         root = root.left;
        //     } else {
        //         TreeNode node = stack.pop();
        //         inorderList.add(node.val);
        //         root = node.right;
        //     }
        // }
        // return inorderList;


        // List<Integer> inorderList = new  ArrayList<Integer>();
        // if (root == null) {
        //     return inorderList;
        // }
        // Stack<TreeNode> stack = new Stack<>();
        // while (!stack.isEmpty() || root != null) {
        //     if (root != null) {
        //         stack.push(root);
        //         root = root.left;
        //     } else {
        //         root = stack.pop();
        //         inorderList.add(root.val);
        //         root = root.right;
        //     };
        // }
        // return inorderList;
    }

    private void helper(TreeNode node, List<Integer> list) {
        if (node == null) {
            return;
        }
        helper(node.left, list);
        list.add(node.val);
        helper(node.right, list);
    }
}
