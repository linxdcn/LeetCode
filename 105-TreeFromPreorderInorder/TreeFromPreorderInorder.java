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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder == null || inorder == null || preorder.length != inorder.length || preorder.length == 0) return null;
        return helper(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);
    }
    
    public TreeNode helper(int[] preorder, int preStart, int preEnd, int[] inorder, int inStart, int inEnd) {
        if (preStart > preEnd) return null;
        if (preStart == preEnd) return new TreeNode(preorder[preStart]);
        int head = preorder[preStart];
        TreeNode result = new TreeNode(head);
        int inHead = inStart;
        while (inorder[inHead] != head) {
            inHead++;
        }
        int leftCount = inHead - inStart;
        int rightCount = inEnd - inHead;
        if (leftCount > 0)
            result.left = helper(preorder, preStart + 1, preStart + leftCount, inorder, inStart, inStart + leftCount - 1);
        if (rightCount > 0)
            result.right = helper(preorder, preStart + 1 + leftCount, preStart + leftCount + rightCount, inorder, inHead + 1, inHead + rightCount);
        return result;
    }
}
