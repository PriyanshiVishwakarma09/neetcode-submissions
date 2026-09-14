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
    public boolean hasCycle(ListNode head) {
        ListNode curr = head ;
        ListNode curr2 = head;
        while(curr2 != null && curr2.next != null){
            curr = curr.next ;
            curr2 = curr2.next.next ;
            if(curr == curr2){
                return true ;
            }
        }
        return false ;
    }
}
