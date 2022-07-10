package scalar.tree;

import java.util.Stack;

public class IdenticalBinaryTrees {

    public static void main(String[] args) {

//        TreeNode root = new TreeNode(1);
//        root.left = new TreeNode(2);
//        root.right = new TreeNode(3);
//        root.left.left = new TreeNode(4);
//        root.left.right = new TreeNode(5);
//
//        TreeNode root2 = new TreeNode(1);
//        root2.left = new TreeNode(2);
//        root2.right = new TreeNode(3);
//        root2.left.left = new TreeNode(4);
//        root2.left.right = new TreeNode(5);
//        System.out.println(isSameTree(root, root2));

        TreeNode root = new TreeNode(0);
        TreeNode root2 = new TreeNode(0);
        System.out.println(isSameTree(root, root2));
    }

    private static int isSameTree(TreeNode A, TreeNode B) {
        if (A == null && B == null){
            return 1;
        }
        else if ( A == null && B != null || A != null && B == null) {
            return 0;
        }
        Stack<TreeNode> stack1 = new Stack<>();
        stack1.push(A);
        Stack<TreeNode> stack2 = new Stack<>();
        stack2.push(B);

        while (!stack1.isEmpty() && !stack2.isEmpty()) {
            A = stack1.pop();
            B = stack2.pop();
            if (A.val != B.val) {
                return 0;
            }
            if (A.left != null) {
                stack1.push(A.left);
            }
            if (A.right != null) {
                stack1.push(A.right);
            }
            if (B.left != null) {
                stack2.push(B.left);
            }
            if (B.right != null) {
                stack2.push(B.right);
            }
        }
        if (stack1.isEmpty() && stack2.isEmpty() || stack1.size()==stack2.size() && stack1.pop().val==stack2.pop().val) {
            return 1;
        } else {
            return 0;
        }
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
