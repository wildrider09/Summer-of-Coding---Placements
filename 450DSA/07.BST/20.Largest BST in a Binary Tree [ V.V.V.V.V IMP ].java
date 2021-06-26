class Solution{
    
    static class BST{
        int size;
        int min;
        int max;
        boolean isBST;
        Node root;
        public BST()
        {
            size=0;
            min=Integer.MAX_VALUE;
            max=Integer.MIN_VALUE;
            isBST=true;
            root=null;
        }
    }
    // Return the size of the largest sub-tree which is also a BST
    static int largestBst(Node root)
    {
        
        if(root==null)
            return 0;
    
        BST ans=check(root);
        return ans.size;
    }
    static BST check(Node root)
    {
        if(root==null)
            return new BST();
        
        BST l=check(root.left);
        BST r=check(root.right);
        
        BST curr=new BST();
        
        curr.isBST= l.isBST && r.isBST && (root.data>l.max && root.data<r.min);
    
        curr.min=Math.min(root.data ,l.min);
    
        curr.max=Math.max(root.data ,r.max);
        
        if(curr.isBST)
            curr.size=l.size+r.size+1;
 
       else
            curr.size=Math.max(l.size,r.size);
    
        return curr;
    }
}
