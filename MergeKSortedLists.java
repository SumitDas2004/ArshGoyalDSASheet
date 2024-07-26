class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq = new PriorityQueue<>((x, y)->Integer.compare(x.val, y.val));
        for(ListNode list:lists)if(list!=null)pq.offer(list);
        ListNode ans = new ListNode(0);
        ListNode cur= ans;
        while(!pq.isEmpty()){
            ListNode top = pq.poll();
            cur.next = new ListNode(top.val);
            cur = cur.next;
            top = top.next;
            if(top!=null)
                pq.offer(top);
        }
        return ans.next;
    }
}

