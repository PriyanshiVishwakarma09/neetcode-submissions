/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public void reorderList(ListNode head) {
        ListNode x = head ;
        Stack<ListNode> stk = new Stack<>();
        int i = 0 ;
        while(x != null){
            stk.push(x);
            x = x.next ; 
            i++;
        }
        ListNode curr = head ; 
        for(int q = 0 ; q< i/2 ; q++){
            ListNode p = curr.next ; 
            ListNode last = stk.pop();
            curr.next = last;
            last.next = p ; 
            curr = p ;
        }
        curr.next = null ;
    }
}
