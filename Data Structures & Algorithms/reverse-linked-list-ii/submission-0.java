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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || left == right) return head;
        ListNode ans = new ListNode(0);
        ans.next = head;
        ListNode prev = ans ;
        int i = 1 ;
        while(i < left){
           prev = prev.next ;
           i++ ;
        }
     //   return ans.next ;
        int p = right - left ;
        ListNode curr = prev.next ;
        while(p > 0){
            ListNode front = curr.next ;
            curr.next = front.next ;
            front.next = prev.next ;
            prev.next = front ;
            p--;
        }
        return ans.next;
    }
}