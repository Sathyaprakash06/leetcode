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
    public boolean findTarget(TreeNode root, int k) {
        List<Integer>list=new ArrayList<>();
        tree(root,list);
        for(int i=0;i<list.size();i++){
            int c=0;
            for(int j=i+1;j<list.size();j++){
                if(list.get(i)+list.get(j)==k){
                    return true;
                }
            }
        }
        return false;
    }
      public void tree(TreeNode root,List<Integer>list){
        if(root==null){
            return;
        }
        list.add(root.val);
        tree(root.left,list);
        tree(root.right,list);
    }
}