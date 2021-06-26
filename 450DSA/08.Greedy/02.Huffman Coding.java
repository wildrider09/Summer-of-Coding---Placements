class Solution {
    
    class Node
    {
        int data;
        char ch;
        Node left;
        Node right;
        
        public Node(char ch,int data)
        {
            this.data=data;
            this.ch=ch;
            this.left=null;
            this.right=null;
        }
         public Node(int data)
        {
            this.data=data;
            this.ch='\0';
            this.left=null;
            this.right=null;
        }
    }
    
    public ArrayList<String> huffmanCodes(String S, int f[], int N)
    {
        // Code here
       PriorityQueue<Node> q = new PriorityQueue<>(new Comparator<Node>()
       {

            public int compare(Node n1, Node n2)
            {
                if(n1.data>=n2.data)   // = used preserves left and right order
                    return 1;
                else
                    return -1;
            }
        });
        
        ArrayList<String> list=new ArrayList<String>();
        
        for(int i=0;i<N;i++)
        {
            Node t=new Node(S.charAt(i),f[i]);
            q.add(t);
        }
        
        while( q.size()>1)
        {
            Node a=q.remove();
            Node b=q.remove();
            
            Node temp=new Node(a.data+b.data);
            temp.left=a;
            temp.right=b;
            
            q.add(temp);
        }
        
        Node root=q.remove();
        preorder(root,list,"");
        
        return list;
    }
    
    public void preorder(Node root,ArrayList<String> list,String s)
    {
        if(root.left==null && root.right==null)
        {
            list.add(s);
            return;
        }
        preorder(root.left,list,s+"0");
        preorder(root.right,list,s+"1");
    }
}
