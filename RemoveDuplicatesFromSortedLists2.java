class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode cur = head;
        while(cur!=null){
            if(cur.next!=null && cur.val==cur.next.val){
                while(cur.next!=null && cur.next.val==cur.val){
                    cur.next = cur.next.next;
                }
                cur.val= -200;
                
            }
            cur = cur.next;
        }
        while(head!=null && head.val==-200)head = head.next;
        if(head==null)return null;
        cur = head;
        while(cur.next!=null){
            if(cur.next.val==-200)cur.next = cur.next.next;
            else cur = cur.next;
        }
        return head;
    }
}

