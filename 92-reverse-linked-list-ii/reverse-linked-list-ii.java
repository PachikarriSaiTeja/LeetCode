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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head==null || head.next==null || left==right)
        {
            return head;
        }
        else{
        ListNode dum=new ListNode(0);
        dum.next=head;
        int i=1;
        ListNode lprev=dum;
        ListNode temp=head;
        ListNode rnext=null;
        ListNode lnode=null;
        ListNode rnode=null;
        while(i<left && temp!=null){
            lprev=temp;
            temp=temp.next;
            i++;
        }
        lnode=temp;
        i=left;
       while(i<right && temp!=null){
            
            temp=temp.next;
            i++;
        }
        rnode=temp;
        if(rnode.next!=null){
            rnext=rnode.next;
        }
        
        if(rnode.next!=null){
        rnext=rnode.next;
        }
        ListNode prev=rnext;
        ListNode cur=lnode;
       ListNode next=null;
       while(cur!=rnext)
       {
        next=cur.next;
        cur.next=prev;
        prev=cur;
        cur=next;
       }
       lprev.next=rnode;
       lnode.next=rnext;
       
        return dum.next;
        }
       
        
    }
}