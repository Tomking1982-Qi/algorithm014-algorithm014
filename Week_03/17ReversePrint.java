/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    ArrayList<Integer> tmp = new ArrayList<Integer>();
    
    public int[] reversePrint(ListNode head) {

        //3、直接反转链表，迭代被反转的链表，放入返回数组
        ListNode prev = null;
        ListNode curr = head;
        int j = 0;
        while (curr != null) {
            ListNode node = curr.next;
            curr.next = prev;
            prev = curr;
            curr = node;
            j++;
        }
        int[] res = new int[j];
        int i = 0;
        while (prev != null && i < j) {
            res[i++] = prev.val;
            prev = prev.next;
        }
        return res;
    }

    

    //1、利用Stack先进后出的特性 反转ListNode 
    // Stack<ListNode> stack = new Stack<ListNode>();
    // ListNode temp = head;
    // while (temp != null) {
    //     stack.push(temp);
    //     temp = temp.next;
    // }
    // int size = stack.size();
    // int[] print = new int[size];
    // for (int i = 0; i < size; i++) {
    //     print[i] = stack.pop().val;
    // }
    // return print;
    
    //2、递归调用head.next, 利用递归栈回溯的特性 得到反转后的值
    // recur(head);
    // int[] res = new int[tmp.size()];
    // for(int i = 0; i < res.length; i++)
    //     res[i] = tmp.get(i);
    // return res;

    // private void recur(ListNode head) {
    //     if(head == null) return;
    //     recur(head.next);
    //     tmp.add(head.val);
    // }

}
