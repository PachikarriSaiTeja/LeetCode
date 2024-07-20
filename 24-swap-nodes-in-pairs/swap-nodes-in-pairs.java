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
        if (head==null || head.next==null){
            return head;
        }
        ListNode slow=head;
        ListNode fast=head.next;
        ListNode dum=new ListNode(0);
        ListNode pre=dum;
        dum.next=head;
        int s=0;
        if(head==null || head.next==null)
        {
           return dum.next;
        }
         while(slow!=null && fast!=null){
            pre.next=fast;
            slow.next=fast.next;
            fast.next=slow;
            pre=slow;
            slow=slow.next;
            if(slow!=null)
            {
                fast=slow.next;
            }
            else
            {
                fast=null;
            }
         }
    
        
        return dum.next;
    }
}