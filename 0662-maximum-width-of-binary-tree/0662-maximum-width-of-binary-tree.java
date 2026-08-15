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
    public int widthOfBinaryTree(TreeNode root) {

        if (root == null) return 0;

        Queue<Pair<TreeNode, Integer>> q = new LinkedList<>();

        q.offer(new Pair<>(root, 0));

        int wid = 0;

        while (!q.isEmpty()) {

            int l = q.peek().getValue();
            int r = 0;

            int n = q.size();

            for (int i = 0; i < n; i++) {

                Pair<TreeNode, Integer> p = q.poll();

                TreeNode cur = p.getKey();
                int ind = p.getValue();

                r = ind;

                if (cur.left != null) {
                    q.offer(new Pair<>(cur.left, 2 * ind + 1));
                }

                if (cur.right != null) {
                    q.offer(new Pair<>(cur.right, 2 * ind + 2));
                }
            }

            wid = Math.max(wid, r - l + 1);
        }

        return wid;
    }
}