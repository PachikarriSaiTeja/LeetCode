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
        ListNode s=head;
        ListNode f=head;
        ListNode t=new ListNode();
        if(head==null || head.next==null)
        {
            return true;
        }
        f=head;
        s=head;
        while(f!=null && f.next!=null)
        {
            s=s.next;
            f=f.next.next;
        }
        ListNode cur=s;
        ListNode prev=null;
        ListNode next=null;
       while(cur!=null)
       {
         next=cur.next;
         cur.next=prev;
         prev=cur;
         cur=next;
       }
       ListNode temp=head;
       ListNode lemp=prev;
       while(lemp!=null)
       {
        if(lemp.val!=temp.val)
        {
            return false;
        }
        lemp=lemp.next;
        temp=temp.next;
       }
       return true;
}
}
