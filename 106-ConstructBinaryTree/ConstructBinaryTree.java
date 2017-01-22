/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if (inorder == null || postorder == null || inorder.length == 0 || postorder.length == 0) {
            return null;
        }
        return help(inorder, 0, inorder.length - 1, postorder, 0, postorder.length - 1);
    }
    
    public TreeNode help(int[] inorder, int startIn, int endIn, int[] postorder, int startPost, int endPost) {
        int rootIn = startIn;
        while (inorder[rootIn] != postorder[endPost]) {
            rootIn++;
        }
        int leftCount = rootIn - startIn;
        int rightCount = endIn - rootIn;
        TreeNode root = new TreeNode(inorder[rootIn]);
        if (leftCount > 0) {
            root.left = help(inorder, startIn, startIn + leftCount - 1, postorder, startPost, startPost + leftCount - 1);
        }
        if (rightCount > 0) {
            root.right = help(inorder, rootIn + 1, rootIn + rightCount, postorder, startPost + leftCount, startPost + leftCount + rightCount - 1);
        }
        return root;
    }
}
