
public class Solution
{
    static TreeNode<Integer> head,prev;   
    public static TreeNode<Integer> flatten(TreeNode<Integer> root)
    {
        head=null;prev=null;
        flat(root);
        return head;
    }
    
    public static void flat(TreeNode<Integer> root)
    {
        if(root==null)
            return;
        
        flat(root.left);
        
        if(prev==null)
        	head=root;
        else
        {
            prev.right=root;
			root.left=null;        
        }
        prev=root;
        
        flat(root.right);
	}
}



class Solution {
    public void flatten(TreeNode root) 
    {
        if(root==null)
            return;
        
        flatten(root.left);
        
        TreeNode rightNode = root.right;
        
        root.right =  root.left;
        root.left = null;
        
        while(root.right != null)
              root = root.right;
        
        root.right = rightNode;
        
        flatten(root.right);
        
	}
}


