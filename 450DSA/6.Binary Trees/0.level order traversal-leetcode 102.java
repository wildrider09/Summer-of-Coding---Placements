class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        List<List<Integer>> list=new ArrayList<>();
        
        Queue<TreeNode> queue= new LinkedList<>();
        
        if(root!=null)
            queue.add(root);
        
        while(!queue.isEmpty())
        {
            int count=queue.size();
            List<Integer> list1=new ArrayList<Integer>();
            for(int i=0;i<count;i++)
            {
                TreeNode t=queue.remove();
                list1.add(t.val);
                if(t.left!=null)
                    queue.add(t.left);
                    
                if(t.right!=null)
                    queue.add(t.right);
                
            }
            list.add(new ArrayList<>(list1));
        }
        
        return list;
    }
}
