class Solution {

    List<TreeNode> nodes = new ArrayList<>();

    public void inorder(TreeNode root) {
        if (root == null) return;

        inorder(root.left);
        nodes.add(root);
        inorder(root.right);
    }

    public void recoverTree(TreeNode root) {

        inorder(root);

        List<Integer> vals = new ArrayList<>();

        for (TreeNode node : nodes) {
            vals.add(node.val);
        }

        List<Integer> sorted = new ArrayList<>(vals);
        Collections.sort(sorted);

        for (int i = 0; i < nodes.size(); i++) {
            nodes.get(i).val = sorted.get(i);
        }
    }
}