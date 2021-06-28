class Solution
{
    // root : the root Node of the given BST
    // target : the target sum
    class Pair
    {
        Node root;
        int state;
        public Pair(Node r,int x)
        {
            root=r;
            state=x;
        }
    }
    
    public int isPairPresent(Node root, int target)
    {
        // Write your code here
        Stack<Pair> left=new Stack<>();
        Stack<Pair> right=new Stack<>();
        
        left.push(new Pair(root,1));
        right.push(new Pair(root,1));
        
        Node lnode=nextinorderleft(left);
        Node rnode=nextinorderreverse(right);
    
        while(lnode.data < rnode.data)
        {
            if(lnode.data+rnode.data==target)
                return 1;
            else if(lnode.data+rnode.data < target)
                lnode=nextinorderleft(left);
            else
                rnode=nextinorderreverse(right);
        }
        return 0;
    }
    
    public Node nextinorderleft(Stack<Pair> left)
    {
        while(left.size()>0)
        {
            Pair temp=left.peek();
            if(temp.state==1)
            {
                temp.state++;
                if(temp.root.left!=null)
                    left.push(new Pair(temp.root.left,1));
                
            }
            else if(temp.state==2)
            {
                temp.state++;
                if(temp.root.right!=null)
                    left.push(new Pair(temp.root.right,1));
                
                return temp.root;    
            }
            else
                left.pop();
        }
        
        return null;
    }
    
    public Node nextinorderreverse(Stack<Pair> right)
    {
        while(right.size()>0)
        {
            Pair temp=right.peek();
            if(temp.state==1)
            {
                temp.state++;
                if(temp.root.right!=null)
                    right.push(new Pair(temp.root.right,1));
                
            }
            else if(temp.state==2)
            {
                temp.state++;
                if(temp.root.left!=null)
                    right.push(new Pair(temp.root.left,1));
                
                return temp.root;    
            }
            else
                right.pop();
        }
        
        return null;
    }
}

