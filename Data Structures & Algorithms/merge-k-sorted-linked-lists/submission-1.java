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
    public ListNode mergeKLists(ListNode[] lists) {
       // ListNode dummy  =new ListNode(0);
       // ListNode prev = dummy;
        int n = lists.length;
        if (n == 0) {
            return null;
        }
        for(int i = 1 ; i < n ; i++){
         //   ListNode prev = lists[i-1] ;
          //  ListNode next = lists[i];
            lists[i] =  merge(lists[i-1] , lists[i]);
        }
        return lists[n-1];
    }
    public ListNode merge(ListNode prev, ListNode next){
        ListNode ans = new ListNode(0);
        ListNode dummy = ans;
        while(prev != null && next != null){
            // if(prev == null && next != null){
            //     dummy.next = next ;
            //     next = next.next ;
            //     dummy = dummy.next ;
            // }
            // else if(prev != null && next == null){
            //     dummy.next = prev ;
            //     prev = prev.next ;
            //     dummy = dummy.next ;
            // }
            if(prev.val > next.val){
                dummy.next = next ;
                dummy= dummy.next ;
                next = next.next ;
            }
            else{
                dummy.next = prev ;
                dummy = dummy.next ;
                prev = prev.next;
            }
        }
         if (prev != null) {
            dummy.next = prev;
        } 
        else {
            dummy.next = next;
        }
       return ans.next ;
    }
}
