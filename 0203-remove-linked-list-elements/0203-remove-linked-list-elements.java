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
    public ListNode removeElements(ListNode head, int val) {
        List<Integer>list=new ArrayList<>();
        ListNode curr=head;
        while(curr!=null){
            list.add(curr.val);
            curr=curr.next;
        }
        ListNode s=new ListNode(0);
        ListNode s1=s;
        for(int i:list){
            if(i!=val){
                s1.next=new ListNode(i);
                s1=s1.next;
            }
        }
        return s.next;
    }
}