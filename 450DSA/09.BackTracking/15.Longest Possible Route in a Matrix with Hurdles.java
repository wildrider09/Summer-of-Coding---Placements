public class Solution {
    
    static int ans;
    public static int longestPath(int n, int m, int[][] mat, int sx, int sy, int dx, int dy) {
        // Write your code here
        int visited[][]=new int[n][m];
        ans=0;
        
        func(mat,visited,n,m,sx,sy,dx,dy,0);
        if(ans==0)
            ans=-1;
        return ans;
    }
    
    static void  func(int mat[][],int visited[][],int n,int m,int sx,int sy,int dx,int dy,int path)
    {
        if(sx>=n || sy>=m || sx<0 || sy<0)
            return;
        
        if(sx==dx && sy==dy)
        {
            if(path>ans)
                ans=path;
            return ;
		}
        
        if(mat[sx][sy]!=0 && visited[sx][sy]==0)
        {
        	visited[sx][sy]=1;
        	func(mat,visited,n,m,sx+1,sy,dx,dy,path+1);
            func(mat,visited,n,m,sx-1,sy,dx,dy,path+1);
            func(mat,visited,n,m,sx,sy+1,dx,dy,path+1);
            func(mat,visited,n,m,sx,sy-1,dx,dy,path+1); 
            visited[sx][sy]=0;
        }	
	}
}

