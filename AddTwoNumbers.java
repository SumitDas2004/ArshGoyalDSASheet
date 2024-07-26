class Solution {
    public ListNode addTwoNumbers(ListNode head1, ListNode head2) {
        ListNode anshead=new ListNode(0);
        ListNode ans=anshead;
        int carry=0;
        while(head1!=null && head2!=null){
            ans.next=new ListNode((head1.val+head2.val+carry)%10);
            if(head1.val+head2.val+carry>=10)carry=1;
            else carry=0;
            head1=head1.next;
            head2=head2.next;
            ans=ans.next;
        }
        while(head1!=null){
            ans.next=new ListNode((head1.val+carry)%10);
            if(head1.val+carry>=10)carry=1;
            else carry=0;
            head1=head1.next;
            ans=ans.next;
        }
        while(head2!=null){
            ans.next=new ListNode((head2.val+carry)%10);
            if(head2.val+carry>=10)carry=1;
            else carry=0;
            head2=head2.next;
            ans=ans.next;
        }
        if(carry==1)ans.next=new ListNode(1);
        return anshead.next;
    }
}
