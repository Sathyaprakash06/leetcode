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
    public boolean isPalindrome(ListNode head) {
        ArrayList<Integer>list=new ArrayList<>();
        ListNode h=head;
        while(h!=null){
            list.add(h.val);
            h=h.next;
        }
        int st=0;
        int end=list.size()-1;
        while(st<=end){
            if(list.get(st)!=list.get(end)){
                return false;
            }
            st++;
            end--;
        }
        return true;
    }
}