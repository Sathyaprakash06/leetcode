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
    public List<Integer> rightSideView(TreeNode root) {
       ArrayList<Integer>list=new ArrayList<>();
       if(root==null)
       return list;
       Queue<TreeNode>st=new LinkedList<>();
       st.add(root);
       while(!st.isEmpty()){
        int s=st.size();
        for(int i=0;i<s;i++){
            TreeNode s1=st.poll();
            if(i==s-1){
            list.add(s1.val);}
            if(s1.left!=null)
            st.add(s1.left);
            if(s1.right!=null)
            st.add(s1.right);}
        
       }
       return list;
        }
}