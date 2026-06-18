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
    List<TreeNode> nodes = new ArrayList<>();

    public void inorder(TreeNode root) {
        if (root == null) return;

        inorder(root.left);
        nodes.add(root);
        inorder(root.right);
    }
    public boolean findTarget(TreeNode root, int k) {
        inorder(root);

        HashSet<Integer> set = new HashSet<>();

        for (TreeNode node : nodes) {
            int rem = k - node.val;

            if (set.contains(rem)) {
                return true;
            }

            set.add(node.val);
        }

        return false;
    }
}