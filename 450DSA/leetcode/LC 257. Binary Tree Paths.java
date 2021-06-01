class Solution {
       
    public List<String> binaryTreePaths(TreeNode root) {
       
        ArrayList<String> al=new ArrayList<>();
      
        solve(root,"",al);
        return al;
        
    }
    
    public void solve(TreeNode root,String s,ArrayList<String> al)
    {
              
        if(root==null)
            return;
        
        if(root.left==null && root.right==null)
        {
            s+=root.val;
            al.add(s);
            return;
        }
                
        solve(root.left,s+root.val+"->",al);
        solve(root.right,s+root.val+"->",al);
    }
}
   
