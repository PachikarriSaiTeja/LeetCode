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
    public ListNode sortList(ListNode head) {
        if(head==null ||head.next==null)
        {
            return head;
        }
        
        ListNode temp=head;
        int cnt=0;
        while(temp!=null)
        {
            cnt+=1;
            temp=temp.next;
        }
        int[] arr=new int[cnt];
         temp=head;
        for(int i=0;i<cnt;i++)
        {
            arr[i]=temp.val;
            temp=temp.next;
        }
        Arrays.sort(arr);
         temp=head;
         for(int i=0;i<cnt;i++)
         {
            temp.val=arr[i];
            temp=temp.next;
         }
         return head;
    }
}

  