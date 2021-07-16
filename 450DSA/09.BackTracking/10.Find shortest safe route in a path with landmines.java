import java.util.*;
public class Solution
{
    static int row[]={0,1,-1,0},col[]={1,0,0,-1};
    
    public static int shortestPath(ArrayList<ArrayList<Integer>> field)
    {
        // Write your code here.
        int m=field.size(),n=field.get(0).size(),ans=Integer.MAX_VALUE;
     	int arr[][]=new int[m][n];
        Queue<int[]> q=new LinkedList<>(); 
        
        for(int i=0;i<m;i++)
        	for(int j=0;j<n;j++)
          		arr[i][j]=field.get(i).get(j);
            
        
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(arr[i][j]==-1 || arr[i][j]==1)
                	continue;
                else
                {
                    if(i+1<m && arr[i+1][j]!=0)		arr[i+1][j]=-1;   
                    if(i-1>=0 && arr[i-1][j]!=0)	arr[i-1][j]=-1;
                    if(j+1<n && arr[i][j+1]!=0)		arr[i][j+1]=-1;   
                    if(j-1>=0 && arr[i][j-1]!=0)	arr[i][j-1]=-1;                    
                }
            }
        }
        
        for(int k=0;k<m;k++)
        {
            if(arr[k][0]==-1 || arr[k][0]==0)
                continue;
            
            q.add(new int[]{k,0});        
        }
            
        while(!q.isEmpty())
        {
            int []t=q.poll();
                
            for(int i=0;i<4;i++)
            {    
                if(isValid(arr,t[0]+row[i],t[1]+col[i],m,n))
                {
                    if(t[1]+col[i]==0)
                        continue;
                   
                    if(t[1]+col[i]==n-1)
                    	return arr[t[0]][t[1]];
                    
                    else
                        arr[t[0]+row[i]][t[1]+col[i]]=arr[t[0]][t[1]]+1;

                    q.add(new int[]{t[0]+row[i],t[1]+col[i]});
                }
            }
            if(t[1]==0)
                arr[t[0]][t[1]]=0;
        }
        return -1;
    }
    
    public static boolean isValid(int arr[][],int r,int c,int m,int n)
    {
        if(r<0 || r>=m || c<0 || c>=n || arr[r][c]!=1 )
            return false;
        
        else
            return true;
    }

}
