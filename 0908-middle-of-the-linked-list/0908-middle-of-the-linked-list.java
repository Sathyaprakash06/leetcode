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
    public ListNode middleNode(ListNode head) {
        ListNode temp=head;
        int count=0;
        while(temp!=null){
            temp=temp.next;
             count++;
        }
        int c =0;
        ListNode t = head;
        while(count/2>c){
            t=t.next;
            c++;
        }
        return t;
    }

}