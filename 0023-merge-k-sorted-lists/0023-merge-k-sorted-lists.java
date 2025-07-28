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
    public ListNode mergeKLists(ListNode[] lists) {
        ArrayList<Integer>list=new ArrayList<>();
        for(ListNode i:lists){
            ListNode curr=i;
            while(curr!=null){
                list.add(curr.val);
                curr=curr.next;
            }
        }
        Collections.sort(list);

        ListNode dummy=new ListNode(0);
        ListNode dummy1=dummy;
        for(int i:list){
            dummy1.next=new ListNode(i);
            dummy1=dummy1.next;
        }
        return dummy.next;
    }
}