class Solution{
    
    Node head=null,prev=null;
    public void populateNext(Node root){
        //code here
        inorder(root);
        root=head;
        
    }
    void inorder(Node root)
    {
        if(root==null)
            return;
        
        inorder(root.left);
        
        if(prev==null)
            head=root;
            
        else
            prev.next=root;
        
        prev=root;
        
        inorder(root.right);
        
    }
}
