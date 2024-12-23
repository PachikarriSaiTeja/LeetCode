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
    List<Integer> l=new ArrayList<>();
    public int kthSmallest(TreeNode root, int k) {
        
        l= search(root,l);
        return l.get(k-1);
        
        
    }
    public List search(TreeNode root, List<Integer> l)
    {
        if(root==null)
        {
            return l;
        }
        search(root.left,l);
        l.add(root.val);
        search(root.right,l);
        return l;
    }
}