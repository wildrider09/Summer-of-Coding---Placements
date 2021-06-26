class GfG
{
    public static void findPreSuc(Node root, Res p, Res s, int key)
    {
       // add your code here
       if(root==null)
            return ;
            
       if(root.data<key)
       {
           p.pre=root;
           findPreSuc(root.right,p,s,key);
       }
       else if(root.data>key)
       {
           s.succ=root;
           findPreSuc(root.left,p,s,key);
       }
       else
       {
          findPreSuc(root.left,p,s,key);
          
          findPreSuc(root.right,p,s,key);
       }
          
    }
}
