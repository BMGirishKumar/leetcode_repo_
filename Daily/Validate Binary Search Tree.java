class Solution {
    public boolean isValidBST(TreeNode root) {
        return validate(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private boolean validate(TreeNode node, long min, long max) {
        if (node == null) {
            return true;
        }

        // Current node must fall strictly within the allowed range
        if (node.val <= min || node.val >= max) {
            return false;
        }

        // Left subtree must be < node.val; right subtree must be > node.val
        return validate(node.left, min, node.val) && 
               validate(node.right, node.val, max);
    }
}
