/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp=headA;
        ListNode temp2=headB;
        while(temp!=null)
        {
            temp.val=temp.val+99999;
            temp=temp.next;
        }
        int ans=0;
         while(temp2!=null)
        {
            if(temp2.val>=99999)
            {
                ans=1;
                 break;
            }
            temp2=temp2.next;
        }
        temp=headA;
          while(temp!=null)
        {
            temp.val=temp.val-99999;
            temp=temp.next;
        }
        return temp2;
        
        
              
    }
}