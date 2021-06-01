class Solution {
    int totalSum = 0;
    public int sumNumbers(TreeNode root) {
        
       return solve(root, 0);
    }

    public int solve(TreeNode root, int curr) {
        if(root == null) {
            return 0;
        }
		curr = (curr * 10) + root.val;
        
        if(root.left == null && root.right == null)
            totalSum += curr;
            
        solve(root.left, curr);
        solve(root.right, curr);
        
        return totalSum;
    }
}
