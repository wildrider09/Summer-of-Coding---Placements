static int k;
public static Node constructTree(int preorder[], int size) 
{
    if(preorder.length==0)
        return null;
    
    k=0;    
    Node root=new Node(preorder[k++]);
        
    if(preorder.length==1)
        return root;
        
    build(root,preorder,Integer.MIN_VALUE,Integer.MAX_VALUE);
    return root;

    }
    
static void build(Node root,int preorder[],int min,int max)
{
    if(k<preorder.length && preorder[k]>min && preorder[k]<root.data)
    {
        root.left=new Node(preorder[k++]);
        build(root.left,preorder,min,root.data);
    }
    
    if(k<preorder.length && preorder[k]>root.data && preorder[k]<max)
    {
        root.right=new Node(preorder[k++]);
        build(root.right,preorder,root.data,max);
    }
    return ;
}
