/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    boolean ans = true ;
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q != null || p != null && q == null){
            return false ;
        }
        func(p , q);
        return ans ;
    }
    public void func(TreeNode p , TreeNode q){
        if(p == null || q == null){
            return ;
        }
        if(p.val != q.val){
            ans = false;
        }
        else if(p.left == null && q.left != null || p.left != null && q.left == null || p.right == null && q.right != null || p.right != null && q.right == null){
            ans= false;
        }
        func(p.left , q.left);
        func(p.right , q.right);
    }

}
