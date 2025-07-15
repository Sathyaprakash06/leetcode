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
    public ListNode rotateRight(ListNode head, int k) {
        ArrayList<Integer>list=new ArrayList<>();
        ListNode curr=head;
        while(curr!=null){
            list.add(curr.val);
            curr=curr.next;
        }
        Collections.rotate(list,k);
        System.out.println(list);
        ListNode dummy=new ListNode(0);
        ListNode s=dummy;
        for(int i:list)
        {
        s.next=new ListNode(i);
        s=s.next;
        }

        return dummy.next;
    }
}