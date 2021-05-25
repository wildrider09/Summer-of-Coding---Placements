
class Solution
{
    public int LongestRepeatingSubsequence(String X)
    {
        // code here
        String Y=X;
        int n=X.length();
        int m=n;
        
        int t[][]=new int[1001][1001];
        
        for(int i=0;i<n+1;i++)
        {
            for(int j=0;j<m+1;j++)
            {
                if(i==0||j==0)
                    t[i][j]=0;
            }
        }
        
        for(int i=1;i<n+1;i++)
        {
            for(int j=1;j<m+1;j++)
            {
                if(X.charAt(i-1)==Y.charAt(j-1) && i!=j)
                    t[i][j]=1+t[i-1][j-1];
            
                else
                    t[i][j]=Math.max(t[i-1][j],t[i][j-1]);    
            }
        }
        
        return t[n][m];
        
    }
}