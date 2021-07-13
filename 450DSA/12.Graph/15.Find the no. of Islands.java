 int row[]={0,0,-1,1,1,1,-1,-1};
    int col[]={1,-1,0,0,1,-1,-1,1};
    int m,n,num;
    
    public int numIslands(char[][] grid)
    {
        
        num=0; m=grid.length; n=grid[0].length;

        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(grid[i][j]=='1')
                {
                    dfs(grid,i,j);
                    num++;
                }
            }
        }

        return num;
    }
    
    void dfs(char[][] grid,int r,int c)
    {
        grid[r][c]='2';
        
        for(int i=0;i<8;i++)
        {
            if(isValid(grid,r+row[i],c+col[i]))
                dfs(grid,r+row[i],c+col[i]);
        }
    }
    
    boolean isValid(char[][] grid,int r,int c)
    {
        if(r<0 || r>=m || c<0|| c>=n || grid[r][c]!='1')
            return false;

        return true;
    }
   
