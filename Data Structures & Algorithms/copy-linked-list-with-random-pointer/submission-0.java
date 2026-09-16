/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Node curr = head ;
        while(curr != null){
            Node n = new Node(curr.val) ;
            n.next = curr.next ;
            curr.next = n ;
            curr = n.next ; 
        }
        curr = head ;
        while(curr != null){
            if(curr.random != null){
            //copy of the targeted random node(curr.random.next)
            curr.next.random = curr.random.next ;
            }
            curr = curr.next.next ;
        }
        Node dummy = new Node(0);
        Node ans = dummy ;
        Node c = head ;
        while(c != null){
            ans.next = c.next ;
            c.next = c.next.next ;

            ans= ans.next ;
            c = c.next ;
        }
        return dummy.next ;
    }
}
