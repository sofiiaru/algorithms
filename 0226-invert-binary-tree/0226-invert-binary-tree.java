/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode invertTree(TreeNode root) {
        if(root == null) return null;

        // if(root.left != null && root.right != null) {
        //     TreeNode temp = root.left;
        //     root.left = root.right;
        //     root.right = temp;
        // } else return root;
        TreeNode invertedLeftSubtree = invertTree(root.left);
        TreeNode invertedRightSubtree = invertTree(root.right);

        root.left = invertedRightSubtree;
        root.right = invertedLeftSubtree;

        return root;       
    }
}