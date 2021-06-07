

public class Solution {
    static int ans;
    public static int largestSubtreeSum(TreeNode<Integer> root) {
        // Write your code here.
    	ans=Integer.MIN_VALUE;
        if(root==null)
            return 0;
        solve(root);
        return ans;
    }
    static int solve(TreeNode<Integer> root)
    {
        if(root==null)
            return 0;
      
        int l=solve(root.left);
        int r=solve(root.right);
        int curr=root.data+l+r;
        
        if(ans<curr)
            ans=curr;
        
        return curr;
        
    }
}
