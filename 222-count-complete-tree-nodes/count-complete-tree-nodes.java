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
    public void inorder(TreeNode root,ArrayList<TreeNode> ans){
        
        if(root==null) return;

        ans.add(root);
        
        inorder(root.left,ans);
        inorder(root.right,ans);
    }
    public int countNodes(TreeNode root) {
       ArrayList<TreeNode> ans = new ArrayList<>();
       inorder(root,ans);
        return ans.size(); 
    }
}