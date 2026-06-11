/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean func(TreeNode root, List<TreeNode> ans, TreeNode x){
        if(root == null){
            return false;
        }
        ans.add(root);
        if(x==root) return true;
        if(func(root.left,ans,x) || func(root.right,ans,x)) return true;

        ans.remove(ans.size()-1);
        return false;
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        List<TreeNode> a = new ArrayList<>();
        List<TreeNode> b = new ArrayList<>();

        func(root, a, p);
        func(root, b, q);

        TreeNode ans = null;

        int i = 0;

        while(i < a.size() && i < b.size()) {

            if(a.get(i) == b.get(i))
                ans = a.get(i);
            else
                break;

            i++;
        }

        return ans;
    }
}