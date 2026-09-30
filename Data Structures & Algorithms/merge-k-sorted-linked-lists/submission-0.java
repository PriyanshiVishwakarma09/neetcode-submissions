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
        ArrayList<Integer> list = new ArrayList<>();
        for(ListNode x : lists){
            ListNode temp = x ;
            while(temp != null){
                list.add(temp.val);
                temp = temp.next ; 
            }
        }
        Collections.sort(list);
        ListNode ans = new ListNode(0);
        ListNode dummy = ans ;
        for(int x : list){
            ListNode p = new ListNode(0) ;
            p.val = x ;
            dummy.next = p ; 
            dummy = dummy.next ;
        }
        return ans.next ;
    }
}
