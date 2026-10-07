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
    public int maxDepth(TreeNode root) {
        
        return func(root);
      //  return max ;
    }
    public int func(TreeNode root){
        if(root == null){
            return 0;
        }
        int x = 1 + func(root.left);
        int x2 = 1 + func(root.right );
        return Math.max(x , x2);
    }
}
