class Solution{
    
    int height=0,sum=0;
    public int sumOfLongRootToLeafPath(Node root)
    {
        //code here
        if(root==null)
            return 0;
        solve(root,0,0);
        return sum;
    }
    
    public void solve(Node root,int h,int s)
    {
        if(root==null)
        {
            if(h>height)
                sum=s;
            if(h==height && s>sum)
                sum=s;
            return;
        }
        
        solve(root.left,1+h,s+root.data);
        solve(root.right,1+h,s+root.data);
        
        
    }
}
