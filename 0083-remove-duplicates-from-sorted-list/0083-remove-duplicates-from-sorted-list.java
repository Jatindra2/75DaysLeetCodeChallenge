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
        ListNode temp = head;
        while(temp != null && temp.next != null){
            ListNode x = temp;
            while(x.next != null && x.val == x.next.val){
                x = x.next;
            }
            if(x.next == null){
                if(temp.val == x.val){
                    temp.next = null;
                }
            }else{
                temp.next = x.next;
            }
            temp = temp.next;
        }
        return head;
    }
}