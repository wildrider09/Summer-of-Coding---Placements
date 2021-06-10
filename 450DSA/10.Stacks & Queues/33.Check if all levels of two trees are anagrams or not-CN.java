import java.util.*;
public class Solution {
    public static boolean anagram(TreeNode<Integer> root1, int n, TreeNode<Integer> root2, int m) {
        // Write your code here
        String s1="";
        String s2="";
        
        Queue<TreeNode> queue1= new LinkedList<>();
        Queue<TreeNode> queue2= new LinkedList<>();
        
        if((root1==null && root2!=null) ||
           (root1!=null && root2==null))
        		return false;
        queue1.add(root1);
        queue2.add(root2);
        
        while(!queue1.isEmpty() && !queue2.isEmpty())
        {
            
            int count1=queue1.size();
            int count2=queue2.size();
            if(count1!=count2)
               	return false;
            
            s1="";s2="";
            for(int i=0;i<count1;i++)
            {
                TreeNode t1=queue1.remove();
                TreeNode t2=queue2.remove();
                
                s1+=t1.val;
                s2+=t2.val;
                
                if(t1.left!=null)
                    queue1.add(t1.left);
                    
                if(t1.right!=null)
                    queue1.add(t1.right);
                
                if(t2.left!=null)
                    queue2.add(t2.left);
                    
                if(t2.right!=null)
                    queue2.add(t2.right);
            }
            if((s1.length()!=s2.length()) || (!check(s1,s2)))
                return false; 
        }
        if(queue1.isEmpty() && queue2.isEmpty() )
        	return true;
        return false;
    }
    public static boolean check(String s1,String s2)
    {
        char a1[]=s1.toCharArray();
        char a2[]=s2.toCharArray();
        
        Arrays.sort(a1);
        Arrays.sort(a2);
        
        for(int i=0;i<a1.length;i++)
        {
            if(a1[i]!=a2[i])
                return false;
		}
        return true;
	}
}
