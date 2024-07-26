lass Solution {
    public ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode next = null;
        ListNode cur = head;
        while(cur!=null){
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        return prev;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null)return null;
        ListNode cur = head;
        for(int i=1;i<k;i++){
            cur = cur.next;
            if(cur==null)return head;
        }
        ListNode next = cur.next;
        cur.next =null;
        ListNode rev= reverse(head);
        cur = rev;
        while(cur.next!=null)cur = cur.next;
        cur.next = reverseKGroup(next, k);
        return rev;
    }
}
