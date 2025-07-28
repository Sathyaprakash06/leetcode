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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        List<Integer>list=new ArrayList<>();
    ListNode curr=head;
    while(curr!=null){
        list.add(curr.val);
        curr=curr.next;
    }
    list.remove((list.size()-n));
    System.out.print(list);
    ListNode dummy=new ListNode(0);
    ListNode dum=dummy;
    for(int i:list){
        dum.next=new ListNode(i);
        dum=dum.next;
    }
    return dummy.next;
    }
}