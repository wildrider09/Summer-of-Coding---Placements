class Solution
{
    //Function to insert a node in a BST.
    Node insert(Node root, int Key)
    {
        // your code here
        if(root==null)
            return new Node(Key);
        
        inorder(root,Key);
        
        return root;
    }
    
    void inorder(Node root,int key)
    {
        
        if(root.data==key)
            return ;
        
        if(root.data>key && root.left==null)
            root.left=new Node(key);
    
        else if(root.data<key && root.right==null)
            root.right=new Node(key);
        
        else if(root.data>key)
            inorder(root.left,key);
        
        else 
            inorder(root.right,key);
        
        
    }
}
