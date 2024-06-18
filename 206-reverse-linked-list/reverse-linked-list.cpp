class Solution {
  public:
  ListNode* reverseList(ListNode* head)
  {
    ListNode* cur=head;
    ListNode* prev=nullptr;
    ListNode* next=nullptr;
    if(head==nullptr)
    {
        return nullptr;
    }
    while(cur!=nullptr)
    {
        next=cur->next;
        cur->next=prev;
        prev=cur;
        cur=next;
    }
    return prev;

}
};