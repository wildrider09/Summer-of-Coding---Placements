class Solution
{
    static boolean flag;
    static int ans[][];
    
    static boolean SolveSudoku(int grid[][])
    {
        flag=false;
        ans=new int[9][9];
        funcSudoko(grid,0,0,9);
        return flag;
        
    }
    
    static void funcSudoko(int grid[][],int i,int j,int n)
    {
        if(flag==true)
            return;
            
        if(i==n)
        {
            for(int rowi=0;rowi<n;rowi++)
                for(int rowj=0;rowj<n;rowj++)
                    ans[rowi][rowj]=grid[rowi][rowj];
                
            flag=true;
            return ;
        }
        
        int ni=0,nj=0;
        
        if(j==n-1)
        {
            ni=i+1;
            nj=0;
        }
        
        else
        {
            ni=i;
            nj=j+1;
        }
        
        if(grid[i][j]!=0)
            funcSudoko(grid,ni,nj,n);
        
        else
            for(int pos=1;pos<=9;pos++)
            {
                if(isValid(grid,i,j,pos,n))
                {
                    grid[i][j]=pos;
                    funcSudoko(grid,ni,nj,n);
                    grid[i][j]=0;
                }
            }
    }
    
    
    
    
    static boolean isValid(int grid[][],int row,int col,int val,int n)
    {
        for(int i=0;i<n;i++)
        {
            if(grid[row][i]==val)
                return false;
        }
        
        for(int i=0;i<n;i++)
        {
            if(grid[i][col]==val)
                return false;
        }
        
        int grid_start_row=3*(row/3);
        int grid_start_col=3*(col/3);
        
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                if(grid[i+grid_start_row][j+grid_start_col]==val)
                {
                    return false;
                }
            }
        }
        
        return true;
    }
    
    static void printGrid (int grid[][])
    {
        // add your code here
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                System.out.print(ans[i][j]+" ");
            }
        }
    }
}
