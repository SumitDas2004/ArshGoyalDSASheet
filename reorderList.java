class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode ans = new ListNode(0);
        ListNode ansTrav = ans;
        ListNode cur = head;
        while(cur!=null){
            if(cur.val<x){
                ansTrav.next = new ListNode(cur.val);
                ansTrav = ansTrav.next;
            }
            cur = cur.next;
        }
        cur = head;
        while(cur!=null){
            if(cur.val>=x){
                ansTrav.next = new ListNode(cur.val);
                ansTrav = ansTrav.next;
            }
            cur = cur.next;
        }
        return ans.next;
    }
}
