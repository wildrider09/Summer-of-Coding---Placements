class Solution {
     List<Integer> list=new ArrayList<Integer>();
    public List<Integer> postorderTraversal(TreeNode root) {
        
        if(root==null)
            return list;
        
        
        postorderTraversal(root.left);
        postorderTraversal(root.right);
        list.add(root.val);
        
        return list;
        
    }
}


class Solution {
     List<Integer> list=new ArrayList<Integer>();
    public List<Integer> postorderTraversal(TreeNode root) {
        
        Stack<TreeNode> st1=new Stack<>();
        Stack<TreeNode> st2=new Stack<>();
        
        if(root!=null)
            st1.push(root);
        
        while(!st1.isEmpty())
        {
            TreeNode t=st1.pop();
            if(t!=null)
                st2.push(t);
           
            if(t.left!=null)
                st1.push(t.left);
            
            if(t.right!=null)
                st1.push(t.right);
        }
        
        while(!st2.isEmpty())
        {    
            TreeNode t=st2.pop();
            if(st2!=null)
                list.add(t.val);
        }
        return list;
    }
}
