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
    public boolean isBalanced(TreeNode root) {
        if(root==null)return true;
        int lh=hg(root.left);
        int rh=hg(root.right);
         if (Math.abs(lh - rh) > 1) return false;
return isBalanced(root.left) && isBalanced(root.right);
    }
    public int hg(TreeNode root){
        if(root==null)return 0;
        int l=hg(root.left);
        int r=hg(root.right);
        return 1+Math.max(l,r);
    }
}