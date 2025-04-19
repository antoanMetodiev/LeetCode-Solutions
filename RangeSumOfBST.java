import java.util.ArrayDeque;
import java.util.Deque;

public class RangeSumOfBST {

    // Binary Tree Node:
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public int rangeSumBST(TreeNode root, int low, int high) {
        if (root == null) return 0;

        int rangeSum = 0;
        Deque<TreeNode> stack = new ArrayDeque<>();
        stack.push(root);

        while (!stack.isEmpty()) {

            TreeNode currentEl = stack.pop();

            if (currentEl.val >= low && currentEl.val <= high) {
                rangeSum += currentEl.val;
            }

            if (currentEl.left != null && currentEl.val > low) {
                stack.push(currentEl.left);
            }

            if (currentEl.right != null && currentEl.val < high) {
                stack.push(currentEl.right);
            }
        }

        return rangeSum;
    }
}