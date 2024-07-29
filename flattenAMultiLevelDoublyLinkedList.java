class Solution {
    
    public Node flatten(Node head) {
        if(head==null)return null;
        Node cur =head;
        while(cur!=null){
            Node next= cur.next;
            cur.next = flatten(cur.child);
            if(cur.next!=null)
            cur.next.prev = cur;
            cur.child = null;
            Node tmp = cur;
            while(tmp.next!=null)tmp = tmp.next;
            tmp.next= next;
            if(next!=null)
            next.prev = cur;
            cur = cur.next;
        }
        return head;
    }
}
