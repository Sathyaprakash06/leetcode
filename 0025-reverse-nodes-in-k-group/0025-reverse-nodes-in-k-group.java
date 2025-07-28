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
    public ListNode reverseKGroup(ListNode head, int k) {
        ArrayList<Integer>list=new ArrayList<>();
        ListNode curr=head;
        while(curr!=null){
            list.add(curr.val);
            curr=curr.next;
        }
        for(int i=0;i<=list.size()-k;i+=k){
            Collections.reverse(list.subList(i,i+k));
        }
        ListNode dummy=new ListNode(0);
        ListNode dummy1=dummy;
        for(int i:list){
            dummy1.next=new ListNode(i);
            dummy1=dummy1.next;
        }
        return dummy.next;
    }
}