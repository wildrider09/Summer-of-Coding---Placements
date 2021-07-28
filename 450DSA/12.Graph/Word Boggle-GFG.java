class Solution
{
    int rows[]={1,-1,0,0,-1,-1,1,1};
    int cols[]={0,0,1,-1,-1,1,-1,1};
    
    public String[] wordBoggle(char board[][], String[] dictionary)
    {
        List<String> list=new ArrayList<>();
        
        for(String s:dictionary)
            if(func(board,s)==true)
                list.add(s);
        
        String[] arr = list.stream().toArray(String[] ::new);
        return arr;
        
    }
    
    public boolean func(char arr[][],String s)
    {
        
        int m=arr.length,n=arr[0].length;
        int visited[][]=new int[m][n];
        
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(arr[i][j]==s.charAt(0))
                {
                    if(DFS(arr,s,i,j,0,visited) == true)
                    {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    public boolean DFS(char board[][],String s,int i,int j,int index,int visited[][])
    {
        if(index==s.length())
            return true;
        
        if(isValid(board,i,j) && visited[i][j]==0 && board[i][j]==s.charAt(index) )
        {
            visited[i][j]=1;
            boolean flag=false;
            
            for(int k=0;k<8;k++)
            {
                flag=DFS(board,s,i+rows[k],j+cols[k],index+1,visited);
                if(flag==true)
                    return true;
            }
            
            visited[i][j]=0;
        }
        
        return false;
    }
    
    public boolean isValid(char board[][],int i,int j)
    {
        if(i>=0 && i<board.length && j>=0 && j<board[0].length)
            return true;
            
        return false;
    }
}
