class Solution {
    public ListNode reverseList(ListNode head) {
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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode tmp = new ListNode(0);
        tmp.next = head;
        head = tmp;
        ListNode prev = null;
        ListNode next = null;
        ListNode cur = head;
        for(int i=0;cur!=null;i++, cur= cur.next){
            if(i+1==left)prev = cur;
            if(i==right){
                next = cur.next;
                cur.next = null;
            }
        }
        prev.next = reverseList(prev.next);
        while(prev.next!=null)prev = prev.next;
        prev.next = next;
        return head.next;
    }
}
