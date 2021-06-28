class Solution {
        List<Integer> list=new ArrayList<Integer>();
        public List<Integer> inorderTraversal(TreeNode root) {
        
            if(root==null)
                return list;


            inorderTraversal(root.left);
            list.add(root.val);
            inorderTraversal(root.right);

            return list;

    }
}


class Solution {
         
    List<Integer> list=new ArrayList<Integer>();
    public List<Integer> inorderTraversal(TreeNode root) {
        
    Stack<TreeNode> st1=new Stack<>();
        
        if(root==null)
           return list;
        
        while(true)
        {
            if(root!=null)
            {
                st1.push(root);
                root=root.left;
                continue;
            }
            
            else
            {
                if(st1.isEmpty())
                    break;
                root=st1.pop();
                list.add(root.val);
                root=root.right;
            }
        }
        
        return list;
    }

}



//InOrder traversal

class Solution {
    
    class Pair{
        Node root;
        int state;
        public Pair(Node t,int x)
        {
            root=t;
            state=x;
        }
    }
    // Function to return a list containing the inorder traversal of the tree.
    ArrayList<Integer> inOrder(Node root) {
        // Code
        Stack<Pair> st=new Stack<>();
        ArrayList<Integer> list=new ArrayList<>();
        st.push(new Pair(root,1));
        
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
                list.add(temp.root.data);
                if(temp.root.right!=null)
                    st.push(new Pair(temp.root.right,1));
            }
            else 
            {
                temp.state++;
                st.pop();
            }
            
        }
        return list;
        
    }
}
