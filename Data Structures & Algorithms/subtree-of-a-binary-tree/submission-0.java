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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        return isSub(root , subRoot);
    }
    public boolean isSub(TreeNode r , TreeNode t){
        if(t == null){
            return true ;
        }
        if(r == null){
            return false;
        }
        if(isSame(r , t)){
            return true ;
        }
        return isSub(r.left , t) || isSub(r.right , t);
    }
    public boolean isSame(TreeNode r , TreeNode t){
        if(r == null && t == null){
            return true ;
        }
        if(r != null && t != null && r.val == t.val){
            return isSame(r.left , t.left) && isSame(r.right , t.right) ;
        }

       return false ;
        }
}
