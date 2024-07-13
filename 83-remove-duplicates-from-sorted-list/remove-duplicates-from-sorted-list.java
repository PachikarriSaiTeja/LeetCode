class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null || head.next==null)
        {
            return head;
        }
    ListNode temp=head;
    ListNode fr=head.next;
    while(fr!=null && temp!=null)
    {
      if(temp.val==fr.val)
      {
        temp.next=fr.next;
        fr=fr.next;
      }
      else if(temp.val!=fr.val){
        fr=fr.next;
        temp=temp.next;
    }
    }
    
    
    return head;
}
}