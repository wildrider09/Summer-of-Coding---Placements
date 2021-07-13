import java.util.*;
public class Solution {
  	
    static ArrayList<ArrayList<Integer>> ans; 
        
    public static int[][] printAllPaths(int[][] mat, int m, int n) {
        // Write your code here
        ArrayList<Integer> list=new ArrayList<>();
       	ans=new ArrayList<>();
        
        func(mat,list,0,0,m-1,n-1);
        
        int[][] res=new int[ans.size()][m+n-1];
        
        for(int i=0;i<ans.size();i++)
        {
            for(int j=0;j<m+n-1;j++)
            {
                res[i][j]=ans.get(i).get(j);
			}
        }
        return res;
    }
    
    static void func(int mat[][],ArrayList<Integer> list,int sx,int sy,int dx,int dy)
    {
        if(sx>dx || sy>dy)
            return ;
        
        if(sx==dx && sy==dy)
        {
            list.add(mat[sx][sy]);
            ans.add(new ArrayList<>(list));
            list.remove(list.size()-1);
			return;
        }
        
        list.add(mat[sx][sy]);

        func(mat,list,sx+1,sy,dx,dy);
        func(mat,list,sx,sy+1,dx,dy);

        list.remove(list.size()-1);			
    }
}		

