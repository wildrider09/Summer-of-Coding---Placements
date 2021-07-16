class Solution
{
    boolean flag=false;
    int row[]={0,0,1,-1};
    int col[]={1,-1,0,0};
    
    public boolean is_Possible(int[][] grid)
    {
        // Code here
        int sx=0,sy=0,dx=0,dy=0,n=grid.length;
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(grid[i][j]==1)
                {   sx=i;sy=j;  }
                
                else if(grid[i][j]==2)
                {   dx=i;dy=j; }
            }
        }
        
        func(grid,sx,sy,dx,dy,n);
        
        return flag;
    }
    
    void func(int grid[][],int sx,int sy,int dx,int dy,int n)
    {
        
        if(sx==dx && sy==dy)
        {
            flag=true;
            return;
        }
        
        grid[sx][sy]=-1;
        
        for(int i=0;i<4;i++)
        {
            if(isValid(grid,sx+row[i],sy+col[i],n))
            {
                grid[sx+row[i]][sy+col[i]]=-1;
                func(grid,sx+row[i],sy+col[i],dx,dy,n);   
            }
        }
    }
    
    boolean isValid(int grid[][],int r,int c,int n)
    {
        if(r<0 || r>=n || c<0 || c>=n || flag==true || (grid[r][c]!=3 && grid[r][c]!=2))
            return false;
        return true;
    }
}
