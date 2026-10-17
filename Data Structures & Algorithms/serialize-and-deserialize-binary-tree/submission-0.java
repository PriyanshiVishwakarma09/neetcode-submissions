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


public class Codec {
    int idx = 0;

    public String serialize(TreeNode root) {
        StringBuilder ans = new StringBuilder();
        func(root, ans);
        return ans.toString();
    }

    public void func(TreeNode root, StringBuilder ans) {
        if (root == null) {
            ans.append("# ");
            return;
        }

        ans.append(root.val).append(" ");

        func(root.left, ans);
        func(root.right, ans);
    }

    public TreeNode deserialize(String data) {
        idx = 0;

        String[] arr = data.split(" ");
        return func2(arr);
    }

    public TreeNode func2(String[] arr) {
        if (arr[idx].equals("#")) {
            idx++;
            return null;
        }

        TreeNode root = new TreeNode(Integer.parseInt(arr[idx]));
        idx++;

        root.left = func2(arr);
        root.right = func2(arr);

        return root;
    }
}
