class Solution
{
    int sum=Integer.MIN_VALUE;
    
    int findMaxPathSum(Node root)
    {
        if(root==null)
            return 0;
        
        int lsum=findMaxPathSum(root.left);
        int rsum=findMaxPathSum(root.right);
        
        if(root.left== null && root.right==null)
            return root.data;
        if(root.left==null) 
            return root.data+ rsum;
        if(root.right==null) 
            return root.data+lsum;
        
        sum=Math.max(sum, root.data+lsum+rsum);
        int ans=Math.max(root.data+lsum, root.data+rsum);
        return ans;
    }
       
       int maxPathSum(Node root)
       {
          int ans=findMaxPathSum(root);
          
          if(root.left==null || root.right==null) 
              sum=Math.max(sum,ans);
          
          return sum;
           
       }
       
}