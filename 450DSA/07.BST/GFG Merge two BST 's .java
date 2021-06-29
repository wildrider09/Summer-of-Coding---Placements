//O(m+n) time, O(h1+h2) space,non balanced bst(skewed)
class Solution
{
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
    //Function to return a list of integers denoting the node 
    //values of both the BST in a sorted order.
    public List<Integer> merge(Node root1,Node root2)
    {
        Stack<Pair> st1=new Stack<>();
        Stack<Pair> st2=new Stack<>();
       
        st1.push(new Pair(root1,1));
        st2.push(new Pair(root2,1));
       
        Node tree1=getinorder(st1);
        Node tree2=getinorder(st2);
       
        ArrayList<Integer> arr=new ArrayList<>();
       
        while(tree1!=null && tree2!=null)
        {
           
	        if(tree1.data>tree2.data)
	  	    {
	  	         arr.add(tree2.data);
	             tree2=getinorder(st2);
	  	    }
	        else
	       	{
	             arr.add(tree1.data);
	             tree1=getinorder(st1);
	       	}
        }
  
        while(tree1!=null)
        {
            arr.add(tree1.data);
            tree1=getinorder(st1);
        }
        
        
        while(tree2!=null)
        {
            arr.add(tree2.data);
            tree2=getinorder(st2);
        }
        
       return arr;
    }
    
     Node getinorder(Stack<Pair> st)
    {
        while(st.size()>0)
        {
            Pair temp=st.peek();
            if(temp.state==1)
            {
                temp.state++;
                if(temp.root.left!=null)
                    st.push(new Pair(temp.root.left,1));
                
            }
            else if(temp.state==2)
            {
                temp.state++;
                if(temp.root.right!=null)
                    st.push(new Pair(temp.root.right,1));
                
                return temp.root;    
            }
            else
                st.pop();
        }
        return null;
    }
    
}

//Method-2
//Convert BST To DLL and then DLL to BBST
//O(m+n) time, O(h1+h2) space,balanced bst







