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
    public ListNode oddEvenList(ListNode head) {
       ArrayList<Integer>list=new ArrayList<>();
       ListNode curr=head;
        while(curr!=null){
            list.add(curr.val);
            curr=curr.next;
        }
         ArrayList<Integer>list2=new ArrayList<>();
          ArrayList<Integer>list3=new ArrayList<>();
        for(int i=0;i<list.size();i++){
            if(i%2==0){
                list2.add(list.get(i));
            }else{
                list3.add(list.get(i));
            }
        } 
        list2.addAll(list3);
        ListNode dummy=new ListNode(0);
        ListNode dummy1=dummy;
        for(int i:list2){
            dummy1.next=new ListNode(i);
            dummy1=dummy1.next;
        } 
        return dummy.next;
    }
}