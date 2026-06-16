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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root == null){
            return new TreeNode(val);
        }

        TreeNode temp = root;

        while(true){
            if(val < temp.val){
                if(temp.left == null){
                    TreeNode k = new TreeNode();
                    temp.left = k;
                    k.val = val;
                    break;
                }
                temp = temp.left;
            }
            else{
                if(temp.right == null){
                    TreeNode k = new TreeNode();
                    temp.right = k;
                    k.val = val;
                    break;
                }
                temp = temp.right;
            }
        }

        return root;
    }
}