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
    public int getMinimumDifference(TreeNode root) {
        List<Integer>list=new ArrayList<>();
        tree(root,list);
        Collections.sort(list);
        int min=Integer.MAX_VALUE;
        for(int i=0;i<list.size()-1;i++){
             min=Math.min(min,Math.abs(list.get(i)-list.get(i+1)));
        }
        return min;
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