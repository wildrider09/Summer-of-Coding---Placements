class Solution
{
    // The given root is the root of the Binary Tree
    // Return the root of the generated BST
    ArrayList<Integer> list;
    int k;
    Node binaryTreeToBST(Node root)
    {
        k=0; list=new ArrayList<Integer>();
        preorderbinary(root);
        Collections.sort(list);
        inorder(root);
        return root;
    }
    
    void preorderbinary(Node root)
    {
        if(root==null)
            return;
            
        list.add(root.data);
        preorderbinary(root.left);
        preorderbinary(root.right);
    }
    
    void inorder(Node root)
    {
        if(root==null)
            return;
            
        inorder(root.left);
        root.data=list.get(k++);
        inorder(root.right);
    }
}
 
