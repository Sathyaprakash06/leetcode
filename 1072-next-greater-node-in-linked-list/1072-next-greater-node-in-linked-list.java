/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nextLargerNodes(ListNode head) {
        List<Integer>list=new ArrayList<>();
    ListNode curr=head;
    while(curr!=null){
        list.add(curr.val);
        curr=curr.next;
    }
    int[]arr=new int[list.size()];
    int n=0;
    
    for(int i=0;i<list.size();i++){
        for(int j=i+1;j<list.size();j++){
            if(list.get(i)<list.get(j)){
            arr[i]=list.get(j);
            break;
            }
        }
    }
    return arr;
    }
}