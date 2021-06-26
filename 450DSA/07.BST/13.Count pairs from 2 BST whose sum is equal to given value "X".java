class GfG
{
    static HashSet<Integer> set;
    static int count;
    public static int countPairs(Node root1, Node root2, int x)
    {
        
        count=0; set=new HashSet<Integer>();
        store(root2);
        inorder(root1,x);
        return count;
    }
    
    static void store(Node root)
    {
        if(root==null)
            return;
            
        set.add(root.data);
        store(root.left);
        store(root.right);
    }
    
    static void inorder(Node root,int x)
    {
        if(root==null)
            return ;
        
        inorder(root.left,x);
        
        if(set.contains(x-root.data))
            count++;
            
        inorder(root.right,x);
    }
}
