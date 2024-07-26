class Solution
{
    Node reverse(Node a){
        Node next = null;
        Node prev = null;
        Node cur = a;
        while(cur!=null){
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        return prev;
    }
    
    Node compute(Node head)
    {
        // your code here
        head = reverse(head);
        Node cur = head;
        while(cur.next!=null){
            if(cur.data>cur.next.data)cur.next = cur.next.next;
            else
            cur = cur.next;
        }
        return reverse(head);
    }
}
