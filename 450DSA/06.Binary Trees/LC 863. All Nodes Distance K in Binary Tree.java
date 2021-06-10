class Solution {
    
        ArrayList<Integer> list=new ArrayList<>();
        ArrayList<TreeNode>  listnode=new ArrayList<>();

         
      	public List<Integer> distanceK(TreeNode root, TreeNode target, int k)
	{    
           ntr(root,target);
           TreeNode blocker=null;
           for(int i=0;i<listnode.size();i++)
           {
            	if(i!=0)
                	blocker=listnode.get(i-1);
                
            	printklevel(listnode.get(i),k-i,blocker);
           }
        
          return list;
        }

        public boolean ntr(TreeNode root,TreeNode x)
        {
            if(root==null)
                return false;

            if(root==x)
            {
                listnode.add(root);
                return true;
            }
            
            boolean l=ntr(root.left,x);
            boolean r=ntr(root.right,x);

            if(l==true || r==true)
            {
                listnode.add(root);
                return true;
            }
                return false;

        }

        public  void printklevel(TreeNode root,int k,TreeNode blocker)
        {
            if(k<0)
                return;

            Queue<TreeNode> queue= new LinkedList<>();
            if(root!=null)
                queue.add(root);

            int c=0;
            while(!queue.isEmpty())
            {
                int count=queue.size();
                List<Integer> list1=new ArrayList<Integer>();
                for(int i=0;i<count;i++)
                {
                    TreeNode t=queue.remove();
                    list1.add(t.val);
                    if(t.left!=null && t.left!=blocker)
                        queue.add(t.left);

                    if(t.right!=null && t.right!=blocker)
                        queue.add(t.right);

                }
                if(c==k)
                {
                    list.addAll(list1);
                    return;
                }
                c++;
            }       
        
    }
}
