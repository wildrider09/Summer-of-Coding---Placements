class Solution
{
    static int row[]={0,0,-1,1};
    static int col[]={1,-1,0,0};
    
    public int[][] nearest(int[][] grid)
    {
        int n=grid.length;
        int m=grid[0].length;
        Queue<int[]> q=new LinkedList<>();
        int dist[][]=new int[n][m];
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j]==1)
                {
                    dist[i][j]=0;
                    q.add(new int[]{i,j});
                }
                
                else
                    dist[i][j]=Integer.MAX_VALUE;
            }
        }
        
        while(!q.isEmpty())
        {
            int temp[]=q.poll();
            
            int x1=temp[0],y1=temp[1];
            
            for(int i=0;i<4;i++)
            {
                int x2=x1+row[i];
                int y2=y1+col[i];
                
                if(x2<n && y2<m && x2>=0 && y2>=0 && dist[x2][y2]>dist[x1][y1]+1)
                {
                    dist[x2][y2]=dist[x1][y1]+1;
                    q.add(new int[]{x2,y2});
                }
            }
        }
        
        return dist;
    }
}
