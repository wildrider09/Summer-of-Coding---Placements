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
