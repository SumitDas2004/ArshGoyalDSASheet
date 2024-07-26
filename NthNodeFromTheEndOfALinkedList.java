class Solution {
    int findLen(ListNode head){
        int ans = 0;
        while(head!=null){
            head = head.next;
            ans++;
        }
        return ans;
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int len  = findLen(head);
        if(len==n)return head.next;
        ListNode cur = head;
        for(int i=1;i<len-n;i++)cur = cur.next;
        if(cur.next!=null)
        cur.next = cur.next.next;
        return head;
    }
}
