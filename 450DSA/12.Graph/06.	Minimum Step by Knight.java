class Solution
{
    //Function to find out minimum steps Knight needs to reach target position.
    int row[]={-2,-1,1,2,2,1,-1,-2};
    int col[]={1,2,2,1,-1,-2,-2,-1};
    
    public int minStepToReachTarget(int KnightPos[], int Target[], int n)
    {
        // Code here
        Queue<int[]> q=new LinkedList<>(); 
        int chess[][]=new int[n][n];
        int p=0;
        
        q.add(new int[]{ KnightPos[0]-1 , KnightPos[1]-1});
        
        while(!q.isEmpty())
        {
            int []t=q.poll();
            
            for(int i=0;i<8;i++)
            {
                if(isValid(chess,t[0]+row[i],t[1]+col[i],n))
                {
                    chess[t[0]+row[i]][t[1]+col[i]]=chess[t[0]][t[1]]+1;
                    q.add(new int[]{t[0]+row[i],t[1]+col[i]});
                }
            }
        }
        
        
        
        return chess[Target[0]-1][Target[1]-1];
    }


    public boolean isValid(int chess[][],int r,int c,int n)
    {
        if(r<0 || r>=n || c<0 || c>=n || chess[r][c]!=0)
            return false;
        
        else
            return true;
    }

}
