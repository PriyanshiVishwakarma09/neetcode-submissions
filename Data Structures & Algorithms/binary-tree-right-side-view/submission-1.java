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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root == null){
            return list;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int x = q.size();
            for(int i = 0 ; i < x ; i++){
                TreeNode p = q.poll();
                if(i == x-1){
                    list.add(p.val);
                }
                if(p.left != null){
                    q.offer(p.left);
                }
                if(p.right != null){
                    q.offer(p.right);
                }
            }
        }
        return list ;
        }
}
