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
    public TreeNode deleteNode(TreeNode root, int key) {
        TreeNode x = root ;
        if(key == 0){
            return x ; 
        }
       return func(x , key); 
    }
    public TreeNode func(TreeNode root , int key){
        if(root == null){
            return root;
        }
        if(root.val < key){
            root.right = func(root.right , key);
        }
        else if(root.val > key){
            root.left = func(root.left , key);
        }
        else {
            if (root.left == null) {
                return root.right;
            }

            if (root.right == null) {
                return root.left;
            }

            TreeNode successor = root.right;

            while (successor.left != null) {
                successor = successor.left;
            }

            root.val = successor.val;

            root.right = deleteNode(root.right, successor.val);
        }
        return root ;
    }
}