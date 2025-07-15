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
    public List<List<Integer>> levelOrder(TreeNode root) {
       ArrayList<List<Integer>>list=new ArrayList<>(); 
       Queue< TreeNode > st=new LinkedList<>();
       if(root==null)
       return list;
       st.add(root);
       while(!st.isEmpty()){
        int s=st.size();
        ArrayList<Integer>list1=new ArrayList<>(); 
        for(int i=0;i<s;i++){
        TreeNode se=st.poll();
        list1.add(se.val);
        if(se.left!=null)
        st.add(se.left);
        if(se.right!=null)
        st.add(se.right);
        }
        list.add(list1);
       }
       return list;
    }
}