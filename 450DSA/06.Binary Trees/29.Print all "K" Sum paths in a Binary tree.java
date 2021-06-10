class Solution {
    int count=0;
    
    public int pathSum(TreeNode root, int targetSum) {
        
        ArrayList<Integer> list=new ArrayList<Integer>();
        
        if(root==null)
            return 0;
        
        findPathSum(root,targetSum,list);
        
        return count;
    }
    
    void findPathSum(TreeNode root, int targetSum,ArrayList<Integer> list) {
        
        if(root==null)return;
        
        list.add(root.val);
        
        findPathSum(root.left , targetSum,list);
        findPathSum(root.right , targetSum,list);
        
        int sum=0;
        
        for(int i=list.size()-1;i>=0;i--)
        {
            sum+=list.get(i);
            if(sum==targetSum)
                count++;
        }
        
        list.remove(list.size()-1);
    }
}
