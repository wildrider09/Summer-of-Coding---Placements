
class GfG
{
    ArrayList<Integer> list;
    
    Node buildBalancedTree(Node root) 
    {
       
        list=new ArrayList<>();
        
        inorder(root);
        int arr[]=list.stream().mapToInt(Integer::intValue).toArray();
        
        return build(arr,0,arr.length-1);
        
    }
    
    void inorder(Node root)
    {
        if(root==null)
            return ;
            
        inorder(root.left);
        list.add(root.data);
        inorder(root.right);
    }
    
    Node build(int arr[],int start,int end)
    {
        Node temp=null;
        if(start<=end)
        {
            int mid=(start+end)/2;
            temp=new Node(arr[mid]);
            temp.left=build(arr,start,mid-1);
            temp.right=build(arr,mid+1,end);
        }
        return temp;
    }
}
