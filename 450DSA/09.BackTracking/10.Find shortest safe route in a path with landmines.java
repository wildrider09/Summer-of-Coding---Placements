import java.util.*;
public class Solution
{
    static int ans;
    public static int shortestPath(ArrayList<ArrayList<Integer>> field)
    {
        // Write your code here.
        ans=Integer.MAX_VALUE;
        int m=field.size();
        int n=field.get(0).size();
        
        int visited[][]=new int[m][n];
        int arr[][]=new int[m][n];
        
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(arr[i][j]==-1)
                	continue;
                
                arr[i][j]=field.get(i).get(j);
                if(arr[i][j]==0)
                {
                    if(i+1<m)	arr[i+1][j]=-1;   
                    if(i-1>=0)	arr[i-1][j]=-1;
                    if(j+1<n)	arr[i][j+1]=-1;   
                    if(j-1>=0)	arr[i][j-1]=-1;                    
                }
            }
        }
        
        for(int i=0;i<m;i++)
        {
            if(arr[i][0]==1)
        		func(arr,visited,m,n,i,0,0);
            if(ans==n-1)
                break;
        }
        if(ans==Integer.MAX_VALUE)	ans=-1;
       	return ans;
    }
    
    static void func(int arr[][],int visited[][],int m,int n,int sx,int sy,int path)
    {
        if(sx>=m || sy>=n || sx<0 || sy<0 || path>ans || arr[sx][sy]<1 || visited[sx][sy]==1)
            return;
        
        if(sy==n-1)
        {
            if(arr[sx][sy]==1 && visited[sx][sy]==0 && path<ans)
                ans=path;
           	return;
		}
        
        visited[sx][sy]=1;
        func(arr,visited,m,n,sx+1,sy,path+1);
        func(arr,visited,m,n,sx,sy+1,path+1);
        func(arr,visited,m,n,sx-1,sy,path+1);
        func(arr,visited,m,n,sx,sy-1,path+1); 
        visited[sx][sy]=0;

   }
}

