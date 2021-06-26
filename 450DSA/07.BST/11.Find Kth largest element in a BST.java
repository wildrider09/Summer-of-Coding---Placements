
class Solution
{
    // return the Kth largest element in the given BST rooted at 'root'
    int n=0,ans=-1;
    public int kthLargest(Node root,int K)
    {
        // Write your code here
        inorder(root,K);
        return ans;
    }

    void inorder(Node root,int k)
    {
        if(root==null)
            return ;
        
        inorder(root.right,k);      //highest first so traverse right
        
        n++;
        if(n==k)
            ans=root.data;
            
        inorder(root.left,k);
    }
   
}
