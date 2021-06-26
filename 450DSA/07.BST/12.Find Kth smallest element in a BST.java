class Solution
{
    // Return the Kth smallest element in the given BST 
    int n=0,ans=-1;
    public int KthSmallestElement(Node root, int K) 
    {
        // Write your code here
        inorder(root,K);
        return ans;
    }
    void inorder(Node root,int k)
    {
        if(root==null)
            return ;
        
        inorder(root.left,k);
        
        n++;
        if(n==k)
            ans=root.data;
            
        inorder(root.right,k);
        
    }
}

