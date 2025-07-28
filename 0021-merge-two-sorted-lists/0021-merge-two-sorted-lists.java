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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ArrayList<Integer>list=new ArrayList<>();
    ListNode head=list1;
    while(head!=null){
        list.add(head.val);
        head=head.next;
    }
    ListNode head1=list2;
    while(head1!=null){
        list.add(head1.val);
        head1=head1.next;
    }
    Collections.sort(list);
    ListNode dup=new ListNode(0);
    ListNode dup1=dup;
   for(int i:list){
      dup1.next=new ListNode(i);
      dup1=dup1.next;
   }
    return dup.next;
    }
}