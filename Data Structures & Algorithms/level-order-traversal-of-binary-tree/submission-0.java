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
    public List<List<Integer>> levelOrder(TreeNode root) {
     //   List<Integer> list = new ArrayList<>();
        List<List<Integer>> list= new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        if(root == null){
            return list ;
        }
      //  int i = 1 ;
        while(!q.isEmpty()){
            ArrayList<Integer> ans = new ArrayList<>();
            int l = q.size() ;
            while(l > 0){
                TreeNode p = q.poll();
            //   list.add(p.val);
                ans.add(p.val);
                if(p.left != null){
                    q.offer(p.left);
                  
                }
                if(p.right != null){
                    q.offer(p.right);
               //     ans.add(p.right.val);
                }
                l--;
            }
           
            list.add(ans);
        }
      
        return list;
    }
}
