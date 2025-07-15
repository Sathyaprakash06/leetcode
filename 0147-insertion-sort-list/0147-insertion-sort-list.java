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
    public ListNode insertionSortList(ListNode head) {
        ArrayList<Integer>list=new ArrayList<>();
        ListNode curr=head;
        while(curr!=null){
            list.add(curr.val);
            curr=curr.next;
        }
        Collections.sort(list);
        ListNode d=new ListNode(0);
        ListNode d1=d;
        for(int i:list)
        {
            d.next=new ListNode(i);
            d=d.next;
        }
        return d1.next;
    }
}