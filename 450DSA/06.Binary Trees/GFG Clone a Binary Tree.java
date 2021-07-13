class Solution{
    
    public static Tree cloneTree(Tree tree)
    {
       
        if(tree==null) return null;
        
        Queue<Tree> q=new LinkedList<>();
        HashMap<Tree,Tree> map=new HashMap<>();
        
        q.add(tree);
        map.put(tree,new Tree(tree.data));
        
        while(!q.isEmpty())
        {
        
            Tree temp=q.poll();
            
            if(temp.left!=null)
            {
                Tree cur=temp.left;
                if(!map.containsKey(cur))
                {
                    q.add(cur);
                    map.put(cur,new Tree(cur.data));
                }
                map.get(temp).left=map.get(cur);
            }
            
            if(temp.right!=null)
            {
                Tree cur=temp.right;
                if(!map.containsKey(cur))
                {
                    q.add(cur);
                    map.put(cur,new Tree(cur.data));
                }
                map.get(temp).right=map.get(cur);
            }
            
            if(temp.random!=null)
            {
                Tree cur=temp.random;
                if(!map.containsKey(cur))
                {
                    q.add(cur);
                    map.put(cur,new Tree(cur.data));
                }
                map.get(temp).random=map.get(cur);
            }
        }
        
        return map.get(tree);
     }
}
