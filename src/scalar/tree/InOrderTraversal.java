package scalar.tree;

import java.util.*;

public class InOrderTraversal {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        System.out.println(inorderTraversal(root).toString());
        System.out.println(preTraversal(root).toString());
        System.out.println(postTraversal(root).toString());
        System.out.println(height(root,0));
    }

    private static ArrayList<Integer> inorderTraversal(TreeNode node) {
        ArrayList<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        while (node != null || stack.size() > 0) {
            while (node != null) {
                stack.push(node);
                node = node.left;
            }
            node = stack.pop();
            list.add(node.val);
            node = node.right;
        }
        return list;
    }

    private static ArrayList<Integer> preTraversal(TreeNode node) {
        ArrayList<Integer> list = new ArrayList<>();
        if (node == null) {
            return list;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(node);
        while (!stack.isEmpty()) {
            node = stack.pop();
            list.add(node.val);
            if (node.right != null) {
                stack.push(node.right);
            }
            if (node.left != null) {
                stack.push(node.left);
            }
        }
        return list;
    }

    private static ArrayList<Integer> postTraversal(TreeNode node) {
        ArrayList<Integer> list = new ArrayList<>();
        if (node == null) {
            return list;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(node);
        while (!stack.isEmpty()) {
            node = stack.pop();
            list.add(node.val);
            if (node.left != null) {
                stack.push(node.left);
            }
            if (node.right != null) {
                stack.push(node.right);
            }
        }
         Collections.reverse(list);
        return list;
    }

    private static int height(TreeNode node,int height) {
        if (node == null) {
            return height;
        }
        int heigh = height+1;
        int leftHeight = height(node.left,heigh);
        int rightHeight = height(node.right,heigh);
        return Math.max(leftHeight,rightHeight);
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
