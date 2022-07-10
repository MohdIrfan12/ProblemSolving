package scalar.tree;

public class NodesCount {

    public int solve(TreeNode A) {
        if (A == null) {
            return 0;
        }
        return traverse(A, 0);
    }

    private int traverse(TreeNode A, int count) {
        if (A == null) {
            return count;
        }
        int i = count + 1;
        int leftResult = traverse(A.left, i);
        return traverse(A.right, leftResult);
    }

    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
            left = null;
            right = null;
        }
    }
}
