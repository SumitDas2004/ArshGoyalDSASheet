class Solution {
    public ListNode removeElements(ListNode head, int val) {
        while(head!=null && head.val==val)head = head.next;
        if(head==null)return null;
        ListNode cur = head;
        while(cur.next!=null){
            if(cur.next.val==val)cur.next =  cur.next.next;
            else cur = cur.next;
        }
        return head;

    }
}
