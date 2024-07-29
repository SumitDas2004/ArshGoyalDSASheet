class Solution
{
    static Node reverse(Node head){
        Node cur=head;
        Node prev=null;
        Node next=null;
        while(cur!=null){
            next=cur.next;
            cur.next=prev;
            prev=cur;
            cur=next;
        }
        head=prev;
        return head;
    }
    static int len(Node head){
        Node cur=head;
        int len=0;
        while(cur!=null){
            len++;
            cur=cur.next;
        }
        return len;
    }
    static boolean greater(Node l1, Node l2){
        Node d1=l1;
        Node d2=l2;
        int w1=len(l1);
        int w2=len(l2);
        if(w1>w2)return true;
        if(w1<w2)return false;
        while(d1!=null && d2!=null){
            if(d2.data>d1.data)return false;
            else if(d2.data<d1.data)return true;
            d1=d1.next;
            d2=d2.next;
        }
        return true;
    }
    static Node subLinkedList(Node l1, Node l2)
    {
        // code here
        while(l1.data==0 && l1.next!=null)l1=l1.next;
        while(l2.data==0 && l2.next!=null)l2=l2.next;
        if(!greater(l1, l2)){
            Node tmp=l1;
            l1=l2;
            l2=tmp;
        }
        l1=reverse(l1);
        l2=reverse(l2);
        Node ans=new Node(0);
        Node cur=ans;
        int borrow=0;
        while(l1!=null && l2!=null){
            int data1=l1.data;
            int data2=l2.data;
            data2+=borrow;
            if(data2>data1){
                data1+=10;
                borrow=1;
            }else borrow=0;
            cur.next=new Node((data1-data2)%10);
            l1=l1.next;
            l2=l2.next;
            cur=cur.next;
        }
        while(l1!=null){
            int data1=l1.data;
            int data2=borrow;
            if(data2>data1){
                data1+=10;
                borrow=1;
            }else borrow=0;
            cur.next=new Node((data1-data2)%10);
            l1=l1.next;
            cur=cur.next;
        }
        ans=reverse(ans.next);
        while(ans.data==0 && ans.next!=null)ans=ans.next;
        return ans;
    }
}
