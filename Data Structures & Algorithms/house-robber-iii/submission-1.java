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
    public int rob(TreeNode root) {
        HashMap<TreeNode, int[]> dp = new HashMap<>();
         return func(root , 0 , dp);
    }
    public int func(TreeNode root , int chance , HashMap<TreeNode , int[]> dp){
        if(root == null){
            return 0;
        }
        if (dp.containsKey(root) && dp.get(root)[chance] != -1) {
            return dp.get(root)[chance];
        }
        dp.putIfAbsent(root, new int[]{-1, -1});
        int pick = 0 ;
        int notpick = 0 ;
        if(chance == 0){
           // if(root.left != null){
                pick = root.val + func(root.left , 1 , dp) + func(root.right , 1 , dp);
                notpick = func(root.left , 0 , dp) + func(root.right , 0 , dp);
      
           // if(root.right != null){
        //         pick = root.val + func(root.right , 1);
        //         notpick = func(root.right , 0);
        //     }
         }
        else{
           // if(root.left != null){
              //  pick = root.val + func(root.left , 1);
                notpick = func(root.left , 0 , dp) + func(root.right , 0 , dp);
         //   }
         //   if(root.right != null){
               // pick = root.val + func(root.right , 1);
           //     notpick = func(root.right , 0);
          //  }
        }
        int x = Math.max(pick , notpick) ;
        dp.get(root)[chance] = x;
        return x;
    }
}