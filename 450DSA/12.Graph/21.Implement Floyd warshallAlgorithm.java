class Solution
{
    public void shortest_distance(int[][] matrix)
    {
        // Code here
        int n=matrix.length;
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==j)    continue;
                
                for(int k=0;k<n;k++)
                {
                    if(matrix[j][i]==-1 || matrix[i][k]==-1)
                        continue;
                        
                    if(matrix[j][k]==-1 || matrix[j][k]>matrix[j][i]+matrix[i][k])
                        matrix[j][k]=matrix[j][i]+matrix[i][k];
                }
            }
        }
    }
}
