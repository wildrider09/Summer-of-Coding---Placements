class Solution{
    public void toSumTree(Node root){
         //add code here.
         
         if(root==null)
            return;
         int t=solve(root);    
    }
    
    public int solve(Node root){
         //add code here.
         
         if(root==null)
            return 0;
            
          int l=solve(root.left);
          int r=solve(root.right);
          
          int t=root.data;
          root.data=l+r;
          
          return t+root.data;
    }
}
