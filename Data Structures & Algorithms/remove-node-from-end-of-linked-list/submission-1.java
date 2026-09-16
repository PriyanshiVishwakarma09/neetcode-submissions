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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode curr = head ;
        int i = 0 ; 
        while(curr != null){
            curr = curr.next ;
            i++;
        }
        int p = i - n + 1 ;
        int x =  1;
        if(i == 1){
            return curr ; 
        }
        ListNode ans = new ListNode(0);
        ListNode dummy = ans ;
        ListNode s = head;
        for(int q = 1 ; q <= p ; q++){
            if(q == p){
                dummy.next = s.next ; 
                break;
               // s = s.next.next ;
                
            }
            else{
                dummy.next = s ; 
                s = s.next ;
            }
            dummy = dummy.next ; 
        }
        return ans.next ; 


    }
}
