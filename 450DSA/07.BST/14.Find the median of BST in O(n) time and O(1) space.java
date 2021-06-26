class Tree
{
    static int count,med,n;
    public static void findMedian(Node root)
    {
        // code here.
        count=0;med=0;n=0;
        inorder(root);
        median(root);
    }

    static void inorder(Node root)
    {
        if(root==null)
            return ;
        
        count++;
        inorder(root.left);
        inorder(root.right);
        
    }

    static void median(Node root)
    {
        if(root==null)
            return;
        
        median(root.left);
        
        ++n;
        
        if(count%2==0 && count/2==n)
            med+=root.data;
        
        if((count/2+1)==n)
        {
            med+=root.data;
            if(count%2==1)
                System.out.print(med);
            else if(med%2==0)
                System.out.print(med/2);
            else
                System.out.print(med/2.0);
        }
    
        median(root.right);
    }
    
}
