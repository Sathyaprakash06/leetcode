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
    public ListNode deleteDuplicates(ListNode head) {
       ListNode temp=head;
      ArrayList<Integer>list=new ArrayList<>();
      HashMap<Integer,Integer>map=new HashMap<>();
      while(temp!=null){
        list.add(temp.val);
        temp=temp.next;
      }
      Collections.sort(list);
      for(int i:list){
       map.put(i,map.getOrDefault(i,0)+1);
      }
       ArrayList<Integer>list1=new ArrayList<>();
      for(int i:map.keySet()){
        if(map.get(i)==1){
            list1.add(i);
        }
      }
      Collections.sort(list1);
      ListNode dummy=new ListNode(0);
      ListNode dummy1=dummy;
      for(int i:list1){
        dummy1.next=new ListNode(i);
        dummy1=dummy1.next;
      }
      return dummy.next;
    }
}