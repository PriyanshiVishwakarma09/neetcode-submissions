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
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> list = new ArrayList<>();
        func(list , root);
        Collections.sort(list);
        return list.get(k-1);
    }
    public void func(List<Integer> list , TreeNode root){
        if(root == null){
            return ;
        }
        list.add(root.val);
        func(list , root.left);
        func(list , root.right);
    }
}
