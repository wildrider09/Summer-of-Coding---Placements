class Solution {
    
    List<Integer> list=new ArrayList<Integer>();
    public List<Integer> preorderTraversal(TreeNode root) {
        
        if(root==null)
            return list;
        
        list.add(root.val);
        
        preorderTraversal(root.left);
        
        preorderTraversal(root.right);
        
        return list;
        
    }
}



class Solution {
    
    List<Integer> list=new ArrayList<Integer>();
    public List<Integer> preorderTraversal(TreeNode root) {
        
        Stack<TreeNode> st=new Stack<>();
        st.push(root);
        while(!st.isEmpty())
        {
            TreeNode t=st.pop();
            if(t!=null)
            {
                list.add(t.val);
                if(t.right!=null)
                    st.push(t.right);
                if(t.left!=null)
                    st.push(t.left);
            }
            else
                continue;
        }
        return list;
    }
}
