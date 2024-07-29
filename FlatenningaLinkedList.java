class GfG
{
    Node combine(Node f, Node s){
        Node res=new Node(0);
        Node cur=res;
        while(f!=null && s!=null){
            if(f.data>=s.data){
                cur.bottom=s;
                cur=cur.bottom;
                s=s.bottom;
            }else{
                cur.bottom=f;
                cur=cur.bottom;
                f=f.bottom;
            }
        }
        if(f!=null)cur.bottom=f;
        if(s!=null)cur.bottom=s;
        return res.bottom;
    }
    Node flatten(Node root)
    {
	// Your code here
	if(root==null || root.next==null)return root;
	Node next=flatten(root.next);
	root=combine(root, next);
	return root;
    }
}
