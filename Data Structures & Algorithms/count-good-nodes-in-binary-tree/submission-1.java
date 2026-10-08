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
    public int goodNodes(TreeNode root) {
        if(root == null){
            return 0 ;
        }
        return func(root , Integer.MIN_VALUE);
      //  return count ;
    }
    public int func(TreeNode root, int prev){
        if(root == null){
            return 0;
        }
        int count = 0 ;
        if(root.val >= prev){
            count = 1 ;
            prev = root.val ; 
        }
        count += func(root.left , prev);
        count += func(root.right , prev);
        return count ;
    }
}
