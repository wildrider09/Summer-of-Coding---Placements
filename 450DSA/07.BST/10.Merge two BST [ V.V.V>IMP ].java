import java.util.*;
public class Solution {

   static TreeNode < Integer > mergeBST(TreeNode < Integer > root1, TreeNode < Integer > root2) {

       ArrayList<Integer> list1=new ArrayList<>();
       ArrayList<Integer> list2=new ArrayList<>();
       
       inorder(root1,list1);
       inorder(root2,list2);
       
       int arr[]=new int[list1.size()+list2.size()];
 	   int k=0,i=0,j=0;
       
       while(i<list1.size()&& j<list2.size())
       {
	  if(list1.get(i)>list2.get(j))
	  	arr[k++]=list2.get(j++);
	  else
	       	arr[k++]=list1.get(i++);
       }
  
       while(i<list1.size())
      		arr[k++]=list1.get(i++);
       while(j<list2.size())    
                arr[k++]=list2.get(j++);
      
       return build(arr,0,arr.length-1);
    }
    
    static void inorder(TreeNode<Integer> root,ArrayList<Integer>list)
    {
        if(root==null)
            return;
        inorder(root.left,list);
        list.add(root.data);
        inorder(root.right,list);
    }
    
    static TreeNode<Integer> build(int arr[],int start,int end)
    {
        TreeNode<Integer> temp=null;
        if(start<=end)
        {
            int mid=(start+end)/2;
            temp=new TreeNode(arr[mid]);
            temp.left=build(arr,start,mid-1);
            temp.right=build(arr,mid+1,end);
        }
        return temp;
    }
}
