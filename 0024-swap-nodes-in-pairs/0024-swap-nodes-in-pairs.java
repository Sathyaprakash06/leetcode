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
    public ListNode swapPairs(ListNode head) {
        ArrayList<Integer>list=new ArrayList<>();
       ListNode temp=head;
     while(temp!=null){
     list.add(temp.val);
     temp=temp.next; 
     }
     for(int i=0;i<list.size()-1;i+=2){
        int dup=list.get(i);
        list.set(i,list.get(i+1));
        list.set(i+1,dup);
     }
     ListNode dummy=new ListNode(0);
     ListNode dummy1=dummy;
     for(int i:list){
        dummy1.next=new ListNode(i);
        dummy1=dummy1.next;
     }
     return dummy.next ;
    }
}