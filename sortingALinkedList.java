class Solution {
    public ListNode conquer(ListNode l1, ListNode l2){
        ListNode head = new ListNode(0);
        ListNode cur = head;
        while(l1!=null && l2!=null){
            if(l1.val<l2.val){
                cur.next = new ListNode(l1.val);
                l1 = l1.next;
            }else{
                cur.next = new ListNode(l2.val);
                l2 = l2.next;
            }
            cur = cur.next;
        }
        while(l1!=null){
            cur.next = new ListNode(l1.val);
            l1 = l1.next;
            cur = cur.next;
        }

        while(l2!=null){
            cur.next = new ListNode(l2.val);
            l2 = l2.next;
            cur = cur.next;
        }
        return head.next;
    }
    public ListNode divide(ListNode head){
        if(head==null)return null;
        if(head.next==null)return head;
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next!=null && fast.next.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode l1 = head;
        ListNode l2 = slow.next;
        slow.next = null;
        l1 = divide(l1);
        l2 = divide(l2);
        return conquer(l1, l2);
    }
    public ListNode sortList(ListNode head) {
        return divide(head);
    }
}
