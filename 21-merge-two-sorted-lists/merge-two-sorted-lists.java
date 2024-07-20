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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null && list2==null)
        {
            return null;
        }
        else if(list1==null)
        {
            return list2;
        }
        else if(list2==null)
        {
            return list1;
        }
        ListNode t1=list1;
        ListNode t2=list2;
        ListNode dum=new ListNode(0);
        ListNode tail=dum;
       
        while(t1!=null && t2!=null)
        {
               if(t1.val<=t2.val)
               {
                  tail.next=t1;
                  t1=t1.next;
               }
               else
               {
                tail.next=t2;
                t2=t2.next;
               }
           tail=tail.next;
                  
        }
           if(t1!=null)
           {
            tail.next=t1;

     
           }
            if(t2!=null)
           {
            tail.next=t2;
      
            
           }
        return dum.next;

    }

}