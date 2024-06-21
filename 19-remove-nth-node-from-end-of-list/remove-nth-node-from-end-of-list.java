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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null || head.next==null)
        {
            return null;
        }
        int l=0;
        ListNode temp=head;
        ListNode dum=new ListNode(0);
        dum.next=head;
        while(temp!=null)
        {
            temp=temp.next;
            l++;
        }
        if(l==n)
        {
            dum.next=head.next;
            return dum.next;
        }
        ListNode s=head;
        ListNode f=head;
        ListNode prev=head;
        for(int i=0;i<n;i++)
        {
            f=f.next;
        }
        while(f!=null)
        {
            prev=s;
            s=s.next;
            f=f.next;
        }
        prev.next=s.next;
        return head;
    }
}