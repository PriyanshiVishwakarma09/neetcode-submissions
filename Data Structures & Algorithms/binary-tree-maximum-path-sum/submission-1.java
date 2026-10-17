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
    int max = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        func(root);
        return max ;        
    }
    public int func(TreeNode root){
        if(root == null){
            return 0; 
        }
        int left = func(root.left);
        int right = func(root.right);
        left = Math.max(0 , left);
        right = Math.max(0 , right);
       // if(left != Integer.MIN_VALUE && right != Integer.MIN_VALUE){
            max = Math.max(max , root.val + left + right);
        // }
    
      
        return root.val + Math.max(right , left);
    }
}
