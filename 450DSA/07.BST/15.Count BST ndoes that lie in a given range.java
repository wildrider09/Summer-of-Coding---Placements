class Tree
{
    //Function to count number of nodes in BST that lie in the given range.
    int count;
    int getCount(Node root,int l, int h)
    {
        //Your code here
        count=0;
        inorder(root,l,h);
        return count;
    }
    void inorder(Node root,int l,int h)
    {
        if(root==null)
            return;
        
        inorder(root.left,l,h);
        
        if(root.data>=l && root.data<=h)
            count++;
        
        inorder(root.right,l,h);
    }
}

