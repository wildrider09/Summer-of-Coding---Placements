public class Solution {
    ArrayList<Integer> al=new ArrayList<>();
    public int[] solve(TreeNode A, int B) {
        
        boolean t=solve1(A,B);
        Collections.reverse(al);
        int[] H1 = al.stream().mapToInt(Integer::intValue).toArray();
        return H1;
     
    }
    
    public boolean solve1(TreeNode root,int x)
    {
        if(root==null)
            return false;
            
        if(root.val==x)
        {
            al.add(root.val);
            return true;
        }
        boolean l=solve1(root.left,x);
        boolean r=solve1(root.right,x);
        
        if(l==true || r==true)
        {
            al.add(root.val);
            return true;
        }
            return false;
        
    }
}

