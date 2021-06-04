class Clone {
    //Function to clone a linked list with next and random pointer.
    Node copyList(Node head) {
        // your code here
        HashMap<Node,Node> map= new HashMap<Node,Node>();
        
        Node root=new Node(head.data);   //root of copy ll
        Node copyroot1=root;
        Node copyroot2=root;
         
        Node temp=head;
        temp=temp.next;
        
        map.put(head,root);             //map stores original,new node
    
        while(temp!=null)
        {
            copyroot1.next=new Node(temp.data);
            copyroot1=copyroot1.next;
            map.put(temp,copyroot1);
            temp=temp.next;
        }
        
        while(head!=null)
        {
            Node tt=map.get(head.arb);
            copyroot2.arb=tt;
            head=head.next;
            copyroot2=copyroot2.next;
        }
        
        return root;
    }
}



class Clone {
    //Function to clone a linked list with next and random pointer.
    Node copyList(Node head) {
        
        Node temp=head;
        while(temp!=null)
        {
            Node m=new Node(temp.data);
            m.next=temp.next;
            temp.next=m;
            temp=temp.next.next;
        }
        
        temp=head;
        while(temp!=null)
        {
            if(temp.arb!=null)
                temp.next.arb=temp.arb.next;

            temp=temp.next.next;
        }
        
        temp=head;
        Node newL=temp.next,t=newL,front=null;

        while(t!=null&&t.next!=null)
        {
            front = temp.next.next;
            t.next=temp.next;
            t=t.next;
            temp.next=front;
            temp=front;
        }
        return newL;
        
    }
}



