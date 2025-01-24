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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        ArrayList<Integer> ar=new ArrayList<>();
        ArrayList<Integer> br=new ArrayList<>();
        postorder(p,ar);
        postorder(q,br);
        System.out.println(ar);
         System.out.println(br);

        return ar.equals(br);
        
    }
   void postorder(TreeNode p,ArrayList<Integer> ar){
                if(p==null)
        {
            ar.add(null);
            return;
        }
        postorder(p.left,ar);
        postorder(p.right,ar);
        ar.add(p.val);

    }
}