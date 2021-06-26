class GFG
{
    static boolean flag;
    public static boolean isDeadEnd(Node root)
    {
        //Add your code here.
        flag=false;
        check(root,0,Integer.MAX_VALUE);
        return flag;
    }
    
    static void check(Node root,int min,int max)
    {
        if(root==null)
            return ;
            
        if(root.data==min+1 && root.data==max-1)
            flag=true;
        
        check(root.left,min,root.data);
        check(root.right,root.data,max);
    }
}
