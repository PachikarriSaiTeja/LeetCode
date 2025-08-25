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
    List<Integer> ans = new ArrayList<>();
    public List<Integer> rightSideView(TreeNode root) {
        addVals(root);
        return ans;
        
    }
    public void addVals(TreeNode root)
    {
        if(root == null) return ;
        int cnt = 0;
        int data = 0;
    
        Queue<TreeNode> st = new LinkedList<>();
        
        st.add(root);
        int size  = st.size();
        while(!st.isEmpty())
        {

            TreeNode node = st.remove();
            cnt++;
            if(node.right!=null) st.add(node.right);
            if(node.left!=null) st.add(node.left);
            
            if(data == 0)
            {
                ans.add(node.val);
                data = 1;
            }
            if(size == cnt ){
               
                data = 0;
                size = st.size();
                cnt = 0;
            }

        }
        
    }
}