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
        int c=0;
        if(head==null)
        {
            return null;
        }
         ListNode temp=head;
        while(temp!=null)
        {
            c++;
            temp=temp.next;
        }
        temp=head;
        k=k%c;
        ListNode f=head;
        ListNode s=head;
        ListNode D=new ListNode(-1);
        D.next=head;
        for(int i=0;i<k;i++)
        {
            f=f.next;
        }
        while(f!=null && f.next!=null)
        {
            s=s.next;
            f=f.next;
        }
        f.next=D.next;
        D.next=s.next;
        s.next=null;
        return D.next;
    }
    
}
