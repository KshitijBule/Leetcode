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

    Map<TreeNode, TreeNode> parent = new HashMap<>();
    List<Integer> ans = new ArrayList<>();

    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {

        buildParent(root, null);

        Set<TreeNode> visited = new HashSet<>();

        dfs(target, 0, k, visited);

        return ans;
    }

    private void buildParent(TreeNode node, TreeNode par) {
        if (node == null) return;

        parent.put(node, par);

        buildParent(node.left, node);
        buildParent(node.right, node);
    }

    private void dfs(TreeNode node, int dist, int k,
                     Set<TreeNode> visited) {

        if (node == null || visited.contains(node))
            return;

        visited.add(node);

        if (dist == k) {
            ans.add(node.val);
            return;
        }

        dfs(node.left, dist + 1, k, visited);
        dfs(node.right, dist + 1, k, visited);
        dfs(parent.get(node), dist + 1, k, visited);
    }
}