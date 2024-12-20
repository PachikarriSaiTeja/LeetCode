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
    public void rec(TreeNode root,List<Integer> a)
    {
        if(root!=null)
        {
            rec(root.left,a);
            a.add(root.val);
            rec(root.right,a);
        }
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> a=new ArrayList<>();
        rec(root,a);
        return a;
    }
}