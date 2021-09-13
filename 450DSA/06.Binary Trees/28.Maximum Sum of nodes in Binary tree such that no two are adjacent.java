import java.util.*;
public class Solution 
{
    public static int maximumSumOfNodes(TreeNode<Integer> root)
    {
        HashMap<TreeNode<Integer>,Integer>map=new HashMap<>();
        return solve(root,map);
    }
    static int solve(TreeNode<Integer> root, HashMap<TreeNode<Integer>,Integer>map)
    {
        if(root==null)
            return 0;

        if (root.left==null && root.right==null)
	    return root.data;
		
        if(map.get(root)!=null)
            return map.get(root);
        
        int incld=root.data;
        if(root.left!=null)
        {
	    incld+=solve(root.left.left,map);
            incld+=solve(root.left.right,map);
        }
        
        if(root.right!=null)
        {
	    incld+=solve(root.right.left,map);
            incld+=solve(root.right.right,map);
        }
        
        int excld=solve(root.left,map);
        excld+=solve(root.right,map);
        
        map.put(root,Math.max(excld,incld));
        
        return Math.max(excld,incld);
    }
}
