class Solution
{
    public static Node buildTree(int inorder[], int preorder[], int n)
    {
        // code here 
        if(inorder.length!=preorder.length  || n==0)
            return null;
        
        return solve(inorder,preorder,0,n-1,0);
        
    }    
    
    static Node solve(int inorder[],int preorder[],int start,int end,int p)
    {
        if(start>end)
            return null;
        
        if(p>inorder.length-1 || p<0)
            return null;
        
        Node t=new Node(preorder[p]);
        int index=-1;
        
        for(int i=start;i<=end;i++)
        {
            if(inorder[i]==preorder[p])
                index=i;
        }
        
        if(index!=-1)
        {
            t.left=solve(inorder,preorder,start,index-1,p+1);
            t.right=solve(inorder,preorder,index+1,end,p+index-start+1);
        }
        
        return t;
    }
    
}

