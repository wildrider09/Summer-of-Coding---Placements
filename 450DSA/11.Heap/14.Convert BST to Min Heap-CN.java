import java.util.*;
public class Solution {
    
    static ArrayList<Integer> list;
    static int i;
	
    public static BinaryTreeNode convertBST(BinaryTreeNode root) {
		// Write your code here.
        list=new ArrayList<>();
        i=0;
        inorder(root);
        preorder(root);
        return root;
	}
    static void inorder(BinaryTreeNode root)
    {
        if(root==null)
            return;
        inorder(root.left);
        list.add(root.data);
        inorder(root.right);
    }
    
    static void preorder(BinaryTreeNode root)
    {
        if(root==null)
            return;
        root.data=list.get(i++);
        preorder(root.left);
        preorder(root.right);
    }
    
}


