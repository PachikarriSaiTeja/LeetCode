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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry=0;
        
        ListNode tail=null;
        ListNode head=null;

        while(l1!=null || l2!=null)
        {
            int v1=(l1!=null)? l1.val:0;
            int v2=(l2!=null)? l2.val:0;
            int sum=v1+v2+carry;
            carry=sum/10;
            
            ListNode node=new ListNode(sum%10);
            if(tail==null){
            tail=node;
            head=node;
            }
            else{
                 tail.next=node;
                 tail=tail.next;
            }
            if(l1!=null)
            {
                 l1=l1.next;
            }
            if(l2!=null){
                l2=l2.next;
            }
        }
        if(carry!=0)
        {
            ListNode node=new ListNode(carry);
            tail.next=node;
        }
        return head;

    }
}